package com.test.ocpjp.exam1;

public class Q_02_wrapper {
	static Thread t1, t2, t3;
	
	public Q_02_wrapper() {	}
	
	public static void main(String[] args){
		System.out.println("----------"); 
		Q_02_wrapper wrapper = new Q_02_wrapper();
		byte i = 100;
		wrapper.print(i);
		System.out.println(wrapper.hashCode());
		System.out.println(wrapper);
		System.out.println(new Q_02_wrapper().hashCode());
	}
	
	public void print(short num){
		System.out.println("short: " + num); 
	}
	
	public void print(int num){
		System.out.println("int: " + num); 
	}
	
	public void print(long num){
		System.out.println("long: " + num); 
	}
	
	public void print(Short num){
		System.out.println("Short: " + num); 
	}
	
	public void print(Integer num){
		System.out.println("Integer: " + num); 
	}
	
	public void print(Long num){
		System.out.println("Long: " + num); 
	}
	
	public void print(Number num){
		System.out.println("Number: " + num); 
	}
	
}
