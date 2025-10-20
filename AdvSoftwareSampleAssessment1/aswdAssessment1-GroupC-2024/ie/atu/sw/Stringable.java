package ie.atu.sw;

public sealed interface Stringable permits Retainer, Stringifier
{
	public abstract String stringfy(String s);

	public abstract String constrain(String s);
}
