package de.tinycodecrank.tc_example;

import de.tinycodecrank.cache.Cache;
import de.tinycodecrank.cache.FIFOCache;

public final class FibonacciCached extends InvCounter
{
	@Cache(cache = FIFOCache.class, capacity = 2)
	public int fibonacci(int index)
	{
		invocations++;
		if (index == 0 || index == 1)
			return index;
		else
			return fibonacci(index - 2) + fibonacci(index - 1);
	}
}