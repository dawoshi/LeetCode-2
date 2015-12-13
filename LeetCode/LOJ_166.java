package loj;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

public class LOJ_166 
{
//	//get the greatest common divisor
//	public int GCD(int n, int m)
//	{
//		//n = Math.abs(n);
//		//m = Math.abs(m);
//		while(m > 0)
//		{
//			int tmp = m;
//			m = n % m;
//			n = tmp;
//		}
//		return n;
//	}
//	
//	//judge if the number only contains divisor 2 or 5
//	public boolean isDivisor(int m)
//	{
//		boolean flag = true;
//		while(flag)
//		{
//			flag = false;
//			if(m % 2 == 0)
//			{
//				m /= 2;
//				flag = true;
//			}
//			if(m % 5 == 0)
//			{
//				m /= 5;
//				flag = true;
//			}
//		}
//		if(m == 1)
//		{
//			return true;
//		}
//		return false;
//	}
	
    public String fractionToDecimal(int numerator, int denominator) 
    {
    	//Integer is wrong
    	long n = numerator, m = denominator;
    	int index = 0, beforeStart = 0;
    	String ans = "";
    	//Integer is wrong
    	Hashtable<Long, Integer> ht = new Hashtable<Long, Integer>();
    	//Integer
    	List<Long> l_tmp = new ArrayList<Long>();
    	//deal with the sign
        if((n < 0 && m > 0) || (n > 0 && m < 0))
        {
        	ans += "-";
        }
        n = Math.abs(n);
        m = Math.abs(m);
        //calculate the fraction to recurring decimal
        if(n % m == 0)
        {
        	ans += n / m;
        }
        else
        {
        	if(n > m)
        	{
        		ans += n / m + ".";
        		n = n % m;
        	}
        	else
        	{
        		ans += "0.";
        	}
        	while(n != 0 && !ht.containsKey(n))
        	{
        		ht.put(n, index++);
        		n *= 10;
        		l_tmp.add(n / m);
        		n %= m;
        	}
        	//get the result
        	if(n == 0)
        	{
        		for(int i = 0; i <= l_tmp.size() - 1; i++)
        		{
        			ans += l_tmp.get(i);
        		}
        	}
        	else
        	{
        		beforeStart = ht.get(n);
        		for(int i = 0; i <= beforeStart - 1; i++)
        		{
        			ans += l_tmp.get(i);
        		}
        		ans += "(";
        		for(int i = beforeStart; i <= l_tmp.size() - 1; i++)
        		{
        			ans += l_tmp.get(i);
        		}
        		ans += ")";
        	}
        }
    	return ans;
    }
    
    public static void main(String[] args)
    {
    	LOJ_166 l = new LOJ_166();
    	System.out.println(l.fractionToDecimal(-1, -2147483648));		//1, 214748364
    }
}