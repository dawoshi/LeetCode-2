package loj;

public class LOJ_88 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
    	int l_1 = m, pre = 0;
    	
        for(int i = 0; i <= n - 1; i++)
        {
        	boolean flag = false;
        	for(int j = pre; j <= l_1 - 1; j++)
        	{
        		if(nums1[j] > nums2[i])
        		{
        			for(int k = l_1 - 1; k >= j ; k--)
        			{
        				nums1[k + 1] = nums1[k];
        			}
        			nums1[j] = nums2[i];
        			flag = true;
        			pre = j;
        			break;
        		}
        	}
        	if(!flag)
        	{
        		nums1[l_1] = nums2[i];
        		pre = l_1;
        	}
        	l_1++;
        }
    }
    
    public static void main(String[] args)
    {
    	LOJ_88 l = new LOJ_88();
    	int[] a = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	int[] b = new int[]{1, 3, 5, 7, 9, 0, 0};
    	l.merge(a, 8, b, 5);
    	for(int i = 0; i <= 14; i++)
    	{
    		System.out.print(a[i] + " ");
    	}
    	System.out.println();
    }
}
