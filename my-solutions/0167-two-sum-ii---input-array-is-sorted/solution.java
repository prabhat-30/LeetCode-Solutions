class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;

    //   for(int i =0 ; i< n-1; i++){
    //     for(int j = i+1; j<=n-1; j++){
    //         if(numbers[i]+numbers[j]==target){
    //         return new int[] {i+1,j+1};
    //         }
    //     }
    //   } 
    //     return new int[] {};


      int sum=0;
      int left=0;
      int right=n-1;

        while(left<right){
        sum = numbers[left]+numbers[right];
        if(sum<target) left++;
        else if(sum>target) right--;
        else if(sum == target) return new int[] {left+1,right+1};
      }
      return new int[] {};
    }
}
