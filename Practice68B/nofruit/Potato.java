//��ǻ���а� 20190975 ��ȿ��
package nofruit;
import fruit.Food;

public class Potato extends Food {
	public int getUnitPrice() {//���� ���Դ� ������ ���
		return price / (int)weight;
	}
	
	protected Potato (int c, int p, double w) {
		setCalory(c);
		this.price = p;
		this.weight = w;
	}
	
	public String toString() {
		return "Į�θ�: "+getCalory()+"\n����: "+price+"\n����: "+weight+"\n��������: "+getUnitPrice();
	}
}
