import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample18
{
	public static void main(String args[])
	{
			 String REGEX = "(^cat|cat$)";
			 String INPUT = "cat cat cat cattie cat";
     			 Pattern p = Pattern.compile(REGEX);
     			 Matcher m = p.matcher(INPUT);   // get a matcher object
      			 int count = 0;
      			 while(m.find()) 
			 {
        			 count++;
         			 System.out.println("Match number "+count);
        			 System.out.println("start(): "+m.start());
         			 System.out.println("end(): "+m.end());
      			}
	}
}

