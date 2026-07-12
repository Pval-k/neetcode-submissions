class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int j = 0; j < nums.length; j++) {
            int i = j-k+1;
            maxHeap.offer(new int[]{nums[j], j});
            
            while (maxHeap.peek()[1] < i) {
                maxHeap.poll();
            }

            if (i>=0) {
                result[i] = maxHeap.peek()[0];
            }

        }
        return result;
    }
}
