class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int num : nums){
            hash.put(num, hash.getOrDefault(num,0)+1);
        }
        //Insert array of length 2: [number, frequency]
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)-> Integer.compare(a[1],b[1]));
        for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
            minHeap.add(new int[] {entry.getKey(), entry.getValue()});
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        for(int i = 0; i < k; i ++){
            answer[i] = minHeap.poll()[0];
        }
        return answer;
    }
}
