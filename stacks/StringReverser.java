import java.util.Stack;

public class StringReverser {
    public String reserve(String input){
        Stack<Character> stack = new Stack<>();
        if (input == null){
            throw new IllegalArgumentException();
        }

        for(char ch:input.toCharArray())
            stack.push(ch);
        
        StringBuffer reversed = new StringBuffer();
        while (!stack.empty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}