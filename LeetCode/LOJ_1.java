package loj;
import java.util.Hashtable;

public class LOJ_1 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] a = new int[2];
      //Hashtable<int, int> ht = new Hashtable<int, int>();		//it is a mistake
        Hashtable<Integer, Integer> ht = new Hashtable<Integer,Integer>();

        for(int i = 0; i <= nums.length - 1; i++)
        {
        	Integer temp = ht.get(nums[i]);
        	if(temp == null)
        	{
        		ht.put(nums[i], i);
        	}
        	Integer ans = ht.get(target - nums[i]);
        	if(ans != null && ans < i)
        	{
        		a[0] = ans + 1;
        		a[1] = i + 1;
        		break;
        	}
        }
        return a;
    }
    
    public static void main(String[] args)
    {
    	LOJ_1 l = new LOJ_1 ();
    	int[] num = {2, 7, 11, 15};
    	int[] t = l.twoSum(num, 9);
    	System.out.println("index1=" + t[0] + ", index2=" + t[1]);
    }
}
