class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
      int retainCount=0;
      int lastEnd=Integer.MIN_VALUE;
      
      for(int []interval:intervals){
        if(lastEnd<=interval[0]){
            retainCount++;
            lastEnd=interval[1];
        }
      }
      return intervals.length-retainCount;  
    }
}