class Solution {
    public int maxArea(int[] h) {
        int left = 0;
        int right = h.length-1;
        int max = Math.min(h[left], h[right])*(right-left);
        for(int i=0;i< 1.5 * h.length ;i++){
            if(left==right){
                break;
            }
            int area = Math.min(h[left], h[right])*(right-left);
            if(area > max){
                max=area;
            }else{
                if(h[left] < h[right]){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return max;
    }
}
