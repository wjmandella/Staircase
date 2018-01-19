// My solution to the HackerRank "Staircase" problem.
// https://www.hackerrank.com/challenges/staircase/problem.

import java.util.Scanner;

public class StaircaseApp {

	    static void staircase(int n) {
	    	String blank = " ";
	    	for(int i = 1; i <= n; i++) {
	    		for(int j=1; j <= n - i; j++) {
	    			System.out.print(blank);	    			
	    		}
	    		for(int k=1; k <= i; k++) {
	    			System.out.print("X");
	    		}
	    		System.out.println();
	    	}	    	
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter the number of stairs (n): ");
	        int n = in.nextInt();
	        staircase(n);
	        in.close();
	    }
	}