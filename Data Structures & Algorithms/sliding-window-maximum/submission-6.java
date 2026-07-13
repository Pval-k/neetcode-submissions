class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        //[Element, Index]
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[0]-a[0]);

        //how to remember to initialize j first
        int j = 0;
        int i = j-k+1;

        while(j<nums.length){
            maxHeap.offer(new int[] {nums[j], j});

            //make sure maxHeap has only valid numbers
            //valid number: numbers within th window
            while(j<nums.length && maxHeap.peek()[1] < i){
                maxHeap.poll();
            }

            if(i>=0){
                res[i] = maxHeap.peek()[0];
            }
            j++;
            i++;

        }
        return res;
    }
}
