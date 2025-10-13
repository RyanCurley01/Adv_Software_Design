public abstract class AbstractCypher 
{
	protected CypherKey key;
	
	public AbstractCypher() {
		super();
	}
	
	public abstract byte[] doCypher(byte[] bytes, boolean encrypt) throws CypherException;
	
	public byte[] encrypt(byte[] plainText) throws CypherException {
		return doCypher(plainText, true);		
	}
	
	public byte[] decrypt(byte[] cypherText) throws CypherException {
		return doCypher(cypherText, false);		
	}

	public CypherKey getCypherKey()
	{
		return key;
	}
	
	public void setCypherKey (CypherKey key)
	{
		this.key = key;
	}
}
