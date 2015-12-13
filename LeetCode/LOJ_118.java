package loj;

import java.util.List;
import java.util.ArrayList;

public class LOJ_118 
{
    public List<List<Integer>> generate(int numRows) 
    {
    	List<List<Integer>> l = new ArrayList<List<Integer>>();
    	List<Integer> l1 = new ArrayList<Integer>();
    	List<Integer> l2 = new ArrayList<Integer>();
    	l1.add(1);
    	l2.add(1);
    	l2.add(1);
    	if(numRows < 1)
    	{
    		return l;		//return null; is a wrong answer
    	}
    	l.add(l1);
    	if(numRows == 1)
    	{
    		return l;
    	}
    	l.add(l2);
    	if(numRows == 2)
    	{
    		return l;
    	}
    	for(int i = 2; i <= numRows - 1; i++)
    	{
    		List<Integer> tmpl = new ArrayList<Integer>();
    		tmpl.add(1);
    		for(int j = 0; j <= i - 2; j++)
    		{
    			tmpl.add(l.get(i - 1).get(j) + l.get(i - 1).get(j + 1));
    		}
    		tmpl.add(1);
    		l.add(tmpl);
    	}
    	return l;
    }
    
    public static void main(String[] args)
    {
    	List<List<Integer>> tl = new ArrayList<List<Integer>>();
    	LOJ_118 l = new LOJ_118 ();
    	tl = l.generate(0);
    	System.out.println("[");
    	if(tl != null)
    	{
        	for(int i = 0; i <= tl.size() - 1; i++)
        	{
        		for(int j = 0; j <= tl.size() - i; j++)
        		{
        			System.out.print(" ");
        		}
        		System.out.println(tl.get(i));
        	}
    	}
    	System.out.println("]");
    }
}
