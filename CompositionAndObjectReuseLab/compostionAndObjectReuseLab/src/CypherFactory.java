/**
 * CypherFactory
 *
 * Implements the Factory + Singleton patterns to centralize cipher creation.
 *
 * Impact on design:
 * - Decouples client code (Runner) from specific cipher implementations.
 * - Simplifies maintenance: adding new ciphers requires changes only in this class.
 * - Supports Open/Closed Principle and Dependency Inversion.
 *
 */
public class CypherFactory {
	private static CypherFactory cf = new CypherFactory();

	private CypherFactory() {

	}

	public static CypherFactory getInstance() {
		return cf;
	}

	public Cypherable getCypher(Cypher type) throws Throwable 
	{		
		return switch (type) 
		{
			case DES -> new SymmetricCypher("DES", 56, "DES/ECB/PKCS5Padding");
			case TripleDES -> new SymmetricCypher("DESede", 168, "DESede/ECB/PKCS5Padding");
			case RSA -> new RSACypher();
			default -> new SymmetricCypher("AES", 128, "AES/ECB/PKCS5Padding");
		};
	}
}
