package com.test.whizlabs.exam3;

public class Q_36_AnonymousInner 
{ 
     void f() 
     {
          System.out.println("Outer"); 
     } 
     public class InnerTest 
     { 
          InnerTest() 
          { 
               System.out.println("Inner constructor"); 
          } 
          void f()
          { 
               System.out.println("Inner f"); 
          } 
     }
     public static void main(String[] args) 
     { 
          final Q_36_AnonymousInner t=new Q_36_AnonymousInner(); 
          Q_36_AnonymousInner.InnerTest test=t.new InnerTest() 
          {
               public void f() 
               { 
                    t.f();
                    System.out.println("Sub Inner f"); 
               } 
          }; 
          test.f();
     } 
}