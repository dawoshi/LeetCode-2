package loj;
import java.util.List;
import java.util.ArrayList;

import loj.LOJ_144.TreeNode;

public class LOJ_145 
{
	public static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
	}
	
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null)
        {
        	return list;
        }
        TreeNode p = root;
        TreeNode[] Stack1 = new TreeNode[10000];
        int flag = 0, top = -1;
        int[] Stack2 = new int[10000];
        
        while(p != null || top != -1)
        {
        	while(p != null)
        	{
        		Stack1[++top] = p;
        		Stack2[top] = 0;
        		p = p.left;
        	}
        	p = Stack1[top];
        	flag = Stack2[top--];
        	if(flag == 0)
        	{
        		Stack1[++top] = p;
        		Stack2[top] = 1;
        		p = p.right;
        	}
        	else
        	{
        		list.add(p.val);
        		p = null;
        	}
        }
        return list;
    }
    
    public static void main(String[] args)
    {
    	LOJ_145 l = new LOJ_145();
    	TreeNode t1 = new TreeNode(1);
    	TreeNode t2 = t1.left = new TreeNode(2);
    	TreeNode t3 = t1.right = new TreeNode(3);
    	TreeNode t4 = t2.left = new TreeNode(4);
    	TreeNode t5 = t2.right = new TreeNode(5);
    	TreeNode t6 = t3.left = new TreeNode(6);
    	TreeNode t7 = t4.left = new TreeNode(7);
    	TreeNode t8 = t4.right = new TreeNode(8);
    	TreeNode t9 = t5.right = new TreeNode(9);
    	List<Integer> ans = l.postorderTraversal(t1);
    	for(int i = 0; i <= ans.size() - 1; i++)
    	{
    		System.out.print(ans.get(i));
    	}
    	System.out.println();
    }     
}
