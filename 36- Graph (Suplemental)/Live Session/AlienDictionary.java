import java.util.*;

public class AlienDictionary {

    public boolean isAlienSorted(String[] words, String order) 
    {
            HashMap<Character,Integer>indegree= new HashMap<>();
            HashMap<Character, ArrayList<Character>> adj= new HashMap<>();
            int n = words.length;
            for( char ch = 'a'; ch<='z'; ch++)
            {
                indegree.put( ch, 0);
                adj.put( ch ,  new ArrayList<Character>() );
            }
            
            boolean diff= false; 

            for( int i=0;i<n-1;i++)
            {
                String s1= words[i];
                String s2= words[i+1];

                for( int j=0;j< Math.min( s1.length(), s2.length()) ; j++)
                {
                    
                    char ch1= s1.charAt(j);
                    char ch2= s2.charAt(j);

                    if( ch1!= ch2)
                    {
                        diff= true;
                        //   ch1->ch2
                        adj.get(ch1).add(ch2);  // adj[ch1]= [ch2];
                        indegree.put( ch2, indegree.get(ch2)+1);
                    }
                }
            }

            Queue<Character>q= new LinkedList<>();

            for( char ch ='a'; ch<='z'; ch++)
            {
                if( indegree.get(ch)==0)
                {
                    q.add( ch );
                }
            }
            String ans="";
            while( q.isEmpty()==false )
            {
                char curr = q.remove();
                ans+= curr; 
                for( char conn : adj.get(curr) )
                {
                    indegree.put( conn , indegree.get(conn)-1);
                    
                    if( indegree.get(conn)==0)
                    {
                        q.add( conn );
                    }
                }
            }
        
        if( diff== false)
        {
            return false;
        }
        char[] charArray = ans.toCharArray();
        // Sort the character array
        Arrays.sort(charArray);

        // Create a new string from the sorted character array
        String s1 = new String(charArray);

        char[] charArray2 = order.toCharArray();

        // Sort the character array
        Arrays.sort(charArray2);

        // Create a new string from the sorted character array
        String s2 = new String(charArray2);
            if( s1.equals(s2)== true)
            {
                 return true;
            }
            else
            {
                 return false;
            }

             
    }
    
}
