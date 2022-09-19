package test.de.tinycodecrank.tc_example.matcher;

import java.util.function.LongPredicate;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

public class LongMatcher extends BaseMatcher<Long>
{
	public static LongMatcher greaterThan(long target)
	{
		return new LongMatcher(target, num -> num > target, "value > ");
	}
	
	public static LongMatcher lessThan(long target)
	{
		return new LongMatcher(target, num -> num < target, "value < ");
	}
	
	public static LongMatcher greaterEqualThan(long target)
	{
		return new LongMatcher(target, num -> num >= target, "value >= ");
	}
	
	public static LongMatcher lessEqualThan(long target)
	{
		return new LongMatcher(target, num -> num <= target, "value <= ");
	}
	
	private final LongPredicate	test;
	private final String		description;
	
	private LongMatcher(long target, LongPredicate test, String description)
	{
		this.test			= test;
		this.description	= "\"" + description + target + "\"";
	}
	
	@Override
	public boolean matches(Object item)
	{
		return test.test((long) item);
	}
	
	@Override
	public void describeTo(Description description)
	{
		description.appendText(this.description);
	}
}