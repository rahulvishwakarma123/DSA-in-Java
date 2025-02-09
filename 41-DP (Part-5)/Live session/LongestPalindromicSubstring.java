public class LongestPalindromicSubstring {
    
    public String longestPalindrome(String s)
    {
        int n = s.length();
        
        int dp[][]= new int[n][n];
        
        int left=0;
        int right=0;
        int ans=1;
        
        // 1 length substring is always palindromic 
        for( int i=0;i<n;i++)
        {
             dp[i][i]=1;
        }
        
        //2 length substring 
        for(int i=0;i+1<n;i++)
        {
              int start =i;
              int end = i+1;
            
             if( s.charAt(start)== s.charAt(end))
             {
                  dp[start][end]=1;
                  if( ans==1)
                  {
                      ans=2;
                      left= start;
                      right= end;
                  }
             }
        }
        
        for( int len =3;len<=n; len++)
        {
            // i+1< n ( len =2) , i+2< n ( len =3 )..  
            // in general i+ len -1 <n
            for( int i=0;i+len-1<n;i++) 
            {
                int start =i;
                int end = i+ len-1;
                
                if( s.charAt( start)== s.charAt(end) && dp[start+1][end-1]==1)
                {
                    dp[start][end]=1;
                    
                    if( len> ans)
                    {
                         ans= len;
                         left= start;
                         right= end;
                    }
                }
            }
        }
        
        String res="";
        for( int i= left; i<=right;i++)
        {
             res+=s.charAt(i);
        }
        
        return res;
    }
}
