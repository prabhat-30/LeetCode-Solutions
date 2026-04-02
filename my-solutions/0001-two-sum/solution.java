class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer>map= new HashMap<>();
      int n = nums.length;
      for(int i=0; i<n;i++){
        int x = nums[i];
        int more= target-x;
        if(map.containsKey(more)){
            return new int[]{map.get(more),i};
        }
        map.put(x,i);
      }  
      return new int[]{}; 
    }
}
