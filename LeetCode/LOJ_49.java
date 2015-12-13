package loj;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.lang.reflect.Array;

public class LOJ_49 
{
//    public List<List<String>> groupAnagrams(String[] strs) 
//    {
//    	  Hashtable<String, String> ht = new Hashtable<String, String>();
//        List<List<String>> l_all = new ArrayList<List<String>>();
//        List<String> l_tmp = new ArrayList<String>();
//        
//        for(int i = 0; i <= strs.length - 1; i++)
//        {
//        	char[] tmp = strs[i].toCharArray();
//        	Arrays.sort(tmp);
//        	ht.put(String.valueOf(tmp), String.valueOf(tmp));		//tmp.toString() is wrong!
//        }
//        
//        for(Iterator<String> it = ht.keySet().iterator(); it.hasNext();)
//        {
//        	String key = (String)it.next();
//        	String value = ht.get(key);
//        	l_tmp.clear();
//
//        	for(int j = 0; j <= strs.length - 1; j++)
//        	{
//            	char[] tmp = strs[j].toCharArray();
//            	Arrays.sort(tmp);
//        		if(value.equals(String.valueOf(tmp)))
//        		{
//        			l_tmp.add(strs[j]);
//        		}
//        	}
//        	l_all.add(l_tmp);
//        }
//        return l_all;
//    }
//    
	
	public List<List<String>> groupAnagrams(String[] strs) 
	{
		Arrays.sort(strs);
		Hashtable<String, List<String>> ht = new Hashtable<String, List<String>>();
		
		for(int i = 0; i <= strs.length - 1; i++)
		{
			char[] tmp = strs[i].toCharArray();
			Arrays.sort(tmp);
			String sortedString = String.valueOf(tmp);
			//For the function ht.getOrDefault(key, defaultValue): 
			//If the sortedString as a key is existed, we add strings[i] to it, 
			//else we apply for a new memory and add strings[i] to it.
			List<String> tmpList = ht.getOrDefault(sortedString, new ArrayList<String>());
			tmpList.add(strs[i]);
			ht.put(sortedString, tmpList);
		}
		
		List<List<String>> ansString = new ArrayList<>(ht.values());
		return ansString;
	}
	
    public static void main(String[] args)
    {
    	LOJ_49 l = new LOJ_49();
    	String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
    	List<List<String>> l_ans = new ArrayList<List<String>>();
    	l_ans = l.groupAnagrams(s);
    	//System.out.println(l_ans);
    	for(int i = 0; i <= l_ans.size() - 1; i++)
    	{
    		System.out.println(l_ans.get(i));
    	}
    }
}
