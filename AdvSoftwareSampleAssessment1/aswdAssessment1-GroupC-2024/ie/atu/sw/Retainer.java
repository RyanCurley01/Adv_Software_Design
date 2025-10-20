package ie.atu.sw;

public final class Retainer  { //Ideally should only be one Retainer in the system
	//There is a high likelihood that of more objects like these being retained in the future...
		
	public Object retain(Info info, String val) {
		switch (info) {

		default -> throw new IllegalArgumentException("Unexpected value: " + info);
		}
	}
}