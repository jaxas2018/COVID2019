package Java8;

import java.util.Arrays;
import java.util.List;


class MyPrinter{
	public void print(String str) {
		System.out.println(str);
	}
	
}
public class Method_Reference {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("David","Eric","Kimmy","Dicker");
		names.forEach(System.out::println);
		
		MyPrinter mp=new MyPrinter();
		mp.print("Hello World!");

	}

}
