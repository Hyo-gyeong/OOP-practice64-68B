//��ǻ���а� 20190975 ��ȿ��
package game;

public class Practice66A {

	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();//�ʱ�ȭ
		
		int i = 1;
		do {
			dice1.roll();
			dice2.roll();
			
			System.out.println(i+"���� : ù��° "+dice1.toString()+", �ι�° "+dice2.toString());
			i++;
		}while (dice1.getValue() != dice2.getValue());
		
		System.out.println("������ ����Ǿ����ϴ�.");
	}

}
