package food;

public abstract class Fruit {

	public Fruit() {
		super();
		System.out.println("Fruit!");
	}
	
	protected abstract void sayHi() throws Exception;
	
}
