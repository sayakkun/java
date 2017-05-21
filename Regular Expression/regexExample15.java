import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample15
{
	public static void main(String args[])
	{
		String text="Afdsgdhdg1 !@/";
		String pattern="[(.|\\s)\\D]*";
		Pattern patt=Pattern.compile(pattern);
		Matcher matcher=patt.matcher(text);
		boolean matchFoundFlag=matcher.matches();
		System.out.println("The text is "+((matchFoundFlag==true)?"":"not ")+"matched with the pattern");
	}
}
