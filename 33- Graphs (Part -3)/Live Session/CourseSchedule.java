import java.util.*;
import java.util.LinkedList;

public class CourseSchedule {
    public boolean canFinish(int n, int[][] pre) 
    {
         ArrayList<ArrayList<Integer>>adj= new ArrayList<>();
         int indegree[]= new int[n];
         for( int i=0;i<n;i++)
         {
              // adj[0]=[]
              // adj[1]=[]
              adj.add( new ArrayList<Integer>());
         }
         for( int i=0;i< pre.length;i++)
         {
              int a= pre[i][0];
              int b= pre[i][1];
              // b->a
              adj.get(b).add( a );
              indegree[a]++;
 
         }
 
         Queue<Integer>q= new LinkedList<>();
         for( int i=0;i<n;i++)
         {
             if( indegree[i]==0)
             {
                 q.add( i );
             }
         }
        ArrayList<Integer>ans= new ArrayList<>();
        while(q.isEmpty()==false)
        {
             int curr= q.remove();
             ans.add( curr );
 
             for( int conn : adj.get(curr) )
             {
                 indegree[conn]--;
                 if( indegree[conn]==0)
                 {
                     q.add( conn );
                 }
             }
        }
 
        if( ans.size()==n) //all courses are in ans
        {
            return true; // its possible to do all courses
        }
        else
        {
            return false;
        }
    }
}   // solve couse schedule part-II
