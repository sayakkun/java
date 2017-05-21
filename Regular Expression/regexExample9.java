import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample9
{
	public static void main(String args[])
	{
		String text="ssbfsdgdaytefqrhwerrsndkeghgdsqqwrtyhvmdehj";
		String patt="[a-z&&[^b-d]]*";
		//this pattern tells it will match a string containing only small characters except b and c and d
		//So, if the string contains any of b and c and d, pattern will not match		
		Pattern pattern=Pattern.compile(patt);
		Matcher matcher=pattern.matcher(text);
		boolean patternfoundflag=matcher.matches();
		System.out.println("The pattern is "+((patternfoundflag==true)?"":"not ")+"found in the flag");
		
	}
}
