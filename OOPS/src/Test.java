
public class Test {
	public static void main(String[] args) {
		//overloading     Overriding
		Parent p = new Child ();
		p.m1(13);
		p.m1(100);
	}

}
class Parent {
	public void m1(int a) {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	public void m1(float name) {
		System.out.println("Child");
	}
	
}



