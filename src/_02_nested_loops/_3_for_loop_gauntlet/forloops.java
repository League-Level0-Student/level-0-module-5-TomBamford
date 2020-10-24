package _02_nested_loops._3_for_loop_gauntlet;

public class forloops {
	public static void main(String[] args) {
		for ( int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		for (int i = 101; i > 0; i--) {
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
				System.out.println(i + "is even");
			}
			else {
				System.out.println(i + "is odd");
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
	}
}
