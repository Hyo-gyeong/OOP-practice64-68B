//컴퓨터학과 20190975 신효경
package nofruit;
import fruit.Food;

public class Potato extends Food {
	public int getUnitPrice() {//단위 무게당 가격을 계산
		return price / (int)weight;
	}
	
	public String toString() {
		return "칼로리: "+//calory+//calory가 default이기 때문에 같은 package내에서만 사용가능해서.
					"\n가격: "+price+"\n무게: "+weight+"\n단위가격: "+getUnitPrice();
	}
}
