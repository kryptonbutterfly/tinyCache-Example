package de.tinycodecrank.tc_example;

public final class FibonacciUncached extends InvCounter
{
	public int fibonacci(int index)
	{
		invocations++;
		if (index == 0 || index == 1)
			return index;
		else
			return fibonacci(index - 2) + fibonacci(index - 1);
	}
}