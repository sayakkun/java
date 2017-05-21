import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample2
{
	public static void main(String args[])
	{
		String text1="http://pattern";
		//text1 will be the string which will be searched for "http://pattern" at the end 
		String patternToBeSearched="http://pattern$";
		Pattern pattern=Pattern.compile(patternToBeSearched);
		Matcher matcher=pattern.matcher(text1);
		Boolean foundFlag=matcher.matches();
		System.out.println("The pattern is "+((foundFlag==true)?"":"not ")+"found in the text");
	}
}
