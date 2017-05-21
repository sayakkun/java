import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample14
{
	public static void main(String args[])
	{
		String text="safafaacaAA1";
		String patt="[A-Za-z\\D]*";
		Pattern pattern=Pattern.compile(patt);
		Matcher matcher=pattern.matcher(text);
		Boolean patternFoundFlag=matcher.matches();
		System.out.println("The pattern is "+((patternFoundFlag==true)?"":"not ")+"found in the text");
	}
}
