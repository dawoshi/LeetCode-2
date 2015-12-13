package loj;

public class LOJ_67 
{
	public String reverse(String s)			//reverse the given string
	{
		String t = "";
		for(int i = s.length() - 1; i >= 0; i--)
		{
			t += s.charAt(i);
		}
		return t;
	}
	
	public String addBinary(String a, String b)
	{
		int la = a.length(), lb = b.length(), l = 0;
		int carry = 0, num = 0;
		String c = "";
		
		a = reverse(a);			//reverse the string a
		b = reverse(b);			//reverse the string b
		if(la > lb)				//add '0' to the shorter string to make their length the same 
		{
			l = la;
			for(int t = 1; t <= la - lb; t++)
			{
				b += '0';
			}
		}
		else
		{
			l = lb;
			for(int t = 1; t <= lb - la; t++)
			{
				a += '0';
			}
		}
		for(int i = 0; i <= l - 1; i++)
		{
			num = a.charAt(i) -'0' + b.charAt(i) - '0' + carry;
			if(num >= 2)
			{
				c += String.valueOf(num % 2);
				carry = 1;
			}
			else 
			{
				c += String.valueOf(num);
				carry = 0;
			}
		}
		if(carry == 1)
		{
			c += "1";
		}
		c = reverse(c);
		return c;
	}
	
	public static void main(String[] args)
	{
		LOJ_67 l = new LOJ_67 ();
		System.out.println(l.addBinary("10111","110101"));
		System.out.println(l.addBinary("1","11"));
		System.out.println(l.addBinary("111","1"));
		System.out.println(l.addBinary("1","1"));
	}
}
