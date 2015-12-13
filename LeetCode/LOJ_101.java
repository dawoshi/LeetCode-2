package loj;

public class LOJ_101 
{
	public static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	int cnt1 = 0, cnt2 = 0;
	int[] a = new int[10000], b = new int[10000];
	//root->left->right
	public void DFS1(TreeNode root)
	{
		if(root != null)
		{
			a[cnt1++] = root.val;
			DFS1(root.left);
			DFS1(root.right);
		}
		else
		{
			a[cnt1++] = -1;
		}
	}
	//root->right->left
	public void DFS2(TreeNode root)
	{
		if(root != null)
		{
			b[cnt2++] = root.val;
			DFS2(root.right);
			DFS2(root.left);
		}
		else
		{
			b[cnt2++] = -1;
		}
	}
	
    public boolean isSymmetric(TreeNode root) 
    {
    	boolean flag = true;
    	//exceptional case: 
        if(root == null)
        {
        	return true;
        }
        //DFS
        DFS1(root);
        DFS2(root);
        //judge if array a is equal to array b
        for(int i = 0; i <= cnt1 - 1; i++)
        {
        	if(a[i] != b[i])
        	{
        		flag = false;
        		break;
        	}
        }
        //return the result
        return flag;
    }
    
    public static void main(String[] args)
    {
    	LOJ_101 l = new LOJ_101();
    	TreeNode t1 = new TreeNode(1);
    	TreeNode t2 = t1.left = new TreeNode(2);
    	TreeNode t3 = t1.right = new TreeNode(2);
    	TreeNode t4 = t2.left = new TreeNode(3);
    	TreeNode t5 = t3.left = new TreeNode(3);
    	//TreeNode t5 = t2.right = new TreeNode(4);
    	//TreeNode t6 = t3.left = new TreeNode(4);
    	//TreeNode t7 = t3.right = new TreeNode(3);
    	System.out.println(l.isSymmetric(t1));
    }
}
