package ie.atu.sw;

public final class Retainer implements Stringable, Numberable { //Ideally should only be one Retainer in the system
	//There is a high likelihood that of more objects like these being retained in the future...
	private Stringable stringifier = new Stringifier();
	private Numberable numberfier = new Numberfier();
		
	public Object retain(Info info, String val) {
		switch (info) {
		case READY -> {
			return stringifier.process(val);
		}
		case ON_HOLD -> {
			return stringifier.constrain(val);
		}
		case SUSPENDED -> {
			return numberfier.clip(val, 10);
		}
		case DEPRECATED -> {
			return stringifier.doXOR(new StringBuffer(val));
		}
		case REMOVED -> {
			return numberfier.clip((CharSequence) val);
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + info);
		}
	}

	/* Implements Stringable by delegating to the composed Stringable */

	@Override
	public String process(String s) {
		return stringifier.process(s);
	}

	@Override
	public String doXOR(StringBuffer buf) {
		return stringifier.doXOR(buf);
	}

	@Override
	public Object stringfy(Object obj) {
		return stringifier.stringfy(obj);
	}

	@Override
	public String constrain(String s) {
		return stringifier.constrain(s);
	}

	/* Implements Numberable by delegating to the composed Numberable */

	@Override
	public String clip(Object obj, int max) {
		return numberfier.clip(obj, max);
	}

	@Override
	public int mask(int number, int mask) {
		return numberfier.mask(number, mask);
	}

	@Override
	public int divideByTwo(int number) {
		return numberfier.divideByTwo(number);
	}

	@Override
	public int multiplyByTwo(int number) {
		return numberfier.multiplyByTwo(number);
	}

	@Override
	public CharSequence clip(CharSequence s) {
		return numberfier.clip(s);
	}

	@Override
	public int reverseIf(int num) {
		return numberfier.reverseIf(num);
	}
	
	public static void main(String[] args) {
		Retainer retainer = new Retainer();
		
		String testValue = "Hello World";
		
		for (Info info : Info.values()) {
			System.out.println("Info: " + info + " (" + info.code() + " - " + info.msg() + ")");
			try {
				Object result = retainer.retain(info, testValue);
				System.out.println("  Result: " + result);
			} catch (Exception e) {
				System.out.println("  Error: " + e.getMessage());
			}
			System.out.println();
		}
	}
}