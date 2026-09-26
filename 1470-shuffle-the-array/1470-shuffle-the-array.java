class Solution {
    public int[] shuffle(int[] nums, int n) {
             int[] ans = new int[nums.length];
     int left=0;
     int right=n;
     for(int i=0;i<nums.length;i+=2){
            ans[i] = nums[left];
            ans[i + 1] = nums[right];

            left++;
            right++;

     }  
     return ans;
    }
}