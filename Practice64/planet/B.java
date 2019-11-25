package planet;

public class B extends A {
	public void accessTest() {
		System.out.println(pub); 
		System.out.println(pro);
		System.out.println(def); 
		//System.out.println(prv); // private는 같은 class안에서만 사용 가능해서.
	
		F fobj = new F();
		fobj.accessTest(); 
		}
}
