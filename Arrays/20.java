class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<Character>();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.add(s.charAt(i));
            }
            else {
                if (stack.size() != 0) {
                    if (s.charAt(i) == ')') {
                        if (stack.get(stack.size()-1) == '(') {
                            stack.remove(stack.size()-1);
                        }
                        else {
                            return false;
                        }
                    }
                    if (s.charAt(i) == '}') {
                        if (stack.get(stack.size()-1) == '{') {
                            stack.remove(stack.size()-1);
                        }
                        else {
                            return false;
                        }
                    }
                    if (s.charAt(i) == ']') {
                        if (stack.get(stack.size()-1) == '[') {
                            stack.remove(stack.size()-1);
                        }
                        else {
                            return false;
                        }
                    }
                }
                else {
                    return false;
                }
            }
        }

        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
}