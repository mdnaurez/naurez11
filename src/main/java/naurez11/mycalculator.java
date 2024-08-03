package naurez11;



public class mycalculator {
	public int sum(int a, int b) {
		return a+b;
	}
	public int diff(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	public void show() {
		System.out.println("hii i am naurez");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mycalculator c=new mycalculator();
		System.out.println("sum is"+c.sum(20, 10));
		System.out.println("sum is"+c.diff(20, 10));
		System.out.println("sum is"+c.mul(20, 10));
		System.out.println("sum is"+c.div(20, 10));
	}

}