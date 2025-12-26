class MathExceptions extends Exception {
	public MathExceptions(String error) {
		super(error);
	}
}

class Arrays {
	public static int findLargestElement(int[] a) {
		// complexity of this function is O(n)
		// it has linear complexity
		int largest = 0;

		for (int i = 0; i < a.length; i++) {
			if (largest < a[i]) {
				largest = a[i];
			}
		}
		return largest;
	}

	public static int[] reverseAnArray(int a[]) {
		// using swapping
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;

		}
		return a;
	}

	public static boolean isArraySorted(int arr[]) {
		boolean status = false;
		for (int i = 0; i < (arr.length) - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				status = true;
			}
		}
		return status;
	}

	public static void printAnArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	public static int sumArrayElement(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static int countOccurance(int arr[], int target) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				counter++;
			}
		}
		return counter;
	}

	public static int findSecondLargestElement(int arr[]) {

		int largest = arr[0];
		int secondLargest = arr[1];

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] != largest && secondLargest < arr[i]) {
				secondLargest = arr[i];
			}

		}
		return secondLargest;

	}

	public static void zerosAtEnd(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < arr.length) {
			arr[count++] = 0;
		}

	}

	public static int[] removeDuplicates(int arr[]) {
		// assume array is sorted
		int index = 0;
		int counter = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				counter++;
			}
			System.out.println(counter);
		}
		int tempArr[] = new int[arr.length - counter];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1] || i == 0) {
				tempArr[index] = arr[i];
				index++;
			}
		}
		arr = tempArr;
		return arr;
	}

	public static void main(String[] args) {
		// find largest Element
		int a[] = { 90, 43, 54, 21, 0, 0, 65, 87, 0, 98, 21, 0, 32 };
		int b[] = { 10, 20, 20, 30, 30, 40, 50, 50, 60 };
		// int largest = findLargestElement(a);

		// removeDuplicates(b);
		// printAnArray(b);
		int i = 100;
		int j = 0;

		try {
			j = i / 0;
			if (j == 0) {
				throw new MathExceptions("There must be a remider");

			}
		} catch (MathExceptions m) {
			System.out.println("Mathematical Exception Occured" + m);
		} catch (Exception e) {
			System.out.println("Something went wrong" + e);
		}
		
		


	}

}