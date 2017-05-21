import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample3
{
	public static void main(String args[])
	{
		String text1="The String will be searched for http://pattern at the end";
		String text2="The String wll be searched for http://pattern";
		String patternToBeSearched=".*http://pattern$";
		Pattern pattern=Pattern.compile(patternToBeSearched);
		Matcher stringToBeChecked1=pattern.matcher(text1);
		//Now, matcher is the function which tries to match the patternToBeSearched indicated by pattern with the text text1
		boolean foundFlag=stringToBeChecked1.matches();
		System.out.println("The pattern is "+((foundFlag==true)?"":"not ")+"found in the text");
		Matcher stringToBeChecked2=pattern.matcher(text2);
		foundFlag=stringToBeChecked2.matches();
		System.out.println("The pattern is "+((foundFlag==true)?"":"not ")+"found in the text");
	}
}

