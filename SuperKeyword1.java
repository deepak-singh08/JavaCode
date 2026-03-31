class A { A(){System.out.println("A");}}
class B extends A { B(){System.out.println("B");}}

public class SuperKeyword1 {
    public static void main(String[] args){
        new B();
    }
}