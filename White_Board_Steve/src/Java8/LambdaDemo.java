package Java8;


interface A{
	void show(int x);
}
public class LambdaDemo {

	public static void main(String[] args) {
		//A obj;
		
		A obj=i->System.out.println("Hello!! "+i);
		
		obj.show(9);

	}

}
