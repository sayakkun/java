import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample21
{
	public static void main(String args[])
	{
		String toFind="dog";
		String input="The dog says mew. All dogs say mew";
		String toReplace="cat";
		Pattern pattern=Pattern.compile(toFind);
		Matcher matcher=pattern.matcher(input);
		String output=matcher.replaceAll(toReplace);
		System.out.println(output);
	}
}
