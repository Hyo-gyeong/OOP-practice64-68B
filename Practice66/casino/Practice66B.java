//��ǻ���а� 20190975 ��ȿ��
package casino;

public class Practice66B {

	public static void main(String[] args) {
		game.Dice dice1 = new game.Dice();
		game.Dice dice2 = new game.Dice();//�ʱ�ȭ
		
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
