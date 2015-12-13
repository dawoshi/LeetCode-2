package loj;
import java.util.Hashtable;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Set;

public class LOJ_219 
{
	//This is a method that results in Time Limit Exceeded
/*    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
    	Hashtable<Integer, List<Integer>> ht = new Hashtable<Integer, List<Integer>>();
    	boolean flag = false;
    	
    	for(int i = 0; i <= nums.length - 1; i++)
    	{
    		List<Integer> tmpList = ht.getOrDefault(nums[i], new ArrayList<Integer>());
    		tmpList.add(i);
    		ht.put(nums[i], tmpList);
    	}
    	
    	Set<Integer> keys = ht.keySet();
    	OK:
    	for(Integer key: keys)
    	{
    		List<Integer> indexList = ht.get(key);
    		if(indexList.size() > 1)
    		{
    			for(int i = 0; i <= indexList.size() - 2; i++)
    			{
    				if(indexList.get(i + 1) - indexList.get(i) <= k)
    				{
    	    			flag = true;
    	    			break OK;
    				}
    			}
    		}
    	}
    	
    	return flag;
    }
    */

	public boolean containsNearbyDuplicate(int[] nums, int k)
	{
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		boolean flag = false;
		
		for(int i = 0; i <= nums.length - 1; i++)
		{
			if(ht.containsKey(nums[i]) && (i - ht.get(nums[i]) <= k))
			{
				flag = true;
				break;
			}
			else
			{
				ht.put(nums[i], i);
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args)
    {
    	LOJ_219 l = new LOJ_219();
    	int[] a = new int[]{1, 0, 3, 1};
    	
    	System.out.println(l.containsNearbyDuplicate(a, 1));
    }
}
