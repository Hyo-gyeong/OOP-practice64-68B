//��ǻ���а� 20190975 ��ȿ��
package nofruit;
import fruit.*;

public class Practice68B {

	public static void main(String[] args) {
		Food f0 = new Food(100, 100, 12.3);
		Melon f1 = new Melon(200, 200, 5.5, "���� �̿���");
		Potato f2 = new Potato(300, 200, 50.0);
		
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
