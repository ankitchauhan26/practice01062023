package method_or_function;

public class MethodInputParam {

    public String welcome(String name) {

        String msg = "Welcome to Java Programming .... " + name;
        return msg;
    }

    public int makeSquare(int num) {
        int square = num * num;
        return square;
    }

    // check voter eligibility

    public String checkEligibility(int age, String city) {
        if (age >= 18 && city == "Agra") {
            return "Voter is eligible for vote in Agra ";
        } else {
            return "Voter is not  eligible for vote in Agra ";
        }

    }

    public static void main(String[] args) {
        MethodInputParam obj = new MethodInputParam();
        String result = obj.welcome("Ankit"); // we need to pass the value
        System.out.println(result);
        String result1 = obj.welcome("Rahul");
        System.out.println(result1);

        int square = obj.makeSquare(3);
        System.out.println(square);

        int square1 = obj.makeSquare(5);
        System.out.println(square1);


        // Voting Eligibility

        String eligibility = obj.checkEligibility(19, "delhi");
        System.out.println(eligibility);
    }
}
