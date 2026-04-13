class Solution {
    public int[] dailyTemperatures(int[] temps) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temps.length];
        for(int i =0; i<temps.length; i++){
            while(!stack.isEmpty() && temps[i]>temps[stack.peek()]){
                int j = stack.pop();  
                result[j]=(i-j);  
            }
            stack.push(i);

        }
        return result;
    }
}
