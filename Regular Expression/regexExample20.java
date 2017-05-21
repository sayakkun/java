import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Mainsclass
{
	public static void main(String args[])
	{
		String regex="bar";
		String charSeq="barrrrrrrrrr";
		Pattern pattern=Pattern.compile(regex);	
		Matcher matcher=pattern.matcher(charSeq);
		System.out.println("The charseq is "+((matcher.matches()==true)?"":"not ")+"matched with the regex");
		System.out.println("The charseq is "+((matcher.lookingAt()==true)?"":"not ")+"partially matched with the regex");
		
	}
}

