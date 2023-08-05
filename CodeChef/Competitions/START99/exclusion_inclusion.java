
import java.util.Scanner;

class Codechef{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int N = sc.nextInt();
			int[] inputArray = getInput(sc, N);
			calculateMaxScore(inputArray);
			T--;
		}
	}
	
	private static int[] getInput(Scanner sc, int N) {
		int[] A = new int[N];
		for(int i = 0;i<A.length;i++) {
			A[i] = sc.nextInt();
		}
		return A;
	}
	
	private static void calculateMaxScore(int []A) {
		int K = 0;
		int sum = 0;
		int max = 0;
		
		for(int el: A) {
			sum += el;
			if(el > max) {
				max = el;
			}
		}
		
		
		for(int i = K;i < A.length;i++) {
			if(i == 0) {
				System.out.println(sum);
				continue;
			}
			else if(i == A.length-1) {
				System.out.println(max);
				continue;
			}
			
			
		}

	}
	
}
