import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample4
{
	public static void main(String args[])
	{
		String text="http://pattern is meant to be found at the beginning of the string";
		String patternToBeSearched="^http://pattern.*";
		Pattern pattern=Pattern.compile(patternToBeSearched);
		Matcher matcher=pattern.matcher(text);
		//this tries to match the pattern in the text
		boolean matchfoundflag=matcher.matches();
		System.out.println("The pattern is "+ ((matchfoundflag==true)?"":"not ")+"found in the text");
	}
}
