import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample16
{
	public static void main(String args[])
	{
		String text="I am Sayak-1";
		String pat="(\\w|\\s)*";
		Pattern pattern=Pattern.compile(pat);
		Matcher matcher=pattern.matcher(text);
		boolean patternfoundflag=matcher.matches();
		System.out.println("the pattern is "+((patternfoundflag==true)?"":"not ")+"found in the text");
	}
}
