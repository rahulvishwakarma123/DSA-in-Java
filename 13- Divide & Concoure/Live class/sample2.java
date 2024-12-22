/**
 * sample
 */
 
 public class sample2
 {
      static int merge ( int arr[] , int l, int mid, int r)
      {
           int n1= mid-l+1;   // [l, mid] mid-l+1
           int n2= r- mid;    // [mid+1, r]  r- ( mid+1)+1
  
           int L[]= new int[n1];
  
           int R[]= new int[n2];
  
           for( int i=0;i<n1;i++)
           {
                L[i] = arr[l+i];  //arr[l] , arr[l+1], arr[l+2]
           }
           for ( int i=0;i<n2 ;i++)
           {
                 R[i]= arr[mid+1+i]; // arr[mid+1], arr[mid+2], arr[mid+3]
           }
  
           int i=0, j=0;
  
           int k=l;
  
           int ans=0;
  
           while( i< n1 && j< n2)
           {
                if( L[i]<= R[j])
                {
                     arr[k]= L[i];
                     k++;
                     i++;
                }
                else
                {
                     ans+= (n1-i);
                     arr[k]= R[j];
                     j++;
                     k++;
                }
  
           }
  
           while( i< n1)
           {
                 arr[k]= L[i];
                 i++;
                 k++;
           }
  
           while( j<n2)
           {
                arr[k]= R[j];
                j++;
                k++;
           }
  
           return ans;
  
      }
     static int  sort( int arr[], int l, int r)
     {
       int count=0; 
         if( l<r )
         {
              int mid= (l+r)/2;
  
              count+= sort(arr, l, mid);
  
              count+= sort(arr, mid+1, r);
  
              count+= merge( arr, l, mid,r);
         }
         return count;
     }
     public static void main(String[] args) 
     {
            int arr[]= {9,7,5,4};
            int n= arr.length;
            int ans = sort( arr,0, n-1 );
  
           System.out.println( ans );
  
  
     }
 }
