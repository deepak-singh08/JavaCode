class Encapsulation {
    private int age;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setAge(20);
        System.out.println(e.getAge());
    }
}