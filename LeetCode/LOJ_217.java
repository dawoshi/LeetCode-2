package loj;
import java.util.Hashtable;

public class LOJ_217 
{
    public boolean containsDuplicate(int[] nums) 
    {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        boolean flag = false;
        
        for(int i = 0; i <= nums.length - 1; i++)
        {
        	Integer temp = ht.get(nums[i]);
        	if(temp == null)
        	{
        		ht.put(nums[i], i);
        	}
        	else
        	{
        		flag = true;
        		break;
        	}
        }
        return flag;
    }
    
    public static void main(String[] args)
    {
    	LOJ_217 l = new LOJ_217();
    	int[] a = new int[]{3,1,4,1,5,9,2,6};
    	System.out.println(l.containsDuplicate(a));
    }
}
