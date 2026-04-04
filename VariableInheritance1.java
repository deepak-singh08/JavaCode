class A { int x=10;}
class B extends A {
    void print(){System.out.println(x);}
}

public class VariableInheritance1 {
    public static void main(String[] args){
        new B().print();
    }
}
