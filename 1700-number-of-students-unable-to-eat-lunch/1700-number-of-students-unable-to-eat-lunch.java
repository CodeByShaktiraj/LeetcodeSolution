class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero=0;
        int one=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            if(students[i]==0){
                zero++;
            }
            else{
                 one++;
            }

            q.add(students[i]);

        }
        int i=0;

        while(i<sandwiches.length){
            int num=q.remove();
            if(num==sandwiches[i]){
                i++;
                if(num==0){
                    zero--;
                }else{
                    one--;
                }
                continue;
            }
            if(i==sandwiches.length)return 0;

            if(sandwiches[i]==0){
                if(zero<=0)return one;
            }

            if(sandwiches[i]==1){
                if(one<=0)return zero;
            }

            q.add(num);


        }
        return 0;
    }
}