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
public class FibonacciCached
{
	private Integer n;
	
	public FibonacciCached(Integer n)
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
	public void fibonacciCached()
	{
		final var fib = new de.tinycodecrank.tc_example.FibonacciCached();
		
		final int result = fib.fibonacci(n);
		
		final long	minSteps	= (long) n - 1;
		final long	maxSteps	= (long) n + 2;
		
		assertEquals(result, Precalculated.fibonacci(n));
		
		assertThat(
			(long) fib.invocations(),
			allOf(
				greaterThan(minSteps),
				lessThan(maxSteps)));
	}
}