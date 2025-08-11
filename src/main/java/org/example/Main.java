package org.example;
import static org.example.ParameterPassing.modifyValue;
import static org.example.VarargsExample.printMessages;

public class Main {
    public static void main(String[] args) {

        //Car Class
        Car myCar = new Car();
        myCar.startEngine();
        String status = myCar.drive(60);
        System.out.println(status);

        //ParameterPassing Class
        int originalValue = 50;
        System.out.println("Before method call: " + originalValue);
        modifyValue(originalValue);
        System.out.println("After method call: " + originalValue);

        //Varargs Class
        printMessages("Hello", "World");
        printMessages("Testing", "Varargs", "Here");
        printMessages();

        //Bank Class
        Account myAccount = new Account();
        myAccount.displayAccountDetails();

        //Utility Class
        System.out.println("App Name: " + Utility.getAppName());

        // The following line would cause a compile-time error
        // System.out.println("Instance ID: " + Utility.getInstanceId());

        Utility utilInstance = new Utility();
        System.out.println("Instance ID: " + utilInstance.getInstanceId());

        //Display Class
        Display d = new Display();
        d.show(42);
        d.show("Hello");
        d.show("Goodbye", 3);

        //Pizza Class
        Pizza pizza1 = new Pizza();
        pizza1.display();

        Pizza pizza2 = new Pizza("Pepperoni");
        pizza2.display();

        Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
        pizza3.display();

        //Thermostat Class
        Thermostat stat = new Thermostat(22.5);
        System.out.println("Initial temp: " + stat.getTemperatureCelsius());

        stat.setTemperatureCelsius(5.0); // Try to set an invalid temp
        System.out.println("Temp after invalid change: " + stat.getTemperatureCelsius());

        stat.setTemperatureCelsius(25.0); // Set a valid temp
        System.out.println("Temp after valid change: " + stat.getTemperatureCelsius());
    }
}
