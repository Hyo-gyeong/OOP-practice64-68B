//��ǻ���а� 20190975 ��ȿ��
package fruit;

public class Food {
	int calory;
	protected int price;
	protected double weight;
	
	protected Food() {
		this.calory = 0;
		this.price = 0;
		this.weight = 0;
	}
	
	public Food (int c, int p, double w) {
		this.calory = c;
		this.price = p;
		this.weight = w;
	}
	
	protected int getCalory() { return this.calory; }
	protected void setCalory (int c) { this.calory = c; }
	
	public String toString() {
		return "Į�θ�: "+calory+"\n����: "+price+"\n����: "+weight;
	}
}
