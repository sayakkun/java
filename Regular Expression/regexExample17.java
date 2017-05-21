import java.util.regex.Pattern;
import java.util.regex.Matcher;
class MatcherExample17
{
	public static void main(String args[])
	{
		String ipAddress="192.168.142.256";
		String ipAddressPattern="(\\d{3}).(\\d{3}).(\\d{3}).(\\d{3})";
		Pattern pattern=Pattern.compile(ipAddressPattern);
		Matcher matcher=pattern.matcher(ipAddress);
		if(matcher.matches())
		{
			int firstOctet=Integer.parseInt(matcher.group(1));
			int secondOctet=Integer.parseInt(matcher.group(2));
			int thirdOctet=Integer.parseInt(matcher.group(3));
			int fourthOctet=Integer.parseInt(matcher.group(4));
			System.out.println("First octet: "+firstOctet+" Second octet: "+secondOctet+" Third octet: "+thirdOctet+" Fourth Octet: "+fourthOctet);
			if((firstOctet>=0&&firstOctet<=255)&&(secondOctet>=0&&secondOctet<=255)&&(thirdOctet>=0&&thirdOctet<=255)&&
			(fourthOctet>=0&&fourthOctet<=255))
			{		
				System.out.println("The ipaddress is a valid address");
			}
			else
			{
				System.out.println("The ipaddress is not a valid address");
			}
		}
		else
		{
			System.out.println("The ipaddress is not a valid address");
		}
	}
}

