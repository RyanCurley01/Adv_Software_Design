package ie.atu.sw;

public final class Retainer implements NumberOps, Stringable { //Ideally should only be one Retainer in the system
	//There is a high likelihood that of more objects like these being retained in the future...
		
	public Object retain(Info info, String val) {
		switch (info) {
			
		default -> throw new IllegalArgumentException("Unexpected value: " + info);
		}
	}

	@Override
	public String constrain(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String stringfy(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String clip(Object obj, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int mask(int number, int mask) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divideByTwo(int number) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiplyByTwo(int number) {
		// TODO Auto-generated method stub
		return 0;
	}
}