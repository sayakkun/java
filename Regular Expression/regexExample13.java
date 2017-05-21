import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample13
{
	public static void main(String args[])throws IOException
	{
		String text="SDaft12asdaftt537";
		String patt="[A-Za-z\\d]*";
		Pattern pattern=Pattern.compile(patt);
		Matcher matcher=pattern.matcher(test);
		boolean patternFoundFlag=matcher.matches();
		System.out.println("The pattern is "+((patternFoundFlag==true)?"":"not ")+"found in the text");
	}
}
