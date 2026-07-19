class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];

        //0th index: Elem/#
        //1st index: index of that elem
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[0]-a[0]);

        int j = 0;
        int i = j-k+1;

        while(j< nums.length){
             maxHeap.offer(new int[] {nums[j], j});

            while(i > maxHeap.peek()[1]){
                maxHeap.poll();
            }

            if(i >= 0){
                res[i] = maxHeap.peek()[0];
            }

            j++;
            i++;
        }
        return res;
        
    }
}
