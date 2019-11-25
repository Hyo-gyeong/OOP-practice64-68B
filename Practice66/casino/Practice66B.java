//컴퓨터학과 20190975 신효경
package casino;

public class Practice66B {

	public static void main(String[] args) {
		game.Dice dice1 = new game.Dice();
		game.Dice dice2 = new game.Dice();//초기화
		
		int i = 1;
		do {
			dice1.roll();
			dice2.roll();
			
			System.out.println(i+"차시 : 첫번째 "+dice1.toString()+", 두번째 "+dice2.toString());
			i++;
		}while (dice1.getValue() != dice2.getValue());
		
		System.out.println("게임이 종료되었습니다.");
	}

}
