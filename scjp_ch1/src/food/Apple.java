package food;

import java.io.IOException;

public class Apple extends Fruit{

	public Apple() {
		super();
		System.out.println("Apple!");
	}

	public static void main(String[] args) {
		Fruit fruit = (Fruit) new Apple();
		try {
			fruit.sayHi();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void sayHi() throws IOException {
		System.out.println("Hi!");
	}

}
