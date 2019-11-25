//컴퓨터학과 20190975 신효경
package nofruit;
import fruit.*;

public class Practice68B {

	public static void main(String[] args) {
		Food f0 = new Food(100, 100, 12.3);
		Melon f1 = new Melon(200, 200, 5.5, "좋은 이웃들");
		Potato f2 = new Potato(300, 200, 50.0);
		
		System.out.println("음식의 정보입니다.");
		System.out.println(f0.toString());
		System.out.println();
		System.out.println("멜론의 정보입니다.");
		System.out.println(f1.toString());
		System.out.println();
		System.out.println("감자의 정보입니다.");
		System.out.println(f2.toString());
		System.out.println();
		System.out.println("감자의 단위가격은 "+f2.getUnitPrice()+"입니다.");
		
	}

}
