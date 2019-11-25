//컴퓨터학과 20190975 신효경
package nofruit;

public class Practice68A {

	public static void main(String[] args) {
		//Food f0 = new Food(); // 다른 package에 있는 class를 import해오지 않아서
		//Melon f1 = new Melon();// 다른 package에 있는 class를 import해오지 않아서
		Potato f2 = new Potato();
		
		//f0.calory = 100; // 그리고 default는 같은 package에서만 사용 가능하기때문에
		//f0.price = 100;
		//f0.weight = 12.3;
		// 생성자 못 만드니까변수들도 사용 불가
		
		//f1.calory = 200; // 그리고 default는 같은 package에서만 사용 가능하기때문에
		//f1.price = 200;
		//f1.weight = 5.5;
		//f1.FarmInfo = "좋은 이웃들";
		// 생성자 못 만드니까변수들도 사용 불가
		
		//f2.calory = 300;//default는 같은 패키지내에서만 사용 가능
		//f2.price = 200; //protected는 상속관계거나 같은 package에서 사용 가능해서
		//f2.weight = 50.0;//protected는 상속관계거나 같은 package에서 사용 가능해서
		
		System.out.println("음식의 정보입니다.");
		//System.out.println(f0.toString());// 다른 package에 있는 class를 import해오지 않아서
		System.out.println();
		System.out.println("멜론의 정보입니다.");
		//System.out.println(f1.toString());// 다른 package에 있는 class를 import해오지 않아서
		System.out.println();
		System.out.println("감자의 정보입니다.");
		System.out.println(f2.toString());
		System.out.println();
		System.out.println("감자의 단위가격은 "+f2.getUnitPrice()+"입니다.");
		
	}

}
