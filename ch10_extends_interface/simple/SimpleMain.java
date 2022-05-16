package ch10_extends_interface.simple;

public class SimpleMain {

	public static void main(String[] args) {
		Child hyeyeon = new Child("혜연", 23);
		
		System.out.println(hyeyeon.getName());
		System.out.println(hyeyeon.getAge());
		
		hyeyeon.sayHeelo();
		
		// 형변환 기능
		Parent baby = new Child("아기" , 4);
		baby.sayHeelo();
		

	}

}
