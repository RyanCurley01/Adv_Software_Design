public class StringCypherKey implements CypherKey
{
	private String key;
	
	public StringCypherKey(String key) {
		super();
		this.key = key;
	}
	
	@Override
	public void setPattern(String key) throws CypherException {
		this.key = key;
	}

	@Override
	public String getPattern() {
		return "" + key;
	}

}
