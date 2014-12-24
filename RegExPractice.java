import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
 * Was looking for a program to do and stumbled upon a website with multiple ideas
 * 
 * http://www.dreamincode.net/forums/topic/78802-martyr2s-mega-project-ideas-list/
 * 
 * Count Vowels – Enter a string and the program counts the number of vowels in the text. For 
 * added complexity have it report a sum of each vowel found. Solved this problem solving regular expressions.
 * Regular expressions are used as a way to validate data.
 * 
 */

//This function uses a regular expression to find all vowels both upper case and lower case and counts all occurences 
public class RegExPractice
{
	public static void regEx()
	{
		String str = "This is a sentence";
		String charsToLookFor = "[aeiouAEIOU]";
		Pattern pattern = Pattern.compile( charsToLookFor );
		Matcher match = pattern.matcher( str );
		int count = 0;
		
		while( match.find() )
		{
			count++;
			//System.out.println( "Found match at: " + match.start() );
			//System.out.println( "Match: " + match.group() );
		}
		System.out.println( "There are " + count + " vowels in this sentence" );
	}
	
	public static void main( String[] args )
	{
		regEx();
	}
}