class Solution {
    public int[] sortedSquares(int[] nums) {
        // creat a new arr
        int[]sorted= new int[nums.length];

      // two pointer
        int left = 0;
        int right = nums.length-1;

       // show the position
        int pos = nums.length-1;
      
      //math.abs = absolute value show 
        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                sorted[pos] = nums[left]*nums[left];
                left++;
            }
            else{
                sorted[pos] = nums[right]*nums[right];
                right--;
            }
                    pos--;

        }
            return sorted;

    }
}