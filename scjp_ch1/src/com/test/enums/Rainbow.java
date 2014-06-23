package com.test.enums;
import com.test.enums.Nav;
public abstract class Rainbow {
	public enum MyColor {
		RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);
		private final int rgb;
		
		MyColor(int rgb) {
			this.rgb = rgb;
		}
		
		private int getRGB() {
			return rgb;
		}
		
	};
	
	static  synchronized public  strictfp  void  main(String[] args) {
		System.out.println(Nav.Direction.NORTH);
		MyColor treeColor = MyColor.GREEN;
		System.out.println(treeColor.getRGB());
		System.out.println(treeColor == MyColor.valueOf("RED"));
	}
	
}

class Rainbow2 {
	public static void main(String... args) {
		Rainbow.MyColor treeColor = Rainbow.MyColor.GREEN;
		System.out.println(treeColor);
		//System.out.println(treeColor.getRGB()); 	//does not compile
	}
	
}
