package ie.atu.sw;

public sealed interface NumberOps extends Numberfier permits Retainer {
	public abstract String clip(Object obj, int max);
	public abstract int mask(int number, int mask);
	public abstract int divideByTwo(int number);
	public abstract int multiplyByTwo(int number);

}
