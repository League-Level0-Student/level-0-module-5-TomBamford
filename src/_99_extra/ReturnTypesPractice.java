package _99_extra;

public class ReturnTypesPractice {
	public static void main(String[] args) {
		int x = method1();
		double x2 = method2();
		String x3 = method3();
		char x4 = method4();
		boolean x5 = method5();
		System.out.println(x);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		
		// GOAL: Figure out what each of these hidden methods returns
		// 1. Call each method
		
		// 2. Save the return of each method into a variable of the correct type(ex: String,int,etc)
		
		// 3. Print out each variable
		
	}
	
	static int method1() {
		return HiddenTypes.unknown1;
	}
	static double method2() {
		return HiddenTypes.unknown2;
	}
	static String method3() {
		return HiddenTypes.unknown3;
	}
	static char method4() {
		return HiddenTypes.unknown4;
	}
	static boolean method5() {
		return HiddenTypes.unknown5;
	}

}
