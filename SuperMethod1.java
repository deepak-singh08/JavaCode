class A { void show(){System.out.println("A");}}
class B extends A {
    void show(){
        super.show();
        System.out.println("B");
    }
}

public class SuperMethod1 {
    public static void main(String[] args){
        new B().show();
    }
}