package _02_nested_loops._3_for_loop_gauntlet;

public class forloops {
	public static void main(String[] args) {
		for ( int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		for (int i = 2; i < 100; i++) {
			if ( i % 2 == 0)  {
				System.out.println(i);
			}
		}
		for (int i = 1; i < 99; i++) {
			if (i % 2 == 0) {
			}
			else {
				System.out.println(i);
			}
		}
		for ( int i = 1; i < 500; i++) {
			if ( i % 2 ==0) {
				System.out.println(i + " " + "is even");
			}
			else {
				System.out.println(i + " " + "is odd");
			}
		}
		for (int i = 7; i < 777; i++) {
			if ( i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		for( int i = 0; i < 15; i++) {
			int date = 2006 + i;
			System.out.println("I was" + " " + i + " " + "in" + " " + date);
		}
		for(int i = 0; i < 3; i++) {
			
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}
			}
		int n = 1; 
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
					System.out.print(n + " ");
					n = n+1;
			}
			System.out.println();
			}
		int k = 1;
		for( int i = 0; i < 10; i ++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(k + " ");
				k = k+1;
			}
			System.out.println();
		}
		String v = "*";
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(v);
			}
			System.out.println();
		}
		}
	}

