//컴퓨터학과 20190975 신효경
package fruit;

public class Melon extends Food {
	String FarmInfo;
	
	public Melon (int c, int p, double w, String f) {
		this.calory = c;
		this.price = p;
		this.weight = w;
		this.FarmInfo = f;
	}
	
	public String toString() {
		return "칼로리: "+calory+"\n가격: "+price+"\n무게: "+weight+"\n재배농장: "+FarmInfo;
	}

}
