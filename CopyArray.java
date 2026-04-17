class CopyArray {
    public static void main(String[] args) {
        int a[]={1,2,3},b[]=new int[a.length];
        for(int i=0;i<a.length;i++) b[i]=a[i];
        System.out.println(b[0]);
    }
}