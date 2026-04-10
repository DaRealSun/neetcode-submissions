class Solution {
    public int[] twoSum(int[] numbers, int target) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = numbers.length-1;
        while((numbers[left]+numbers[right] ) != target){
            if(numbers[left]+numbers[right] > target){
                right -= 1;
            }else{
                left += 1;
            }
        }
        return new int[]{left+1,right+1};
    }
}
