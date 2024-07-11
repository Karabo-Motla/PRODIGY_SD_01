import java.util.Scanner;


public class TemperatureConverter{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter a temperature value:");
        double temp = input.nextDouble();

        System.out.println("Enter the unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin):");
        String unit = input.next().toUpperCase();

        switch(unit){
            case "C":
                double fahrenheit = celsiusToFahrenheit(temp);
                double kelvin = celsiusToKelvin(temp);
                System.out.printf("%.2f°C is equivalent to %.2f°F and %.2fK.%n", temp, fahrenheit, kelvin);
                break;
            case "F":
                double celsiusFromFahrenheit = fahrenheitToCelsius(temp);
                double kelvinFromFahrenheit = fahrenheitToKelvin(temp);
                System.out.printf("%.2f°F is equivalent to %.2f°C and %.2fK.%n", temp, celsiusFromFahrenheit, kelvinFromFahrenheit);
                break;
            case "K":
                double celsiusFromKelvin = kelvinToCelsius(temp);
                double fahrenheitFromKelvin = kelvinToFahrenheit(temp);
                System.out.printf("%.2fK is equivalent to %.2f°C and %.2f°F.%n", temp, celsiusFromKelvin, fahrenheitFromKelvin);
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter C for Celsius, F for Fahrenheit, or K for Kelvin.");
        }
        input.close();
        
        



    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }





}

