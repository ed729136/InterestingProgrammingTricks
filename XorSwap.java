public class XorSwap
{
	//This shows how to effectively swap two numbers without using a temporary variable, instead it uses three xors
	public static void swap( int number1, int number2 )
	{
		System.out.println( "This is the first number: " + number1 + "\nThis is the second number: " + number2 );
		number1 ^= number2;
		number2 ^= number1;
		number1 ^= number2;
		System.out.println( "\n" + "This is the first number: " + number1 + "\nThis is the second number: " + number2 );
	}
	
	public static void main( String[] args )
	{
		swap( 14, 3 );
	}
}