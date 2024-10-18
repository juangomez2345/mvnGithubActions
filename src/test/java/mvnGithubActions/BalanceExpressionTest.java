package mvnGithubActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BalanceExpressionTest {
	
	@Test
	public void testBalanceExpression1() {
		BalanceExpression balanceExpression = new BalanceExpression();
		assertEquals(true, balanceExpression.isExpressionBalanced("[]"));
	}
	
	@Test
	public void testBalanceExpression2() {
		BalanceExpression balanceExpression = new BalanceExpression();
		assertEquals(false, balanceExpression.isExpressionBalanced("}"));
	}
}
