class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        System.arraycopy(nums1,0,arr,0,m);
        System.arraycopy(nums2,0,arr,m,n);
       Arrays.sort(arr);
       double median=0;
       if (arr.length%2==1)
       {
           median = arr[arr.length/2];

       }
       if (arr.length%2==0)
       {
           median = (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
       }
       return median;
  }
}
