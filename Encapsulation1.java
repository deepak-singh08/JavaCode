class Student {
    private String name;
    public void setName(String n){name=n;}
    public String getName(){return name;}
}
public class Encapsulation1 {
    public static void main(String[] args){
        Student s=new Student();
        s.setName("Deepak");
        System.out.println(s.getName());
    }
}