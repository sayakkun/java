import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample10
{
	public static void main(String args[])
	{
		//Now, let's expolore the union property in regex
		String text="adssdhgjkjgfgxyz";
		String pat="[a-s[x-z]]*";
		//Now, pattern says if a string consists characters from a-s or x-z 
		Pattern pattern=Pattern.compile(pat);
		Matcher matcher=pattern.matcher(text);
		boolean patternfoundflag=matcher.matches();
		System.out.println("The pattern is "+((patternfoundflag==true)?"":"not ")+"found in the text");
		String pat2="[a-sx-z]*";
		Pattern pattern2=Pattern.compile(pat2);
		Matcher matcher2=pattern2.matcher(text);
		boolean patternfoundflag2=matcher2.matches();
		System.out.println("The pattern is "+((patternfoundflag2==true)?"":"not ")+"found in the text");
	
		
	}
}

