public class Fibonacci {

	public int[] getFibonacci(int[] array, int n) {

		if ( n == array.length ) {
			return array;
		} else {
			array[n] = array[n-2] + array[n-1];
			return getFibonacci(array, ++n);
		}
	}
}