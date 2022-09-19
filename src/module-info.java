module tinyCache_Example
{
	exports test.de.tinycodecrank.tc_example to junit;
	
	requires transitive de.tinycodecrank.Cache;
	requires junit;
	requires jdk.incubator.vector;
	requires org.junit.jupiter.api;
	requires org.hamcrest.core;
}