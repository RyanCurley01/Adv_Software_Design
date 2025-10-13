import java.security.Key;

/**
 * Cypherable
 * 
 * This interface was extracted from AbstractCypher during refactoring.
 * It defines a high-level contract for encryption and decryption.
 * 
 * Impact on design:
 * - Enables polymorphism: Runner and other client code depend on this interface
 *   rather than concrete implementations.
 * - Supports Dependency Inversion: Runner is decoupled
 *   from specific cipher algorithms.
 */
public interface Cypherable {

	byte[] encrypt(byte[] plainText) throws Throwable;

	byte[] decrypt(byte[] cypherText) throws Throwable;

	byte[] encrypt(byte[] plainText, Key key) throws Throwable;

	byte[] decrypt(byte[] cypherText, Key key) throws Throwable;

}