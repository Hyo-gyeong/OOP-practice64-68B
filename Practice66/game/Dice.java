//컴퓨터학과 20190975 신효경
package game;

import java.util.Random;

public class Dice {
	Random rg = new Random();
	
	private int value;
	public int randNum;
	
	public Dice() {
		setValue(0);//초기화 
	}
	public void roll() {
		this.value = rg.nextInt(6)+1;//*R;
	}
	
	public int getValue() { return this.value; }
	private void setValue(int value) { this.value = value; } 
	
	public String toString() {
		return "주사위 = "+getValue();
	}
}