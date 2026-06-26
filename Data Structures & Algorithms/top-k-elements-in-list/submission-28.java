class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //hashMap: key: element, value: freq
        //minHeap 

        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int num : nums){
            hash.put(num, hash.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)-> a[1]-b[1]);
        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            minHeap.offer(new int[] {entry.getKey(), entry.getValue()});
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = minHeap.poll()[0];
        }

        return res;
    }
}
