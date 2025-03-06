package interview.fb;

import java.util.Stack;

public class PatternProgram {
    public static void main(String[] args) {
        String str = "3[a2[c]]3[a2[c]]";
        System.out.println(pattern(str));
    }

    public static String pattern(String str) {
        // stack
        // queue
        Stack<Integer> stack = new Stack<>();
        Stack<StringBuilder> strstack = new Stack<>();
        // Initialize stack to store characters and numbers

        StringBuilder curStr = new StringBuilder();
        int currentNumber = 0;
        for (char ch : str.toCharArray()) {
            // check ch is number
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber + ch - '0';
            }else if(ch == '[') {
                stack.push(currentNumber);
                strstack.push(new StringBuilder(curStr));
                curStr = new StringBuilder();
                currentNumber = 0;

            }else if(ch == ']'){
                int repeatCount = stack.pop();
                StringBuilder decodedstr = strstack.pop();
                for(int i=0;i<repeatCount;i++){
                    decodedstr.append(curStr);
                }
                curStr = decodedstr;

            }else{
                curStr.append(ch);
            }
        }
        return curStr.toString();
    }
}
