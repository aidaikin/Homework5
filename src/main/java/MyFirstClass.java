public class MyFirstClass {
    public static String returnString(int x) {
        return "John";
    }

    public static String returnString(String s) {
        return "Mary";
    }

    public String returnStringFromTwoInputs(String s, int I) {
        return "String from String int";
    }

    public String returnStringFromTwoInputs(int i, String s) {
        return "String from int String";
    }

    public String returnGreeting(String name, int age) {
        String pattern = "Hello %s, how are you? Looks like you are %s";
        return String.format(pattern, name, age);
    }

    public static void main(String[] args) {
        String result = returnString("Hello");
        System.out.println(result);
        MyFirstClass myFirstClass = new MyFirstClass();
        String result2 = myFirstClass.returnStringFromTwoInputs(50, "Foo");

        byte b = 127;
        short s = 32767;
        int i = 456456;
        long l = 9223372036854775807L;
        float f = 10.5F;
        double d = 100.8D;
        boolean bo1 = true;
        boolean bo2 = false;

        char c = "A".charAt(0);

        System.out.println(c);

        String s2 = null;
        String s3 = new String("Mary");
        String s4 = "Mary";


//         System.out.println(s2.equals("John")); DANGEROUS

        System.out.println("John".equals(s2));

         String s5 = "Foo";
         String s6 = "Foo";
         System.out.println(s5.equals(s6));

        System.out.println(myFirstClass.returnGreeting("Mary", 25));

        double d4 = 10.129476678;
        double d5 = 1000.129476678;
        System.out.println("Rounded double %.2f".formatted(d4));
        System.out.println("Rounded double %.2f".formatted(d5));

        System.out.println("Rounded double %10.2f".formatted(d4));
        System.out.println("Rounded double %10.2f".formatted(d5));

        MySecondClass   secondClassInstance = new MySecondClass();
        System.out.println(secondClassInstance.returnBar());
    }
}
