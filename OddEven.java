/*
 * OddEven.java
 * 
 * Version:
 *          $Id$
 * 
 * Revisions:
 *          $Log$
 * 
 */

/*
 *@Problem       : Sorts in-place/single-pass an array such that odd numbers occur after even numbers 
 *@Author        : Sharath Navalpakkam Krishnan : nksharath@gmail.com
 *@Version       : 1.0.1
 *@LastModified  : 05/03/2014 4.55 PM
 *
 */
class OddEven {
	int rPointer, fPointer;
	static int[] array = { 2, 1, 4, 3, 6, 8, 9, 5, 1, 3, 5, 7, 9, 0, 0, 0, 0, 0 };
	int complexityCount = 0;// To record number of times an array element was
							// inspected(To verify single pass)

	// static int []array={0,0,0,0};// Test case : All even
	// static int []array={1,1,1,1};// Test case : All odd
	// static int []array={1,3,5,7,9,2,4,6,8};// Test case : All Odd followed by
	// All Even
	public void initialize(int length) {
		fPointer = 0;
		rPointer = length - 1;
	}

	public int nextEven() {
		if (rPointer == 0)
			return 0;

		for (; rPointer != fPointer; rPointer--) {
			complexityCount++;
			if (array[rPointer] % 2 == 0) {
				return rPointer;
			}
		}
		return 0;
	}

	public void solvePuzzle() {
		initialize(array.length);
		for (; fPointer != rPointer; fPointer++) {

			complexityCount++;

			if (array[fPointer] % 2 != 0) {
				int index = nextEven();
				if (index == 0)
					break;
				int temp = array[fPointer];
				array[fPointer] = array[index];
				array[index] = temp;
				rPointer--;
			}
		}

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();
		System.out.println("Number of array inspections : " + complexityCount);
	}

	public static void main(String args[]) {
		OddEven obj = new OddEven();
		obj.solvePuzzle();
	}
}
