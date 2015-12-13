package loj;

public class LOJ_8 
{
//    public int myAtoi(String str) 
//    {
//    	boolean isminus = false, isdigit = false;
//        int num = 0, lstr = str.length();
//        
//        for(int i = 0; i <= lstr - 1; i++)
//        {
//        	if(str.charAt(i) == '-')
//        	{
//        		if(isdigit == false && isminus == false)
//        		{
//        			isminus = true;
//        		}
//        	}
//        	else if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
//        	{
//        		if(isdigit == false)
//        		{
//        			isdigit = true;
//        		}
//        		num = 10 * num + (str.charAt(i) - '0');
//        	}
//        }
//        if(isminus)
//        {
//        	return -num;
//        }
//        else
//        {
//        	return num;
//        }
//    }

	public int judge(long n)
	{
		//the maximum integer is 2147483647, the minimum integer is -2147483648
		if(n >= -2147483648 && n <= 2147483647)
		{
			return 0;
		}
		else if(n < -2147483648)
		{
			return -1;
		}
		return 1;
	}
	
    public int myAtoi(String str) 
    {	
    	int lstr = str.length(), isminus = 1;
        long num = 0;
        
        if(lstr == 0)
        {
        	return 0;
        }
        //String[] s = str.split("s+");			//divide the string into substrings by several spaces
        //str = str.replaceAll("\\s{1,}", " ");
        String[] s = str.split(" ");
        for(int i = 0; i <= s.length - 1; i++)
        {
        	if(s[i].length() != 0)
        	{
        		str = s[i];
        		break;
        	}
        }
        lstr = str.length();
        if(str.charAt(0) == '-')		// '-'
        {
        	isminus = -1;
        }
        else if(str.charAt(0) == '+')
        {
        	isminus = 1;
        }
        else if(str.charAt(0) >= '0' && str.charAt(0) <= '9')	//no '+' nor '-'
        {
            num = 10 * num + (str.charAt(0) - '0');
        }
        else
        {
            return (int)(isminus * num);
        }
        for(int i = 1; i <= lstr - 1; i++)
        {
        	if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
        	{
        		num = 10 * num + (str.charAt(i) - '0');
        		if(judge(isminus * num) == -1)
        		{
        			return -2147483648;
        		}
        		else if(judge(isminus * num) == 1)
        		{
        			return 2147483647;
        		}
        	}
        	else
        	{
        		if(judge(isminus * num) == -1)
        		{
        			return -2147483648;
        		}
        		else if(judge(isminus * num) == 1)
        		{
        			return 2147483647;
        		}
        		else
        		{
        			return (int)(isminus * num);
        		}
        	}
        }
        return (int)(isminus * num);
    }
    
    public static void main(String[] args)
    {
    	LOJ_8 l = new LOJ_8();
    	System.out.println(l.myAtoi(" -+10   010   "));
    }
}
