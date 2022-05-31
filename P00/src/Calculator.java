
public class Calculator {
	public int add(int a, int b) {
		int total = a + b;
		if (total > 9999 || total < 0) {
			total = 0;
		}
		return total;
	}
	
	public int subtract(int a, int b) {
		int total = a - b;
		if (total >= 9999 || total <= 0) {
			total = 0;
		}
		return total;
	}
	
	public int multiply(int a, int b) {
		int total = a * b;
		if (total > 9999 || total < 0) {
			total = 0;
		}
		return total;
	}
	
	public int divide (int a, int b) {
		int total = a / b;
		if (total < 0) {
			total = 0;
		}
		return total;
	}

}
