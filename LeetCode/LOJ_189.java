package loj;

public class LOJ_189 
{
	public void reverse(int[] a, int s, int e)
	{
		int t = 0;
		for(int i = s; i <= (s + e) / 2; i++)
		{
			t = a[i];
			a[i] = a[s + e - i];
			a[s + e - i] = t;
		}
	}
	
    public void rotate(int[] nums, int k) 
    {
    	k = k % nums.length;
    	if(nums.length <= 1 || k <= 0)
    	{
    		return;
    	}
    	reverse(nums, 0, nums.length - 1);
    	reverse(nums, 0, k-1);
    	reverse(nums, k, nums.length - 1);
    }
    
    public static void main(String[] args)
    {
    	int[] a = {1, 2, 3, 4};	//{1,2,3,4,5,6,7};
    	LOJ_189 l = new LOJ_189();
    	l.rotate(a, 6);
    	for(int i = 0; i <= a.length - 1; i++)
    	{
    		System.out.println(a[i]);
    	}
    }
}
