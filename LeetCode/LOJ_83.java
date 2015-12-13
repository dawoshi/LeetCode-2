package loj;

public class LOJ_83 
{
	public static class ListNode
	{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
    public ListNode deleteDuplicates(ListNode head) 
    {
    	if(head == null)
    	{
    		return null;
    	}
        ListNode p = head, q = head.next;
        while(p != null && q != null)
        {
        	if(p.val == q.val)
        	{
        		p.next = q.next;
        		q = p;
        		if(q != null)
        		{
        			q = q.next;
        		}
        	}
        	else
        	{
        		p = p.next;
        		q = q.next;
        	}
        }
        return head;
    }
    
    public static void main(String[] args)
    {
    	LOJ_83 l = new LOJ_83();
    	int cnt = 0;
    	ListNode h = new ListNode(1), t;
    	t = h.next = new ListNode(2);
    	t = t.next = new ListNode(2);
    	t = t.next = new ListNode(3);
    	t = t.next = new ListNode(3);
    	t = t.next = new ListNode(4);
    	ListNode ans = l.deleteDuplicates(h);
    	while(ans != null)
    	{
    		if(cnt == 0)
    		{
    			System.out.print(ans.val);
    		}
    		else
    		{
    			System.out.print("->" + ans.val);
    		}
    		cnt++;
    		ans = ans.next;
    	}
    	System.out.println(".");
    }
}
