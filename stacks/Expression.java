import java.util.Stack;

public class Expression {
    public boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }
            if (isRightBracket(ch)) {
                if(stack.isEmpty()) return false;
                var top =stack.pop();
                if (bracketsMath(top,ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftBracket(char ch){
        return ch=='(' || ch=='<' || ch=='[' || ch=='{';
    }
    private boolean isRightBracket(char ch){
        return ch == ')' || ch=='>' || ch==']' || ch=='}';
    }
    private boolean bracketsMath(char left,char right){
        return (right == ')' && left !='(') ||
               (right == '>' && left !='<') ||
               (right == ']' && left !='[') ||
               (right == '}' && left !='{');
    }
}