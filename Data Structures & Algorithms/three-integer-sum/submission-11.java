class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); 
        
        for(int i = 0; i < nums.length; i++){
            //check for duplicate i
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            
            while(j<k){
                int total = nums[i] + nums[j] + nums[k];
                if(total == 0){
                res.add(Arrays.asList(nums[i], nums[j], nums[k])); 

                //check duplicate j
                while(j<k && nums[j] == nums[j+1]){
                    j++;
                }
                //check duplicate k
                while(j<k && nums[k] == nums[k-1]){
                    k--;
                }

                j++;
                k--;
                }
                else if(total > 0){
                    k--;
                }
                else{
                    j++;
                }
            
            }

        }
        return res;
    }
}
