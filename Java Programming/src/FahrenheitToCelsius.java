import java.util.Scanner;
class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome To Temperature Converter:");
        System.out.println("Enter The Temperture In fehrenheit:");
        float f= x.nextFloat();

        float cel= (f-32)*5/9;

        System.out.println("The Temperature In Celcius is "+cel+" Degree Centergrate");

    }
}
