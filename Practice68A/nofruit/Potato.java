//��ǻ���а� 20190975 ��ȿ��
package nofruit;
import fruit.Food;

public class Potato extends Food {
	public int getUnitPrice() {//���� ���Դ� ������ ���
		return price / (int)weight;
	}
	
	public String toString() {
		return "Į�θ�: "+//calory+//calory�� default�̱� ������ ���� package�������� ��밡���ؼ�.
					"\n����: "+price+"\n����: "+weight+"\n��������: "+getUnitPrice();
	}
}
