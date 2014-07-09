
public class Calculator02 {
	int add(int a, int b){
		return a + b;
	}
	int min(int a, int b){
		return a - b;
	}
	int multi(int a, int b){
		return a * b;
	}
	int div(int a, int b){
		return a / b;
	}
	public static void main(String[] args){
		Calculator02 cal = new Calculator02();
		System.out.println("덧셈: " +cal.add(1, 2));
		System.out.println("뺄셈: " +cal.min(1, 2));
		System.out.println("곱셈:  " +cal.multi(1, 2));
		System.out.println("나눗셈: " +cal.div(2, 2));		
	}
}
