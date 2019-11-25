package planet;

class F {
	void accessTest()  {
		A aobj = new A();
		
		System.out.println(aobj.pub); 
		System.out.println(aobj.pro); 
		System.out.println(aobj.def); 
		//System.out.println(aobj.prv); //private는 같은 class안에서만 사용 가능해서 
	}
}
