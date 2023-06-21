package oops.assignment;

public class AsgnDemo2 extends AsgnInheritance{

    //override

    public void div(int a ,int b){
        double c =(double) a/b;
        System.out.println("This is override division :" +c);
    }

    public static void main(String[] args) {
        AsgnDemo2 obj =new AsgnDemo2();
        obj.add(10,20);
        obj.div(20,12);
        obj.sub(12,10);
        obj.mul(12,12);
    }
}
