class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast =n;

        do {
            slow = getSum(slow);
            fast = getSum(getSum(fast));

        } while (slow != fast);

        return slow == 1;
    }
       public int getSum(int n) {

            int sum=0;
            while(n>0){
               int digit = n%10;
               sum +=digit*digit;
               n /=10;
            
        }
        return sum;
    }
}

/*class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n!=1){
         if(set.contains(n)){
                return false;
            }
            set.add(n);
             int sum = 0;
            
        while(n>0){
            int digit=n%10;
            sum += digit*digit;
            n/=10;
            }
            n=sum;
            

        }
        return true;
    }
}
*/