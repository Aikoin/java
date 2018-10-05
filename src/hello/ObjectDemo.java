package hello;

class A{
	int a;
	public A(int i){
		a = i;
	}
}

class subA extends A{
	public subA(int i){
		super(i);
	}
	public boolean equals(Object obj){
		if(obj instanceof subA){
			subA x = (subA)obj;
			if(x.a == a)
				return true;
		}
		return false;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		A a1 = new A(5);
		A a2 = new A(5);
		System.out.println(a1.equals(a2));
		a1 = new subA(10);
		a2 = new subA(10);
		System.out.println(a1.equals(a2));
	}

}
