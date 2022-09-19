package de.tinycodecrank.tc_example;

abstract class InvCounter
{
	protected int invocations = 0;
	
	public int invocations()
	{
		return invocations;
	}
}