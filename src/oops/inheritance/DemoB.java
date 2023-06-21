package oops.inheritance;

public class DemoB extends DemoA {

  // overriding

    public void m1(){
        System.out.println("I M A Child Class Method");
    }



    public static void main(String[] args) {
        DemoB obj = new DemoB();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
