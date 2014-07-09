
public class Calculator {
	static int add(int a, int b) {
		return a + b;
	}
	static int min(int a, int b) {
		return a - b;
	}
	static int mult(int a, int b) {
		return a * b;
	}
	static int div(int a, int b) {
		return a / b;
	}	
	public static void main(String[] args){
		System.out.println("덧셈: " +  Calculator.add(1, 2));
		System.out.println("뺄셈 : " +  Calculator.min(1, 2));
		System.out.println("곱셈 : " +  Calculator.mult(1, 2));
		System.out.println("나눗셈 : " +  Calculator.div(1, 2));
	}
}
