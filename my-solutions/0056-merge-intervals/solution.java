class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        int n = intervals.length;
        int start = intervals[0][0];
        int end = intervals[0][1];
        int i = 1;
        while (i < n) {
            if (end >= intervals[i][0]) {
                while (i < n && end >= intervals[i][0]) {
                    end = Math.max(end, intervals[i][1]);
                    i++;
                }
                ans.add(Arrays.asList(start, end));
                if (i < n) {
                    start = intervals[i][0];
                    end = intervals[i][1];
                }

                i++;
            } else if (end < intervals[i][0]) {
                ans.add(Arrays.asList(start, end));
                start = intervals[i][0];
                end = intervals[i][1];
                i++;
            }
        }
        if(i<n+1)
        ans.add(Arrays.asList(start, end));
        int[][] ansToReturn = new int[ans.size()][2];

        for(int k=0;k<ans.size();k++){
            ansToReturn[k][0] = ans.get(k).get(0);
            ansToReturn[k][1] = ans.get(k).get(1);
        }
        return ansToReturn;
    }
}
