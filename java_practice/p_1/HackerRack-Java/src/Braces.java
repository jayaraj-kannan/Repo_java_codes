import java.util.Stack;

public class Braces {
	public static void main(String[] args) {
		 String brackets1 = "{[]()}";
	        String brackets2 = "{[()]}";
	        String brackets3 = "{[()]";
		 System.out.println(brackets1 + " is " + (isBalanced(brackets1) ? "balanced" : "not balanced"));
	        System.out.println(brackets2 + " is " + (isBalanced(brackets2) ? "balanced" : "not balanced"));
	        System.out.println(brackets3 + " is " + (isBalanced(brackets3) ? "balanced" : "not balanced"));
	}
	public static boolean isBalanced(String brackets) {
        Stack<Character> stack = new Stack<>();
        brackets.chars()
                .mapToObj(c -> (char) c)
                .forEach(c -> {
                    if (c == '{' || c == '[' || c == '(') {
                        stack.push(c);
                    } else if (c == '}' || c == ']' || c == ')') {
                        if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
                            stack.push('X'); // push a dummy value to indicate that the brackets are not balanced
                        }
                    }
                });
        return stack.isEmpty();
    }

    private static boolean isMatching(char opening, char closing) {
        return (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']') ||
                (opening == '(' && closing == ')');
    }

}
