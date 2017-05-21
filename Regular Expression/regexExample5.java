import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample5
{
	public static void main(String args[])
	{
		String text="This string is ended with newline\n";
		String patternToBeMatched="(.|\n)*";
		Pattern pattern=Pattern.compile(patternToBeMatched);
		Matcher matcher=pattern.matcher(text);
		boolean foundflag=matcher.matches();
		System.out.println("The pattern is "+((foundflag==true)?"":"not ")+"found in the text");
	}
}

