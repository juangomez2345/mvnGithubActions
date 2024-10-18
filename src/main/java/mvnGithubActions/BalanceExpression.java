package mvnGithubActions;

import java.util.Deque;
import java.util.LinkedList;

public class BalanceExpression {
	public boolean isExpressionBalanced(String linea) {
		// Queue<Character> queue = Collections.asLifoQueue(new ArrayDeque<>());
		Deque<Character> queue = new LinkedList<Character>(); // LIFO <-> PILA
		boolean isExpressionValid = false;
		
		for (int i = 0; i < linea.length(); i++) {
			if (linea.charAt(i) == '{')
				queue.add(Character.valueOf('}'));
			else if (linea.charAt(i) == '(')
				queue.add(Character.valueOf(')'));
			else if (linea.charAt(i) == '[')
				queue.add(Character.valueOf(']'));
			else if (linea.charAt(i) == '}')
				isExpressionValid = verifica(queue, '}');
			else if (linea.charAt(i) == ')')
				isExpressionValid = verifica(queue,')');
			else if (linea.charAt(i) == ']')
				isExpressionValid = verifica(queue,']');
		}
		if (queue.isEmpty() && isExpressionValid) {
			return true;
		} else {
			return false;
		}
	}

	private boolean verifica(Deque<Character> queue, char c) {
		boolean isExpressionValid = true;
		if (queue.isEmpty()) {
			isExpressionValid = false;
		} else {
			Character s = (Character) queue.getLast();
			if (c == s.charValue()) {
				queue.removeLast();
			}
		}
		return isExpressionValid;
	}
}
