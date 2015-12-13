package loj;

public class LOJ_141 
{
	public static class ListNode
	{
		int val;
		ListNode next;
		ListNode(int x)
		{
			val = x;
			next = null;
		}
	}
	
    public boolean hasCycle(ListNode head) 
    {
        if(head == null)
        {
        	return false;
        }
        /*
         * we declare two pointers p and q, p takes one step 
         * per time, q takes two steps per time. If p meets q 
         * and p is not null, we could make a conclusion that 
         * the LinkedList has a cycle.
         */
        ListNode p = head, q = head;
        while(p != null && q != null)
        {
        	p = p.next;
        	if(q.next != null)
        	{
        		q = q.next.next;
        	}
        	else
        	{
        		q = null;
        	}
        	if(p == q && p != null)
        	{
        		return true;
        	}
        }
        return false;
    }
}
