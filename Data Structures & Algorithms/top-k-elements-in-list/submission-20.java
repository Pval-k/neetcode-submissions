class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Key: Element
        //Value: frequency
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int num : nums){
            hash.put(num, hash.getOrDefault(num,0)+1);
        }
        //int[0]: element
        //int[1]: frequency
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
            minHeap.add(new int[] {entry.getKey(), entry.getValue()});
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
