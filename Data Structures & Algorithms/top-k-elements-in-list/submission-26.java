class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //key = element, value = frequency
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            //it is nums in getOrDefault not nums[i]
            hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)-> a[1]-b[1]);
        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            minHeap.offer(new int[]{entry.getKey(), entry.getValue()});
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[] answer = new int[k];
        for(int i = 0; i < k; i++){
            answer[i] = minHeap.poll()[0];
        }
        return answer;
    }
}
