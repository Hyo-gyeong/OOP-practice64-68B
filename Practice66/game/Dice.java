//��ǻ���а� 20190975 ��ȿ��
package game;

import java.util.Random;

public class Dice {
	Random rg = new Random();
	
	private int value;
	public int randNum;
	
	public Dice() {
		setValue(0);//�ʱ�ȭ 
	}
	public void roll() {
		this.value = rg.nextInt(6)+1;//*R;
	}
	
	public int getValue() { return this.value; }
	private void setValue(int value) { this.value = value; } 
	
	public String toString() {
		return "�ֻ��� = "+getValue();
	}
}