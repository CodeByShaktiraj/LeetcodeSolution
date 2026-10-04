class Solution {
    public int missingNumber(int[] nums) {
        // Intuition: after sorting, nums[i] should equal i
        int n = nums.length;
        int num = n;

        for(int i=0;i<n;i++){
            num ^= i^nums[i];
        }
        return num;
        /*HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
                set.add(nums[i]);
        }
           for(int j=0;j<=nums.length;j++){
                 if(!set.contains(j)){
                    return j;
                 }
           }
        
         return -1;
         */
    }
}