package loj;

public class LOJ_4 
{
	
	public double findKthElm(int[] A, int s1, int e1, int[] B, int s2, int e2, int k)		//two sorted arrays, find the K_th element 
	{
		if(s1 > e1)
		{
			return B[s2 + k - 1];
		}
		if(s2 > e2)
		{
			return A[s1 + k - 1];
		}
		
		int m1 = (s1 + e1) / 2;
		int m2 = (s2 + e2) / 2;
		int hl = m1 - s1 + m2 - s2 + 2;
		
		if(A[m1] < B[m2])					//divide and conquer
		{
			if(hl > k)
			{
				return findKthElm(A, s1, e1, B, s2, m2 - 1, k);
			}
			else
			{
				return findKthElm(A, m1 + 1, e1, B, s2, e2, k - (m1 - s1 + 1));
			}
		}
		else
		{
			if(hl > k)
			{
				return findKthElm(A, s1, m1 - 1, B, s2, e2, k);
			}
			else
			{
				return findKthElm(A, s1, e1, B, m2 + 1, e2, k - (m2 - s2 + 1));
			}
		}
	}
	
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
    	double ans = -1;
    	if((nums1.length + nums2.length) % 2 ==0)
    	{
    		double ans1 = findKthElm(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, (nums1.length + nums2.length) / 2);
    		double ans2 = findKthElm(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, (nums1.length + nums2.length + 2) / 2);
    		ans = (ans1 + ans2) / 2;
    	}
    	else
    	{
    		ans = findKthElm(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, (nums1.length + nums2.length + 1) / 2);
    	}
    	return ans;
    }
    
    public static void main(String[] args)
    {
    	LOJ_4 l = new LOJ_4();
    	int[] A = {1, 3, 5, 7, 9, 11};
    	int[] B = {0, 2, 4, 6, 8, 10, 12};
    	System.out.println(l.findMedianSortedArrays(A, B));
    }
}
