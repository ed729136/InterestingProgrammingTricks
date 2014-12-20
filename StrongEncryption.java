package encryption;

import java.lang.reflect.Field;

import org.jasypt.util.text.StrongTextEncryptor;

public class EncryptionStart
{

	public static void main( String[] args )
	{	
		
		try
		{ 
			Field field = Class.forName("javax.crypto.JceSecurity").
			getDeclaredField("isRestricted");
			field.setAccessible(true);
			field.set(null, java.lang.Boolean.FALSE); 
		} 
		
		catch (Exception ex){ ex.printStackTrace(); }
		
		StrongTextEncryptor cryptor = new StrongTextEncryptor();
		cryptor.setPassword( "cryptorPassword" );
			
		String text = "This is private text";
		System.out.println( text );
		
		text = cryptor.encrypt( text );
		System.out.println( text );
		text = cryptor.decrypt( text );
		System.out.println( text );
	}
}