package com.testing;

interface Device {
	void doIt(int i);	
}

class Electronic implements Device{
	public void doIt(int i){}
}

class E1 extends Electronic implements Device {
	public void doIt(int i){}
}






class TestInterface {
	public int count(int x, int y){
		return x+y;
	}
	public TestInterface() {
		for (int i = 0; i < 2; i++) ;
		Short i = 7;
		count(i, 2);
	}

}
