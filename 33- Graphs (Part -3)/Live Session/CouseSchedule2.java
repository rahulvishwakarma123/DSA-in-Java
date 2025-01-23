import java.util.*;
import java.util.LinkedList;

public class CouseSchedule2 {
     public int[] findOrder(int n, int[][] prerequisites) 
    {
 
         int indegree[]= new int[n];
         Queue<Integer> q= new LinkedList<>();
 
         ArrayList<ArrayList<Integer>>adj= new ArrayList<>();
 
        for( int i=1;i<=n;i++)
        {
             adj.add( new ArrayList<Integer>());
        }
 
         for( int i=0;i< prerequisites.length;i++)
         {
              int a= prerequisites[i][0];
              int b= prerequisites[i][1];
 
             // b->a
             indegree[a]++;
             adj.get(b).add(a);
         }
 
        for( int i=0;i<n;i++)
        {
             if( indegree[i]==0)
             {
                  q.add( i );
             }
        }
 
        int k=0;
        int ans[]= new int[n];
 
        while( q.isEmpty()==false)
        {
             int curr= q.remove();
 
             ans[k]= curr;
             k++;
 
             for( int conn : adj.get(curr))
             {
                  indegree[conn]--;
 
                  if( indegree[conn]==0)
                  {
                       q.add( conn );
                  }
             }
        }
 
        if( k==n)
        {
             return ans;
        }
        else
        {
            return new int[0];
        }
    }
}
