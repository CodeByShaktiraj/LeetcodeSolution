class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    if(k==0){
        return false;
    }
    
     HashSet<Integer> set = new HashSet<>();

     for(int i=0;i<k && i<nums.length;i++){
        if(set.contains(nums[i])){
            return true;
        }
        set.add(nums[i]);
     }
     int left =0;
     for(int i=k;i<nums.length;i++){
        if(set.contains(nums[i])){
            return true;
        }
        set.remove(nums[left]);
        left++;
        set.add(nums[i]);

     }
 return false;
     
    }
}