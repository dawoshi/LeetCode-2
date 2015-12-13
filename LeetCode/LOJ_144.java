package loj;
import java.util.List;
import java.util.ArrayList;

import loj.LOJ_94.TreeNode;

public class LOJ_144 
{
	public static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
	}
	
    public List<Integer> preorderTraversal(TreeNode root) 
    {
    	List<Integer> list = new ArrayList<Integer>();
    	if(root == null)
    	{
    		return list;
    	}
    	int top = -1;
    	TreeNode[] Stack = new TreeNode[10000];
    	TreeNode p = root;
    	
    	while(p != null || top != -1)
    	{
    		while(p != null)
    		{
    			list.add(p.val);
    			Stack[++top] = p;
    			p = p.left;
    		}
    		p = Stack[top--];
    		p = p.right;
    	}
    	return list;
    }
    
    public static void main(String[] args)
    {
    	LOJ_144 l = new LOJ_144();
    	TreeNode t1 = new TreeNode(1);
    	TreeNode t2 = t1.left = new TreeNode(2);
    	TreeNode t3 = t1.right = new TreeNode(3);
    	TreeNode t4 = t2.left = new TreeNode(4);
    	TreeNode t5 = t2.right = new TreeNode(5);
    	TreeNode t6 = t3.left = new TreeNode(6);
    	TreeNode t7 = t4.left = new TreeNode(7);
    	TreeNode t8 = t4.right = new TreeNode(8);
    	TreeNode t9 = t5.right = new TreeNode(9);
    	List<Integer> ans = l.preorderTraversal(t1);
    	for(int i = 0; i <= ans.size() - 1; i++)
    	{
    		System.out.print(ans.get(i));
    	}
    	System.out.println();
    } 
}
