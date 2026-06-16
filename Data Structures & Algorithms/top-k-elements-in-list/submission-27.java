class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //key: element; value: freq
        HashMap<Integer, Integer> hash = new HashMap<>();

        //fill hash
        for(int num : nums){
            hash.put(num, hash.getOrDefault(num, 0)+1);
        }

        //get k most freq from hash

        //minHeap
        //entry
        //key: num, balue: freq
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[1]-b[1]);

        for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
            minHeap.offer(new int[] {entry.getKey(), entry.getValue()});
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0; i < res.length; i++){
            res[i] = minHeap.poll()[0];
        }

        return res;
    }
}
