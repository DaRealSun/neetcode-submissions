class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Set<String> set = Set.of("+","-","*","/");
        for(int i = 0; i<tokens.length; i++){
            if(!set.contains(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch(tokens[i]){
                case "+": stack.push(val2+val1); break;
                case "-": stack.push(val2-val1); break;
                case "*": stack.push(val2*val1); break;
                case "/": stack.push(val2/val1); break;
            }
            }
        }
        return stack.pop();
    }
}
