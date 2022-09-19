package test.de.tinycodecrank.tc_example;

public class Precalculated
{
	/**
	 * The values of the fibonacci series from 0 to 40
	 */
	private static final int[] fibonacci = {
		0,
		1,
		1,
		2,
		3,
		5,
		8,
		13,
		21,
		34,
		55,
		89,
		144,
		233,
		377,
		610,
		987,
		1597,
		2584,
		4181,
		6765,
		10946,
		17711,
		28657,
		46368,
		75025,
		121393,
		196418,
		317811,
		514229,
		832040,
		1346269,
		2178309,
		3524578,
		5702887,
		9227465,
		14930352,
		24157817,
		39088169,
		63245986,
		102334155
	};
	
	/**
	 * This method looks up the value for the given n in a precalculated table.
	 * 
	 * @param n
	 * @return the value of the fibonacci series associated with n
	 */
	public static final int fibonacci(int n)
	{
		return fibonacci[n];
	}
}