package JavaSessions;

public class Loops {
	
	public static void main(String[] args) 
	{
		
	for( int i1=20;i1<=100;i1++)
	{
		System.out.println(i1);
	}
	System.out.println("^^^^^");
	
	for(int j =10; j>0; j--)
	{
		System.out.println(j);

	
	}		
	
	System.out.println("-----");
	int o=10;
	while(o>0)
	{
		System.out.println(o);
		o--;
	}
	System.out.println("----");
	
	int p = 1;
	while(p<=10)
	{
		System.out.println(p);
		p++;
	}
	
	System.out.println("====");
	
	for(int q=10; q>0; q--)
	{
		System.out.println(q);
		
		
	}
	
	int ar = 1;
	 int ar1 = ar++;
	 System.out.println(ar);
	 System.out.println(ar1);
	 int a = 10;
		int b = 20;
		String s = "hello";
		String s1 = "world";
		System.out.println(a+b+s+s1);
		System.out.println(s+s1+a+b);
		System.out.println(s+s1+(a+b));
		System.out.println("sum of a and b :" + (a+b));

	}
	
}
