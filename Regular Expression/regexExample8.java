import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample8
{
	public static void main(String args[])
	{
		String text="ssbfsdgdaytefqrhwerrsndkeghgdsqqwrtyhvmdehj";
		String patt="[a-z&&[^bc]]*";
		//this pattern tells it will match a string containing only small characters except b and c
		//So, if the string contains any of b and c, pattern will not match		
		Pattern pattern=Pattern.compile(patt);
		Matcher matcher=pattern.matcher(text);
		boolean patternfoundflag=matcher.matches();
		System.out.println("The pattern is "+((patternfoundflag==true)?"":"not ")+"found in the flag");
		
	}
}
