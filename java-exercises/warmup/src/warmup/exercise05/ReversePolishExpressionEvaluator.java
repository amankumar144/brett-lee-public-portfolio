package warmup.exercise05;

import java.util.Stack;

/**
 * From: http://elementsofprogramminginterviews.com/2015-04-01-warming-up/
 * 
 * Stacks and Queues: Write a program to evaluate arithmetical expressions that
 * use + and applied to nonnegative integer arguments. Expressions are in
 * reverse-Polish notation, e.g., 3 4 + 5 , 1 3 + 5 7 + *.
 * 
 * @author leebrett https://github.com/leebrett/brett-lee-public-portfolio
 */
public class ReversePolishExpressionEvaluator {

	public static int evaluate(final String expression) throws Exception {
		final Stack<Integer> operands = new Stack<Integer>();
		final String[] expressionParts = expression.split("\\s");
		for (String part : expressionParts) {
			Integer value = getInteger(part);
			if (value != null) {
				operands.push(value);
			} else {
				switch (part) {
				case "+":
					operands.push(operands.pop() + operands.pop());
					break;
				case "-": {
						int secondOp = operands.pop(), firstOp = operands.pop();
						operands.push(firstOp - secondOp);
					}
					break;
				case "*":
					operands.push(operands.pop() * operands.pop());
					break;
				case "/":{
						int secondOp = operands.pop(), firstOp = operands.pop();
						operands.push(firstOp / secondOp);
					}
					break;
				default:
					throw new Exception(String.format(
							"Operator '%s' not supported.", part));
				}
			}
		}
		return operands.pop();
	}

	private static Integer getInteger(String part) {
		try {
			return Integer.parseInt(part);
		} catch (NumberFormatException e) {
			return null;
		}
	}

}
