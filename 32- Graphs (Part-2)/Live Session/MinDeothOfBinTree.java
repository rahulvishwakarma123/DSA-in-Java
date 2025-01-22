import java.util.*;
public class MinDeothOfBinTree {
    
        
        static int mi=Integer.MAX_VALUE;
     
        static void rec( TreeNode curr, int level)
        {
            if( curr== null)
            {
                 return;
            }
            if( curr.left==null && curr.right==null )
            {
                // leaf node
                 if( level< mi )
                 {
                      mi= level;
                 }
                return ;
            }
     
            rec( curr.left, level+1);
            rec( curr.right, level+1);
        }
        public int minDepth(TreeNode root)
        {
             if( root==null )
             {
                  return 0;
             }
             mi= Integer.MAX_VALUE;
     
             rec(  root , 1 );
     
     
     
             return mi;
        }
    }

