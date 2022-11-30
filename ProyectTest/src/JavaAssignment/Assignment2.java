package JavaAssignment;
public class Assignment2 {
		public int sum(int a, int b) {
		int c;
		c=a+b;
		System.out.println("Sum result is: " +c);
		return c;
			}
		public int sub(int d, int e) {
		int f;
		f=d-e;
		System.out.println("Sub result is: " +f);
		return f;
			}
		public int mul(int d, int e) {
		int f;
		f=d*e;
		System.out.println("Mul result is: " +f);
		return f;
			}
		public int div(int d, int e) {
		int f;
		f=d/e;
		System.out.println("Div result is: " +f);
		return f;
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 obj=new Assignment2();
		int resultSum=obj.sum(10, 4);
		int resultSum2=obj.sum(resultSum, 12);
		int resultSub=obj.sub(resultSum2, 4);
		int resultMul=obj.mul(15, 4);
		int resultDiv=obj.div(12, 4);
		int resultDiv2=obj.div(resultDiv, 1);
		}

}
