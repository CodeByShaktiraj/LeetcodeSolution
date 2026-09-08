class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
      int arr[]=new int [2];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
           arr[students[i]]++;
            q.add(students[i]);

        }
        int i=0;

        while(i<sandwiches.length){
            int num=q.remove();
            int sand=sandwiches[i];
            if(num==sand){
                i++;
               arr[sand]--;
                continue;
            }
            if(i==sandwiches.length)return 0;

          if(arr[sand]==0){
           if(sand==0)return arr[1];
           return arr[0];
          }

            q.add(num);


        }
        return 0;
    }
}