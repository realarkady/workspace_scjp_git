package com.tasks.examlab.diagnostic;

public abstract class Q_56_g<K extends Number>{
	// Compiler ERROR! for the commented lines:
	
	public abstract <K> K useMe_1(Object k);
	
	//public abstract K<K> useMe_2(Object k);
	
	public abstract <K> Q_56_g<? extends Number> useMe_3(Q_56_g<? super K> k);
	
	public abstract <K> Q_56_g<? super Number> useMe_4(Q_56_g<? extends K> k);
	
	//public abstract <K> Q_56_g<K> useMe_5(Q_56_g<K> k);
	
	public abstract <V extends K> Q_56_g<V> useMe_6(Q_56_g<V> k);
	
	//public abstract <V super K> Q_56_g<V> useMe_7(Q_56_g<V> k);
	
	//public abstract <V extends Character> Q_56_g<? super V> useMe_8(Q_56_g<K> k);
	
	//public abstract <V super Character> Q_56_g<? super V> useMe_9(Q_56_g<K> k);
	
}