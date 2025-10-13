
public class VernamCypher extends AbstractCypher implements Cypherable
{
	public byte[] doCypher (byte[] bytes, boolean encrypt) throws CypherException
	{
		String key = super.getCypherKey().getPattern();
		for (int i = 0; i < bytes.length; i++)
		{
			bytes[i] = (byte) (bytes[i] ^ key.charAt(i % key.length()));
		}
		return bytes;	
	}
}
