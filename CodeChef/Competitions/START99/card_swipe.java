/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int N = sc.nextInt();
			int[] inputArray = getInput(sc, N);
			System.out.println(maxPeople(inputArray));
			T--;
		}
	}
	
private static int maxPeople(int[] cardSwipes) {
		Set<Integer> inOffice = new HashSet<>();
		
		int maxNumber = 0;
		
		for(int entry: cardSwipes) {
			if(inOffice.contains(entry))
				inOffice.remove(Integer.valueOf(entry));
			else
				inOffice.add(entry);
			
			if(inOffice.size() >= maxNumber)
				maxNumber = inOffice.size();
			
		}
		
		return maxNumber;
	}
	
	private static int[] getInput(Scanner sc, int N) {
		
		int[] input = new int[N];
		
		for(int i = 0;i < N;i++) {
			input[i] = sc.nextInt();
		}
		return input;
	}

}
