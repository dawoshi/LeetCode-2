package loj;

public class LOJ_2 
{
	public static class ListNode
	{
		int val;
		ListNode next;
		ListNode(int x) {val = x;}
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		int carry = 0, sum = 0;
		ListNode l3 = new ListNode(0), p = l3;
		if(l1 == null)
		{
			return l2;
		}
		if(l2 == null)
		{
			return l1;
		}
		while(l1 != null && l2 != null)
		{
			sum = (l1.val + l2.val + carry) % 10;
			carry = (l1.val + l2.val + carry) / 10;
			p.next = new ListNode(sum);
			p = p.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		while(l1 != null)
		{
			sum = (l1.val + carry) % 10;
			carry = (l1.val + carry) / 10;
			p.next = new ListNode(sum);
			p = p.next;
			l1 = l1.next;
		}
		while(l2 != null)
		{
			sum = (l2.val + carry) % 10;
			carry = (l2.val + carry) / 10;
			p.next = new ListNode(sum);
			p = p.next;
			l2 = l2.next;
		}
		if(carry == 1)
		{
			p.next = new ListNode(1);
		}
		return l3.next;
	}
	
	public static void main(String[] args)
	{
		LOJ_2 l = new LOJ_2();
		ListNode h1 = new ListNode(2), p1 = h1;
		ListNode h2 = new ListNode(5), p2 = h2;
		
		p1.next = new ListNode(4);
		p1 = p1.next;
		p1.next = new ListNode(3);
		p1 = p1.next;
		
		p2.next = new ListNode(6);
		p2 = p2.next;
		p2.next = new ListNode(6);
		p2 = p2.next;
		
		ListNode h3 = l.addTwoNumbers(h1, h2);
		//System.out.println(h3);
		System.out.print(h3.val);
		h3 = h3.next;
		while(h3 != null)
		{
			System.out.print(" -> " + h3.val);
			h3 = h3.next;
		}
		System.out.println();
	}
}
