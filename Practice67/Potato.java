//��ǻ���а� 20190975 ��ȿ��
public class Potato extends Food {
	public int getUnitPrice() {//���� ���Դ� ������ ���
		return price / (int)weight;
	}
	
	public String toString() {
		return "Į�θ�: "+calory+"\n����: "+price+"\n����: "+weight+"\n��������: "+getUnitPrice();
	}
}
