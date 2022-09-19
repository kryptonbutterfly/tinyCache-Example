package test.de.tinycodecrank.tc_example;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;
import static test.de.tinycodecrank.tc_example.matcher.LongMatcher.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FibonacciUncached
{
	private Integer n;
	
	public FibonacciUncached(Integer n)
	{
		this.n = n;
	}
	
	@Parameterized.Parameters
	public static Collection<Integer> data()
	{
		final var list = new ArrayList<Integer>();
		for (int n = 0; n < 41; n++)
			list.add(n);
		return list;
	}
	
	@Test
	public void fibonacciUncached()
	{
		final var fib = new de.tinycodecrank.tc_example.FibonacciUncached();
		
		final int result = fib.fibonacci(n);
		
		final long	minSteps	= (long) (n * n) - 20;
		final long	maxSteps	= (long) Math.pow(2, n);
		
		assertEquals(result, Precalculated.fibonacci(n));
		assertThat(
			(long) fib.invocations(),
			allOf(
				greaterEqualThan(minSteps),
				lessEqualThan(maxSteps)));
	}
}