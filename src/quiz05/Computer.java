package quiz05;

public class Computer extends Calculator {
	
	double circle(int a) {
		pi = Math.PI;
		
		return pi*(a*a);
	}
	
	int square(int a) {
		return a*a;
	}
	
	int square(int a, int b) {
		return a*b;
	}
	
	int square(int a, int b, int c) {
		return a*b*c;
	}
}
