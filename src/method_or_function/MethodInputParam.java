package method_or_function;

public class MethodInputParam {

    public String welcome(String name){

        String msg  = "Welcome to Java Programming .... " + name;
        return msg;
    }

    public static void main(String[] args) {
         MethodInputParam obj =new MethodInputParam();
        String result= obj.welcome("Ankit"); // we need to pass the value
        System.out.println(result);
        String result1= obj.welcome("Rahul");
        System.out.println(result1);
    }
}
