public class poundstokg {
    public static void main (String[] args) {
        int poundValue = 5;
        float poundToKgValue = 0.45359237f;
        float kgValue = poundValue / poundToKgValue;
        System.out.println("Converting " + kgValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println(" Number of Kilograms " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_456_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
