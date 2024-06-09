class Parent{
    void fun(){
        System.out.println("Hi, I'm A");
    }
}

class Child extends Parent{
    void fun(){  //Method Overriding
        System.out.println("Hi. I'm B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.fun();
    }
}