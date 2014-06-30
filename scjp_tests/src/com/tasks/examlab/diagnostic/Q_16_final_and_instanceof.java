package com.tasks.examlab.diagnostic;

interface I{}
class A{}
class B implements I{}
class C extends A{} 
class D{}
final class E{}

public class Q_16_final_and_instanceof{
  public static void main(String args[]){
    Boolean b;
    //this does not compile!!!
    //b = new E() instanceof I; 
    
    //To be able to compile, class E should implement the interface I,
    //OR,
    //class E should be defined as a non-final class.
    
    //this compiles fine:
    b = new A() instanceof I;
    System.out.println(b);
    
  }
}