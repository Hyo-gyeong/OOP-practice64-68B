package universe;
import    planet.A;

public class D extends A {
	void accessTest()  {
		System.out.println(pub); 
		System.out.println(pro); 
		//System.out.println(def);// default�� ���� package�������� ��� �����ؼ�.
		//System.out.println(prv);// private�� ���� class�ȿ����� ��� �����ؼ�.
	
		/*F fobj = new F();
		fobj.accessTest(); */ // F��  default�̱⶧���� ������ ��Ű�� �������� ��밡���ؼ�.
	}
}
