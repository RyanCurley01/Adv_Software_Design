import java.security.Key;

import javax.crypto.Cipher;

/**
 * AbstractCypher
 * 
 * This abstract superclass was extracted from RSACypher using refactoring.
 * It centralizes reusable cryptographic logic (encryption/decryption with a Cipher),
 * while leaving algorithm-specific key handling to subclasses (e.g., RSA, AES, DES).
 * 
 * Impact on design:
 * - Improves maintainability by removing duplicate code across cipher classes.
 * - Enables Open/Closed Principle (easy to add new ciphers without changing existing code).
 * - Enforces a consistent contract using abstract methods encrypt() and decrypt().
 */
public abstract class AbstractCypher implements Cypherable {

	private Cipher cypher;

	public AbstractCypher() {
		super();
	}
	
	@Override
	public abstract byte[] encrypt(byte[] plainText) throws Throwable;	
	@Override
	public abstract byte[] decrypt(byte[] cypherText) throws Throwable;


	@Override
	public byte[] encrypt(byte[] plainText, Key key) throws Throwable {
		getCypher().init(Cipher.ENCRYPT_MODE, key);
		return getCypher().doFinal(plainText);
	}

	@Override
	public byte[] decrypt(byte[] cypherText, Key key) throws Throwable {
		getCypher().init(Cipher.DECRYPT_MODE, key);
		return getCypher().doFinal(cypherText);
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	protected Cipher getCypher() {
		return cypher;
	}

	protected void setCypher(Cipher cypher) {
		this.cypher = cypher;
	}

}