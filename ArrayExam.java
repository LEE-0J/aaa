import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner  aa = new Scanner(System.in);
		int arr[]= new int[5];
		int max = 0;
		int j = 0;
		
		for(int i=0; i<arr.length; i++) {	//배욜에 값 입력
			System.out.println((i+1)+"번 입력: ");
			arr[i] = aa.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				j=i+1; //가장 큰 값을 가지는 배열 인덱스5
			}
		}
		System.out.println("가장 큰 수는 "+j+"번째 숫자인"+max);
	}

}