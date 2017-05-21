import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample7
{
	public static void main(String args[])
	{
		String text="fsdsgbavafaaaaa";
		String pat="[^abc]*";
		Pattern pattern=Pattern.compile(pat);
		Matcher matcher=pattern.matcher(text);
		boolean patternFoundFlag=matcher.matches();
		System.out.println("The pattern is "+((patternFoundFlag==true)?"":"not ")+"found in the text");		
	}
}
