package loj;

public class LOJ_66 
{
		public int[] plusOne(int[] digits)
		{
			int length = digits.length;
			if(length == 0 || digits == null)
			{
				return digits;
			}
			int carry = 1, num = 0;
			for(int i = length - 1;i >= 0 ;i--)
			{
				num = digits[i] + carry;
				digits[i] = num % 10;
				carry = num / 10;
				if(carry == 0)
				{
					return digits;
				}
			}
			int[] newdigits = new int[length + 1];
			newdigits[0] = carry;
			for(int i = length - 1; i >= 0; i--)
			{
				newdigits[i+1] = digits[i];
			}
			return newdigits;
		}
	
	public static void main(String[] args)
	{
		int[] a = {9,9,9,9,9,9};
		LOJ_66 l = new LOJ_66();
		int[] b = l.plusOne(a);
		for(int i = 0; i <= b.length - 1; i++)
		{
			System.out.print(b[i]);
		}
		System.out.println();
	}
}
