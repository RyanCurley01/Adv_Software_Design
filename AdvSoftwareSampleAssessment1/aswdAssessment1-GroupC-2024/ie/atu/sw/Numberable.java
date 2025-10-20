package ie.atu.sw;

public sealed interface Numberable permits Numberfier
{
	public abstract String clip(Object obj, int max);
	public abstract int mask(int number, int mask);
	public abstract int divideByTwo(int number);
	public abstract int multiplyByTwo(int number);
	public abstract CharSequence clip(CharSequence s);
	public abstract int reverseIf(int num);
}
