class demo{
    void fun(){
        System.out.println("I have no parameters");
    }
    void fun(int a){
        System.out.println("I have 1 paramter a: "+a);
    }

    void fun(String s){
        System.out.println("I have a string s: "+s);
    }

    void fun(int a,int b){
        System.out.println("I have 2 paramter a , b: "+a+","+b);
    }
}

public class MethodOverload {
    public static void main(String[] args) {
        demo obj = new demo();
        obj.fun();
        obj.fun(5);
        obj.fun(10,20);
        obj.fun("Hi there");

        // Best example of overloading is println() or print()
        System.out.println(5);
        System.out.println("abc");
        System.out.println(5.06);
    }
}
