public class FirstClass {

    public static void main(String[] args) {

        String result = returnString(50);
        System.out.println(result);

        System.out.printf("Hello, %s", " First Phrase!");
        System.out.printf("Hello, %s", " Second Phrase");


        SecondClass secondClassInstance = new SecondClass();
        System.out.println(secondClassInstance.returnHello());
    }

   public static String returnString(int x){
        return " Hi Aidai";
    }
}




