class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //res
        List<List<Integer>> res = new ArrayList<>();
        //increasing order
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            int j = i+1;
            int k = nums.length-1;

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            while(j<k){
                int total = nums[i] + nums[j] + nums[k];

                if(total == 0){
                    while(j<k && nums[j] == nums[j+1]){
                        j++;
                    }
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(total < 0){
                    j++;
                }
                else{
                    k--;
                }
            }

        }
        return res;
    }
}
