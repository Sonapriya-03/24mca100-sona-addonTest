package basicintemediate;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter an odd number: ");
		        int n = scanner.nextInt();

		       
		        if (n % 2 == 0) {
		            System.out.println("Please enter an odd number.");
		
		        }

		        int mid = n / 2 + 1;

		       
		        for (int i = 1; i <= mid; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }

		      
		        for (int i = mid - 1; i >= 1; i--) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }

		        scanner.close();
		    }
		}
