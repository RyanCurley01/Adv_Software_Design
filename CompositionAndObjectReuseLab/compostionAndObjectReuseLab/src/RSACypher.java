import java.security.*;
import javax.crypto.*;

public class RSACypher extends AbstractCypher{
	// keyRing variable is declared at the class level so it is Black Diamond Full Composition
	private KeyPair keyRing;
	
	public RSACypher() throws Throwable{
		/* keyGen variable is declared 
		internally at the method level so it is a dependency */
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA"); 
		keyGen.initialize(2048);
		keyRing = keyGen.generateKeyPair();
		super.setCypher(Cipher.getInstance("RSA/ECB/PKCS1Padding"));
	}

	@Override
	public byte[] encrypt(byte[] plainText) throws Throwable {
		return super.encrypt(plainText, keyRing.getPublic());
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		return super.decrypt(cypherText, keyRing.getPrivate());
	}
}