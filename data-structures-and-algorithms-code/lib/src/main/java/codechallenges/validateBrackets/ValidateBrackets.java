package codechallenges.validateBrackets;

import datastructures.stack.Stack;

public class ValidateBrackets {

    public Boolean validateBrackets(String string) throws Exception {
        String [] returnedArray = string.split("");
        if (returnedArray.length % 2 != 0) return false;
        Stack stack = new Stack();
        for(String str1 : returnedArray) {
            if (str1.equals("(") || str1.equals("{") || str1.equals("[")) {
                stack.push(str1);
            } else if (str1.equals(")") && stack.peek().equals("(") && !stack.isEmpty() ||
                    str1.equals("}") && stack.peek().equals("{") && !stack.isEmpty()||
                    str1.equals("]") && stack.peek().equals("[")&& !stack.isEmpty())
            {
                stack.pop();
            }
        }
        return stack.isEmpty();
        }
}
