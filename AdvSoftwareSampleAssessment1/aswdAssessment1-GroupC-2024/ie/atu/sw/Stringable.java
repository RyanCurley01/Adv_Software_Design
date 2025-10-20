package ie.atu.sw;

public sealed interface Stringable permits Stringifier 
{
	public abstract String process(String s);
	public abstract String doXOR(StringBuffer buf);
	public abstract Object stringfy(Object obj);
	public abstract String constrain(String s);
}
