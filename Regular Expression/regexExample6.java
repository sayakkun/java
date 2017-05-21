import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample6
{
	public static void main(String args[])
	{
		String str="a";
		String pat="[abc]";
		Pattern pattern=Pattern.compile(pat);
		Matcher matcher=pattern.matcher(str);
		Boolean patternFoundFlag=matcher.matches();
		System.out.println("The pattern is "+((patternFoundFlag==true)?"":"not ")+"found in the flag");
	}
}
