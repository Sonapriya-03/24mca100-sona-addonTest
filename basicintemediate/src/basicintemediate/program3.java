package basicintemediate;

public class program3 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 50, 30, 40};

        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements may be equal).");
        } else {
            System.out.println("Second largest element = " + secondLargest);
        }

	}

}
