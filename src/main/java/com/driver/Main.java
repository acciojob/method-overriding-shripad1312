package com.driver;


class A{
    String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    @Override
    String meth(){
        return "Invoking method from class B";
    }
}
public class Main {


    public static void main(String[] args) {
       B b=new B();
       b.meth();

    }
  
}