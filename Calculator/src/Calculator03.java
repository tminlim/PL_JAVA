
public class Calculator03 {
	int num;
	Calculator03(int num) {
		this.num = num;
	}
	int add(int operand){
		return num + operand;
	}
	public static void main(String[] args){
		Calculator03 cal = new Calculator03(11);
		System.out.println("덧셈: " + cal.add(9));
	}
}
