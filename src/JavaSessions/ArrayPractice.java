package JavaSessions;

import java.util.ArrayList;

public class ArrayPractice {

	public static void main(String[] args)
	{
		int i[] = {0,1,2};
		//i[0] = 10;
		//i[1] = 20;
		//i[2] = 30;
		/*for(int j:i)
		{
			System.out.println(j);
		}*/
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		String s[] = new String[2];
		s[1] = "str";
		System.out.println(s[1]);
		for( int j=0; j<s.length; j++)
		{
			System.out.println(s[j]);
			
		}
		
		ArrayList ar = new ArrayList();
		ar.add("str1");
		ar.add('d');
		ar.add(1);
		
		for(int i1=0; i1<ar.size(); i1++)
		{
			System.out.println(ar.get(i1));
		}
		
		for(Object i1:ar)
		{
			System.out.println(i1);
		}
		
		int d[] = new int[2];
		int[] e = {1,2};
		System.out.println(e[0] + e[1]);
		for(int o=0;o<e.length; o++)
		{
			System.out.println(e[o]);
		}
		
		for(int as:e)
		{
			System.out.println(as);
		}
		
		ArrayList ar1 = new ArrayList();
		ar1.add("st");
		ar1.add(1);
		
		for(Object as:ar1)
		{
			System.out.println(as);
		}
		
		for(int p=0; p<ar1.size(); p++)
		{
			System.out.println(ar1.get(p));
		}
	}}