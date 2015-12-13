package loj;
import java.util.Hashtable;

public class LOJ_299 
{
    public String getHint(String secret, String guess) 
    {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        int bulls = 0, cows = 0;
        
        for(int i = 0; i <= secret.length() - 1; i++)
        {
        	ht.put(i, Integer.valueOf(secret.charAt(i)));
        }
        for(int i = 0; i <= guess.length() - 1; i++)
        {
        	if(ht.get(i) == guess.charAt(i))
        	{
        		bulls++;
        		ht.replace(i, Integer.valueOf(guess.charAt(i)), -1);
        	}
        }
        for(int i = 0; i <= guess.length() - 1; i++)
        {
        	for(int j = 0; j <= secret.length() - 1; j++)
        	{
        		if(j != i && ht.get(i) != -1 && ht.get(j) == guess.charAt(i))
        		{
        			cows++;
        			ht.replace(j, Integer.valueOf(guess.charAt(i)), -2);
        			break;
        		}
        	}
        }
        
        String ans = String.valueOf(bulls) + "A" + String.valueOf(cows) + "B";
        return ans;
    }
    
    public static void main(String[] args)
    {
    	LOJ_299 l = new LOJ_299();
    	System.out.println(l.getHint("1122", "0001"));
    }
}
