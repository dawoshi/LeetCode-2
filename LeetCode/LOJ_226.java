package loj;

public class LOJ_226 
{
	public static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
    public TreeNode invertTree(TreeNode root) 
    {
        if(root == null)
        {
        	return root;
        }
        else
        {
        	if(root.left != null || root.right != null)
        	{
            	TreeNode tmp = root.left;
            	root.left = root.right;
            	root.right = tmp;
            	if(root.left != null)
            	{
            		invertTree(root.left); 
            	}
            	if(root.right != null)
            	{
            		invertTree(root.right);
            	}
        	}
        	return root;
        }
    }
    
    public void printTree(TreeNode root)
    {
    	System.out.print(root.val);
    	if(root.left != null)
    	{
    		printTree(root.left);
    	}
    	if(root.right != null)
    	{
    		printTree(root.right);
    	}
    }
    
    public static void main(String[] args)
    {
    	LOJ_226 l = new LOJ_226();
    	TreeNode t1 = new TreeNode(4);
    	TreeNode t2 = t1.left = new TreeNode(2);
    	TreeNode t3 = t1.right = new TreeNode(7);
    	TreeNode t4 = t2.left = new TreeNode(1);
    	TreeNode t5 = t2.right = new TreeNode(3);
    	TreeNode t6 = t3.left = new TreeNode(6);
    	//TreeNode t7 = t3.right = new TreeNode(9);
    	
    	l.printTree(t1);
    	System.out.println();
    	
    	l.invertTree(t1);
    	
    	l.printTree(t1);
    	System.out.println();
    }
}
