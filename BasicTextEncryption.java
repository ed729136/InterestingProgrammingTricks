package encryption;

import org.jasypt.util.text.BasicTextEncryptor;

public class EncryptionStart
{

	public static void main( String[] args )
	{
		BasicTextEncryptor cryptor = new BasicTextEncryptor();
		cryptor.setPassword( "cryptorPassword" );
		
		
		String text = "This is private text";
		System.out.println( text );
		
		text = cryptor.encrypt( text );
		System.out.println( text );
		text = cryptor.decrypt( text );
		System.out.println( text );
	}
}