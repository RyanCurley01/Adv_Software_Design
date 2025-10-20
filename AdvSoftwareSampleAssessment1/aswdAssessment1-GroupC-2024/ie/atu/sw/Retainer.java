package ie.atu.sw;

public final class Retainer  { //Ideally should only be one Retainer in the system
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
}