package food;

import java.io.IOException;

public class Apple extends Fruit{

	public Apple() {
		super();
		System.out.println("Apple!");
	}

	public static void main(String[] args) {
		Apple fruit = new Apple();
		try {
			fruit.sayHi();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void sayHi() throws IOException {
		System.out.println("Hi!");
	}

}
