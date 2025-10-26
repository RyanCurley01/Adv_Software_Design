package ie.atu.sw;

public non-sealed class Numberfier implements Numberable 
{
	char remove = 'a';
	int THRESHOLD = 42; 
	
	public String clip(Object obj, int max) {
		var s = obj.toString();
		return s.length() > max ? s.substring(0, max) : s; 
	}
	
	//Masks an integer using a bitwise AND
	public int mask(int number, int mask) {
	    return number & mask;
	}
	
	//Quick divide by 2 using a bit shift
	public int divideByTwo(int number) {
		return number >> 1;
	}
	
	//Quick multiply by 2 using a bit shift
	public int multiplyByTwo(int number) {
		return number << 1;
	}
	
	public CharSequence clip(CharSequence s)
	{
		var builder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != remove) builder.append(s.charAt(i));
		}
		return builder.toString();
	}
	
	public int reverseIf(int num)
	{
		return num > THRESHOLD ? Integer.reverse(num) : num;
	}
}
