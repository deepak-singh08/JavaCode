class Animal {
    void sound(){System.out.println("Sound");}
}
class Dog extends Animal {
    void bark(){System.out.println("Bark");}
    public static void main(String[] args){
        Dog d=new Dog();
        d.sound(); d.bark();
    }
}