class ConstructorEx {
    int x;
    ConstructorEx(int a){x=a;}
    public static void main(String[] args){
        ConstructorEx c=new ConstructorEx(10);
        System.out.println(c.x);
    }
}