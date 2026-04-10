class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>a = new ArrayList<>();

        for(int i = 0; i< nums.length-1 ; i++) {
            int left = i+1;
            int right = nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(left< right){
            
                if((nums[i]+nums[left]+nums[right]) < 0){
                    left +=1;
                }else if ((nums[i]+nums[left]+nums[right]) > 0){
                    right -=1;
                }else{
                    List<Integer> b = new ArrayList<>();
                    b.add(nums[i]);
                    b.add(nums[left]);
                    b.add(nums[right]);
                    a.add(b);
                    while(left<right && nums[left] == nums[left+1] ){
                        left++;
                    }
                    while(left<right && nums[right ]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return a;
    }
}
