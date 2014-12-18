public class IsNumberPowerOf2
{
	//This simple program finds if a number is a power of 2, if it is return true false otherwise
	public static boolean PowerOf2( int number1 )
	{
		boolean flag = ( number1 & number1 - 1 )  == 0;
		System.out.println( flag );
		return flag;
	}
	
	public static void main( String[] args )
	{
		PowerOf2( 32 );
	}
}