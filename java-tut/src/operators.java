public class operators {
    public static void main(String [] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 =2
        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5 ; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3)
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result +2;
        result +=2;
        System.out.println("1 + 2 = " + result);

        result *=10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        // only first statement will get executed
        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");
            System.out.println("and I am scared of aliens");

        // will allow to execute more than one statement by adding {} and making it block
        boolean isAlien2 = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("and I am scared of aliens");
        }



    }
}
