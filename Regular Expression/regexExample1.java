import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample
{
	public static void main(String args[])
	{
		String text="This is the text to be searched for http://pattern.";
		String patternString=".*http://.*";
		/*
		*If any string contains http:// at any position, patternString will find a possile match with it
		*as we used .* in the beginning
		*as well as in the end*/	
		Pattern pattern=Pattern.compile(patternString);
		/*Now, Pattern class or java.util.regex.Pattern does not have any constructor. It has static methods to create pattern.
		One of the function is compile*/
		Matcher matcher = pattern.matcher(text);
		boolean matches=matcher.matches();
		System.out.println("The pattern is "+((matches==true)?"":"not ")+"found in the text");		
	}
}
