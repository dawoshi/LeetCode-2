package loj;

//import java.util.Hashtable;
//import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class LOJ_138 
{
	public static class RandomListNode
	{
		int label;
		RandomListNode next, random;
		RandomListNode(int x) { this.label = x; }
	}
	
	//It is a wrong method!(hash table is different from hash map)
//  public RandomListNode copyRandomList(RandomListNode head) 
//  {
//  	//exceptional case
//  	if(head == null)
//  	{
//  		return null;
//  	}
//  	
//      Hashtable<RandomListNode, RandomListNode> ht = new Hashtable<RandomListNode, RandomListNode>();
//      RandomListNode pre = head;
//      //add the new nodes into the hash table
//      while(pre != null)
//      {
//      	ht.put(pre, new RandomListNode(pre.label));
//      	pre = pre.next;
//      }
//      //add the next and random to the new random list
//      Set<RandomListNode> keys = ht.keySet();
//      for(RandomListNode key: keys)
//      {
//      	ht.get(key).next = ht.get(key.next);
//      	ht.get(key).random = ht.get(key.random);
//      }
//      return ht.get(head);
//  }
  
	//Hash table doesn't allow null for key or value, but Hash map allows null for them.
  public RandomListNode copyRandomList(RandomListNode head) 
  {
  	//exceptional case
  	if(head == null)
  	{
  		return null;
  	}
  	
      Map<RandomListNode, RandomListNode> hm = new HashMap<RandomListNode, RandomListNode>();
      RandomListNode pre = head;
      //add the new nodes into the hash map
      while(pre != null)
      {
      	hm.put(pre, new RandomListNode(pre.label));
      	pre = pre.next;
      }
      //add the next and random to the new random list
      for(Map.Entry<RandomListNode, RandomListNode> entry : hm.entrySet())
      {
      	hm.get(entry.getKey()).next = hm.get(entry.getKey().next);
      	hm.get(entry.getKey()).random = hm.get(entry.getKey().random);
      }
      return hm.get(head);
  }
}
