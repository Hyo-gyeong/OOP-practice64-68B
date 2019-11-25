package out;

import    planet.*;
import    universe.*;

public class T {
	public static void main(String[] args) {
		B bobj = new B();
		bobj.accessTest();
	
		E eobj = new E();
		//eobj.accessTest();//accessTest가 default이기때문에 동일한 package내에서만 사용 가능해서. 
	
		//F fobj = new F();//F가  default이기때문에 동일한 패키지 내에서만 사용가능해서.
	}
}
