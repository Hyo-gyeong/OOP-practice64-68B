//컴퓨터학과 20190975 신효경
public class Potato extends Food {
	public int getUnitPrice() {//단위 무게당 가격을 계산
		return price / (int)weight;
	}
	
	public String toString() {
		return "칼로리: "+calory+"\n가격: "+price+"\n무게: "+weight+"\n단위가격: "+getUnitPrice();
	}
}
