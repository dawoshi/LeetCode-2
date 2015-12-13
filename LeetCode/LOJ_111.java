package loj;

public class LOJ_111 
{
	public static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
	}
	
    public int minDepth(TreeNode root) 
    {
    	boolean childFlag = false;
    	int front = -1, rear = 0;			//the first and last pointers for the TreeNode queue
    	int parentSize = 1, childSize = 0;	//the count for parent level's nodes and the count for present level's nodes 
    	int h = 1;							//record the present nodes's level
    	TreeNode p = null;
    	TreeNode[] Queue = new TreeNode[10000];
    	if(root == null)
    	{
    		return 0;
    	}
    	Queue[0] = root;
    	while(front < rear)		//loop condition
    	{
    		childFlag = false;
    		p = Queue[++front];
    		if(p.left != null)
    		{
    			childFlag = true;
    			Queue[++rear] = p.left;
    			childSize++;
    		}
    		if(p.right != null)
    		{
    			childFlag = true;
    			Queue[++rear] = p.right;
    			childSize++;
    		}
    		parentSize--;
    		if(parentSize == 0 && childFlag)
    		{
    			h++;
    			parentSize = childSize;
    			childSize = 0;
    		}
    		if(p.left == null && p.right == null)
    		{
    			break;
    		}
    	}
        return h;
    }
    
    public static void main(String[] args)
    {
    	LOJ_111 l = new LOJ_111();
    	TreeNode t1 = new TreeNode(1);
    	TreeNode t2 = t1.left = new TreeNode(2);
    	TreeNode t3 = t1.right = new TreeNode(3);
    	TreeNode t4 = t2.left = new TreeNode(4);
//    	TreeNode t5 = t2.right = new TreeNode(5);
//    	TreeNode t6 = t3.left = new TreeNode(6);
//    	TreeNode t7 = t4.left = new TreeNode(7);
//    	TreeNode t8 = t4.right = new TreeNode(8);
//    	TreeNode t9 = t5.right = new TreeNode(9);
    	System.out.println(l.minDepth(t1));
    	
    }
}
