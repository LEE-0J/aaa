import java.util.Scanner;

public class AddExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		int c=0;
		Scanner in = new Scanner(System.in);
		System.out.print("시작 숫자 :");
		a = in.nextInt();
		System.out.print("마지막 숫자 :");
		b = in.nextInt();
		for(int i=a; i<=b;i++)
			c +=i; //c=c+i;
		System.out.println(a+"부터 "+b+"까지의 합은 "+c);
	}

}