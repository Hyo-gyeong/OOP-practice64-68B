package universe;
import    planet.A;

public class E {
	void accessTest()  {
		A aobj = new A(); 
		
		System.out.println(aobj.pub);
		//System.out.println(aobj.pro);//
		//System.out.println(aobj.def);// default는 같은 package내에서만 사용 가능해서.
		//System.out.println(aobj.prv);// private는 같은 class안에서만 사용 가능해서.
	
		/*F fobj = new F();
		fobj.accessTest(); */ //F가  default이기때문에 동일한 패키지 내에서만 사용가능해서.
		}
}
