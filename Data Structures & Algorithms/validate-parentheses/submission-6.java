class Solution {
    public boolean isValid(String s) {
        char[] a = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        if (s.length() % 2 != 0) {
            return false;
        }
        for (char c : a) {
            if ((map.containsKey(c))) {
                stack.push(c);
            } else {
            if(stack.isEmpty()) return false;
            if (c != map.get(stack.pop())) return false;

            }
        }
    return stack.isEmpty();
    }
}
