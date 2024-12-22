public class sample3Quick {
    class Solution {
        void merge(int[] nums, int l1, int r1, int l2, int r2) {
            int[] res = new int[r2 - l1 + 1];
            int p1 = l1, p2 = l2, p3 = 0;
    
            while(p1 <= r1 && p2 <= r2){
                if(nums[p1] <= nums[p2]){
                    res[p3] = nums[p1];
                    p3++; p1++;
                } else {
                    res[p3] = nums[p2];
                    p3++; p2++;
                }
            }
    
            while(p1 <= r1){
                res[p3] = nums[p1];
                p3++; p1++;
            }
    
            while(p2 <= r2){
                res[p3] = nums[p2];
                p3++; p2++;
            }
    
            for(int idx = l1; idx <= r2; idx++)
                nums[idx] = res[idx - l1];
        }
    
        public void mergeSort(int[] nums, int left, int right){
            if(left >= right) return;
            int mid = left + (right - left) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, mid + 1, right);
        }
    
        public int[] sortArray(int[] nums) {
            mergeSort(nums, 0, nums.length - 1);
            return nums;
        }
    }
    
}