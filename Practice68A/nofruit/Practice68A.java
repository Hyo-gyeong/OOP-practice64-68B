//��ǻ���а� 20190975 ��ȿ��
package nofruit;

public class Practice68A {

	public static void main(String[] args) {
		//Food f0 = new Food(); // �ٸ� package�� �ִ� class�� import�ؿ��� �ʾƼ�
		//Melon f1 = new Melon();// �ٸ� package�� �ִ� class�� import�ؿ��� �ʾƼ�
		Potato f2 = new Potato();
		
		//f0.calory = 100; // �׸��� default�� ���� package������ ��� �����ϱ⶧����
		//f0.price = 100;
		//f0.weight = 12.3;
		// ������ �� ����ϱ���鵵 ��� �Ұ�
		
		//f1.calory = 200; // �׸��� default�� ���� package������ ��� �����ϱ⶧����
		//f1.price = 200;
		//f1.weight = 5.5;
		//f1.FarmInfo = "���� �̿���";
		// ������ �� ����ϱ���鵵 ��� �Ұ�
		
		//f2.calory = 300;//default�� ���� ��Ű���������� ��� ����
		//f2.price = 200; //protected�� ��Ӱ���ų� ���� package���� ��� �����ؼ�
		//f2.weight = 50.0;//protected�� ��Ӱ���ų� ���� package���� ��� �����ؼ�
		
		System.out.println("������ �����Դϴ�.");
		//System.out.println(f0.toString());// �ٸ� package�� �ִ� class�� import�ؿ��� �ʾƼ�
		System.out.println();
		System.out.println("����� �����Դϴ�.");
		//System.out.println(f1.toString());// �ٸ� package�� �ִ� class�� import�ؿ��� �ʾƼ�
		System.out.println();
		System.out.println("������ �����Դϴ�.");
		System.out.println(f2.toString());
		System.out.println();
		System.out.println("������ ���������� "+f2.getUnitPrice()+"�Դϴ�.");
		
	}

}
