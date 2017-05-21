import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample19
{
	public static void main(String args[])
	{
		String text="[name]";
		String patt1="[name]";
		//the arbitrary character sequence 
		String patt2="\\Q[name]\\E";
		Pattern pattern1=Pattern.compile(patt1);
		Pattern pattern2=Pattern.compile(patt2);
		Matcher matcher1=pattern1.matcher(text); 
		Matcher matcher2=pattern2.matcher(text);
		boolean patternMatchesFlag=matcher1.matches();
		System.out.println("Text is "+((patternMatchesFlag==true)?"":"not ")+"matched against patt1");
		patternMatchesFlag=matcher2.matches();
		System.out.println("Text is "+((patternMatchesFlag==true)?"":"not ")+"matched against pat2");	
	}
}

