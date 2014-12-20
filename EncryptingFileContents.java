package encryption;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

import org.jasypt.util.text.StrongTextEncryptor;

public class EncryptionStart
{
	static File file = new File( "C:/Users/Edwin/Desktop/file.txt" );
	
	public static void write()
	{
		String writeToFile = "This is a string of text";
		
		// if file doesnt exists, then create it
		if ( !file.exists() )
		{
			try{ file.createNewFile(); } 
			catch (IOException e) { e.printStackTrace(); }
		}
		
		FileWriter fw;
		try
		{
			fw = new FileWriter( file.getAbsoluteFile() );
			BufferedWriter bw = new BufferedWriter( fw );
			bw.write( writeToFile );
			bw.close();
		} 
		catch (IOException e) { e.printStackTrace(); }
	}
	
	public static String read( )
	{
		String line = null;
		ArrayList< String > list = new ArrayList< String >();
		
		try
		{
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader( file );

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader( fileReader );

            while( ( line = bufferedReader.readLine() ) != null )
            {
            	list.add( line );
                System.out.println( list );
            }    

            // Always close files.
            bufferedReader.close();            
        }
		catch(IOException ex){}
		return list.toString();
	}
	
	public static void encryption()
	{
		try
		{ 
			Field field = Class.forName( "javax.crypto.JceSecurity" ).
			getDeclaredField( "isRestricted" );
			field.setAccessible( true );
			field.set( null, java.lang.Boolean.FALSE ); 
		}
		
		catch ( Exception ex ){ ex.printStackTrace(); }
		
		StrongTextEncryptor cryptor = new StrongTextEncryptor();
		cryptor.setPassword( "cryptorPassword" );
			
		String text = read();
		System.out.println( text );
		
		text = cryptor.encrypt( text );
		System.out.println( text );
		text = cryptor.decrypt( text );
		System.out.println( text );
	}

	public static void main( String[] args ) throws IOException
	{	
		//write();
		read();
		encryption();
	}
}