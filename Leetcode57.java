// You are given an array of non-overlapping intervals intervals
// where intervals[i] = [starti, endi] represent the start and the end 
// of the ith interval and intervals is sorted in ascending order by starti.
// You are also given an interval newInterval = [start, end] that represents the 
// start and end of another interval.

// Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

// Return intervals after the insertion.

// Note that you don't need to modify intervals in-place. You can make a new array and return it.


//----------CODE

// class Solution {
//     public int[][] insert(int[][] intervals, int[] newInterval) {
//         List<int[]>list=new ArrayList<>();
//         // step1 
//         int i=0;
//         while(i < intervals.length && intervals[i][1] < newInterval[0]){
//             list.add(intervals[i++]);
//         }
//         // step2
//         while(i < intervals.length && intervals[i][0] <= newInterval[1]){
//             newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
//             newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
//             i++;
//         }
//         list.add(newInterval);
//         // step3
//         while(i < intervals.length){
//             list.add(intervals[i++]);
//         }
//         return list.toArray(new int[list.size()][]);
//     }
// }