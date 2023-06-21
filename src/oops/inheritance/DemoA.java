package oops.inheritance;

public class DemoA {

    public void m1(){
        System.out.println("This is method of Demo A");
    }

    public void m2(){
        System.out.println("This is M2 method of DemoA Class   ");
    }
    public void m3(){
        System.out.println("This is M3 method of DemoA Class");
    }

    protected void m4(){
        System.out.println("This is M4 method of DemoA Class");
    }

    public static void main(String[] args) {
        DemoA obj = new DemoA();
        obj.m1();
        obj.m2();
    }
}
