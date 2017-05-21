import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample12
{
	public static void main(String args[])
	{
		String text1="dsgdye5tsfsgterffaereefgafdfgaEEHRTEREAFGDFGQAA\r\fdsfg \n";
		String pat1="(.|\\s)*";
		Pattern pattern=Pattern.compile(pat1);
		Matcher matcher=pattern.matcher(text1);
		boolean patternFoundFlag=matcher.matches();
		System.out.println("The pattern is "+((patternFoundFlag==true)?"":"not ")+"found in text");
	}
}
