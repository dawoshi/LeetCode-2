package loj;

import java.util.Hashtable;
//import java.util.List;
//import java.util.ArrayList;

public class LOJ_205 
{
    public boolean isIsomorphic(String s, String t) 
    {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        char[] s1 = s.toCharArray(), t1 = t.toCharArray();
        int[] s2 = new int[s1.length], t2 = new int[s2.length];
        boolean flag = true;
        boolean[] mark = new boolean[130];
        //initialization
        for(int i = 0; i <= 129; i++)
        {
        	mark[i] = false;
        }
        for(int i = 0; i <= s1.length - 1; i++)
        {
        	//s2[i] = Integer.parseInt(String.valueOf(s1[i]));	It causes error!
        	//t2[i] = Integer.parseInt(String.valueOf(t1[i]));  It causes error!
        	s2[i] = s1[i] - '0' + 48;
        	t2[i] = t1[i] - '0' + 48;
        }
        //mapping from s to t
        for(int i = 0; i <= s2.length - 1; i++)
        {
        	if(mark[t2[i]] == true)		//s===>t,t has already been mapped
        	{
        		if(ht.get(s2[i]) != null && ht.get(s2[i]) == t2[i])
        		{
        			continue;
        		}
        		else
        		{
        			flag = false;
        			break;
        		}
        	}
        	else	//s===>t, t hasn't been mapped
        	{
        		if(ht.get(s2[i]) != null)
        		{
        			flag = false;
        			break;
        		}
        		else
        		{
        			ht.put(s2[i], t2[i]);
        			mark[t2[i]] = true;
        		}
        	}
        }
        //return the flag
        return flag;
    }
    
    public static void main(String[] args)
    {
    	LOJ_205 l = new LOJ_205();
    	String s = "a", t = "a";
    	System.out.println(l.isIsomorphic(s, t));
    }
}
