//��ǻ���а� 20190975 ��ȿ��
package fruit;

public class Melon extends Food {
	String FarmInfo;
	
	public Melon (int c, int p, double w, String f) {
		this.calory = c;
		this.price = p;
		this.weight = w;
		this.FarmInfo = f;
	}
	
	public String toString() {
		return "Į�θ�: "+calory+"\n����: "+price+"\n����: "+weight+"\n������: "+FarmInfo;
	}

}
