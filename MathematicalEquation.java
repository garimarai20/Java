import java.util.*;

public class MathematicalEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: The equation as a string
        String equation = scanner.nextLine();
        
        // Output: All possible equations formed by adding parentheses
        List<String> result = addParentheses(equation);
        
        for (String res : result) {
            System.out.println(res);
        }
    }
    
    public static List<String> addParentheses(String equation) {
        // Use memoization to store results of subproblems
        Map<String, List<String>> memo = new HashMap<>();
        return addParenthesesHelper(equation, memo);
    }
    
    private static List<String> addParenthesesHelper(String equation, Map<String, List<String>> memo) {
        // If the result is already computed, return it from the memo
        if (memo.containsKey(equation)) {
            return memo.get(equation);
        }
        
        List<String> result = new ArrayList<>();
        
        // If the equation is a single number, return it as the only possibility
        if (isNumber(equation)) {
            result.add(equation);
            memo.put(equation, result);
            return result;
        }
        
        // Try splitting the equation at each operator
        for (int i = 0; i < equation.length(); i++) {
            char c = equation.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                // Recursively solve the left and right parts
                List<String> leftPart = addParenthesesHelper(equation.substring(0, i), memo);
                List<String> rightPart = addParenthesesHelper(equation.substring(i + 1), memo);
                
                // Combine the results from the left and right parts with the current operator
                for (String left : leftPart) {
                    for (String right : rightPart) {
                        result.add("(" + left + c + right + ")");
                    }
                }
            }
        }
        
        // Store the result in the memo before returning
        memo.put(equation, result);
        return result;
    }
    
    private static boolean isNumber(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
