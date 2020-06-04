import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner c = new Scanner(System.in);
		System.out.print("아동 수:");
		a = c.nextInt();
		
		System.out.print("성인 수:");
		b = c.nextInt();
		
		
		System.out.println("총수량:"+ (a+b));
		System.out.println("금액:"+ (a*6000 + b*8000));
		
	}

}
