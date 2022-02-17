public class FirstClass {

    public static void main(String[] args) {
        String phraseOne = "First";
        String phraseTwo = "Second";

        String result = returnString(50);
        System.out.println(result);

        System.out.println("Hello " + phraseOne + " Phrase!");
        System.out.println("Hello " + phraseTwo + " Phrase!");
        System.out.println("How cool to have " + phraseOne + " and " + phraseTwo + " here all together :)");

        SecondClass secondClassInstance = new SecondClass();

        System.out.println(secondClassInstance.returnHello());
            }

    public static String returnString(int x){
        return " Hi Aidai";
    }
}



