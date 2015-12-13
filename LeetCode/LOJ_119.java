package loj;
import java.util.List;
import java.util.ArrayList;

public class LOJ_119 
{
    public List<Integer> getRow(int rowIndex) 
    {
    	List<Integer> l0 = new ArrayList<Integer>();
    	if(rowIndex < 0)
    	{
    		return l0;
    	}
    	l0.add(1);
    	if(rowIndex == 0)
    	{
    		return l0;
    	}
    	List<Integer> l1 = new ArrayList<Integer>();
    	l1.add(1);
    	l1.add(1);
    	if(rowIndex == 1)
    	{
    		return l1;
    	}
    	for(int i = 2; i <= rowIndex; i++)
    	{
    		List<Integer> tmpl = new ArrayList<Integer>();
    		tmpl.add(1);
    		for(int j = 0; j <= i - 2; j++)
    		{
    			tmpl.add(l1.get(j) + l1.get(j + 1));
    		}
    		tmpl.add(1);
    		l1 = tmpl;
    	}
    	return l1;
    }
    
    public static void main(String[] args)
    {
    	List<Integer> tl = new ArrayList<Integer>();
    	LOJ_119 l = new LOJ_119 ();
    	tl = l.getRow(-1); 
    	System.out.println(tl);
    }
}
