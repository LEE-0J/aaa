public class ClassEaxm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		Student lee = new Student();
		kim.name = "������";
		kim.grade = 3;
		lee.name = "�̹ο�";
		lee.grade = 2;
		System.out.println("�л��� �̸��� "+kim.name+ "�̰�, "+kim.grade+"�г��Դϴ�.");
		kim.floor();
		System.out.println("�л��� �̸��� "+lee.name+ "�̰�, "+lee.grade+"�г��Դϴ�.");
		lee.floor();
	}

}
class Student{
	String name;
	int grade;
	public void floor() {
		if(grade==3) {
			System.out.println("3�г��� 4���Դϴ�.");
		}
		else if(grade==2) {
			System.out.println("2�г��� 4���Դϴ�.");
		}
		else {
			System.out.println("1�г��� 6���Դϴ�.");
		}
	}
}