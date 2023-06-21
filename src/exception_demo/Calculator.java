package exception_demo;

public class Calculator {

    public int divide(int a,int b ){
        System.out.println("Before Divide : ");
        int divide = 0;
        try {
             divide =   a/b;
        } catch (Exception e) {
            System.out.println("Exception occured");
        }

        System.out.println("After Divide : ");
        return divide;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        System.out.println("After creating object  : ");
        int result = obj.divide(10,0);
        System.out.println("After Calling Method ");
        System.out.println("Printing Divide : " + result);

    }
}
