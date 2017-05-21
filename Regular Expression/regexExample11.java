import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample11
{
	public static void main(String args[])	
	{
		String text="asadaFA1eqefewase";
		String  patternToBeMatched="[a-zA-Z0-9]{7,18}";
		Pattern pattern=Pattern.compile(patternToBeMatched);
		Matcher matcher=pattern.matcher(text);
		boolean patternfoundflag=matcher.matches();
		System.out.println("The pattern is "+((patternfoundflag==true)?"":"not ")+"found in the text");
	}
}


