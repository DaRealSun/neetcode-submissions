class Solution {
    public boolean isValid(String s) {
        char[] a = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        for(int i = 0; i<a.length; i++){
            if(map.containsKey(a[i])){
                stack.push(map.get(a[i]));
            }
            else{
                if( stack.isEmpty() || stack.pop()!=a[i]){
                    return false;
                }
            }
        }
            return stack.isEmpty();
    
    }
}
