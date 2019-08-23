package JavaSessions;

public class StringConcepts
{
	public static void main(String args[])
	{
		String s = "  hello";
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('l',3));
		String s1 = "hello";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.trim());
		System.out.println(s.replace('l', 'k'));
		System.out.println(s.substring(6, 7));
		String s3 = "arul_sahay_raj";
		String st[] = s3.split("_");
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		
				
		
	}
}
