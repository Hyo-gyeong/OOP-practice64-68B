//��ǻ���а� 20190975 ��ȿ��
public class Practice67 {

	public static void main(String[] args) {
		Food f0 = new Food();
		Melon f1 = new Melon();
		Potato f2 = new Potato();
		
		f0.calory = 100;
		f0.price = 100;
		f0.weight = 12.3;
		
		f1.calory = 200;
		f1.price = 200;
		f1.weight = 5.5;
		f1.FarmInfo = "���� �̿���";
		
		f2.calory = 300;
		f2.price = 200;
		f2.weight = 50.0;
		
		System.out.println("������ �����Դϴ�.");
		System.out.println(f0.toString());
		System.out.println();
		System.out.println("����� �����Դϴ�.");
		System.out.println(f1.toString());
		System.out.println();
		System.out.println("������ �����Դϴ�.");
		System.out.println(f2.toString());
		System.out.println();
		System.out.println("������ ���������� "+f2.getUnitPrice()+"�Դϴ�.");
		
	}

}
