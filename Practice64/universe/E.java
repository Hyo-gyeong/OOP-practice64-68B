package universe;
import    planet.A;

public class E {
	void accessTest()  {
		A aobj = new A(); 
		
		System.out.println(aobj.pub);
		//System.out.println(aobj.pro);//
		//System.out.println(aobj.def);// default�� ���� package�������� ��� �����ؼ�.
		//System.out.println(aobj.prv);// private�� ���� class�ȿ����� ��� �����ؼ�.
	
		/*F fobj = new F();
		fobj.accessTest(); */ //F��  default�̱⶧���� ������ ��Ű�� �������� ��밡���ؼ�.
		}
}
