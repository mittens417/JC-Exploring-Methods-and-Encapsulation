package org.example;

import static org.example.ParameterPassing.modifyValue;
import static org.example.VarargsExample.findLargest;
import static org.example.VarargsExample.printMessages;
import static org.example.Converter.celsiusToFahrenheit;
import static org.example.Converter.fahrenheitToCelsius;

public class Main {
    public static void main(String[] args) {

        //Car Class
        System.out.println("--- Exercise 1 ---");
        Car myCar = new Car();
        myCar.startEngine();
        String status = myCar.drive(60);
        System.out.println(status);
        myCar.turnOffEngine();// Mini Challenge
        System.out.println();

        //ParameterPassing Class
        System.out.println("--- Exercise 2 ---");
        int originalValue = 50;
        System.out.println("Before method call: " + originalValue);
        modifyValue(originalValue);
        System.out.println("After method call: " + originalValue);
        System.out.println();

        //Mini Challenge: Student
        System.out.println(" --- Exercise 2 (Challenge) --- ");
        Student student = new Student("Alex");
        student.changeStudentName(student, "Jordan");
        System.out.println();

        //Varargs Class
        System.out.println("--- Exercise 3 ---");
        printMessages("Hello", "World");
        printMessages("Testing", "Varargs", "Here");
        printMessages();
        System.out.println();

        //Mini Challenge: findLargest
        System.out.println(" --- Exercise 3 (Challenge) --- ");
        findLargest(10, 5, 25, 15);
        findLargest(-5, -1, -10);
        findLargest();
        System.out.println();

        //Bank Class
        System.out.println("--- Exercise 4 ---");
        Account myAccount = new Account();
        myAccount.displayAccountDetails();
        System.out.println();

        //Mini Challenge: SmartDoor
        System.out.println("--- Exercise 4 (Challenge) ---");
        SmartDoor smartDoor = new SmartDoor();
        smartDoor.lockDoor();
        smartDoor.unlockDoor();
        System.out.println();


        //Utility Class
        System.out.println("--- Exercise 5 ---");
        System.out.println("App Name: " + Utility.getAppName());

        // The following line would cause a compile-time error
        // System.out.println("Instance ID: " + Utility.getInstanceId());

        Utility utilInstance = new Utility();
        System.out.println("Instance ID: " + utilInstance.getInstanceId());
        System.out.println();

        //Mini Challenge: Converter
        System.out.println(" --- Exercise 5 (Challenge) --- ");
        double tempInCelsius = 25.0;
        System.out.println(tempInCelsius + " degrees C is " + celsiusToFahrenheit(tempInCelsius) + " degrees F.");
        System.out.println();


        //Display Class
        System.out.println("--- Exercise 6 ---");
        Display d = new Display();
        d.show(42);
        d.show("Hello");
        d.show("Goodbye", 3);
        System.out.println();

        //Mini Challenge: Converter
        System.out.println(" --- Exercise 6 (Challenge) --- ");
        double tempInFahrenheit = 77.0;
        System.out.println(tempInCelsius + " degrees C is " + celsiusToFahrenheit(tempInCelsius) + " degrees F.");
        System.out.println(tempInFahrenheit + " degrees F is " + fahrenheitToCelsius(tempInFahrenheit) + " degrees C.");
        System.out.println();

        //Pizza Class
        System.out.println("--- Exercise 7 ---");
        Pizza pizza1 = new Pizza();
        pizza1.display();

        Pizza pizza2 = new Pizza("Pepperoni");
        pizza2.display();

        Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
        pizza3.display();
        System.out.println();

        //Mini Challenge: Computer
        System.out.println(" --- Exercise 7 (Challenge) --- ");
        Computer computer = new Computer();
        computer.display();
        Computer computer1 = new Computer("Dell");
        computer1.display();
        Computer computer2 = new Computer("Apple", 16);
        computer2.display();

        System.out.println();

        //Thermostat Class
        System.out.println("--- Exercise 8 ---");
        Thermostat stat = new Thermostat(22.5);
        System.out.println("Initial temp: " + stat.getTemperatureCelsius());

        stat.setTemperatureCelsius(5.0); // Try to set an invalid temp
        System.out.println("Temp after invalid change: " + stat.getTemperatureCelsius());

        stat.setTemperatureCelsius(25.0); // Set a valid temp
        System.out.println("Temp after valid change: " + stat.getTemperatureCelsius());
        System.out.println();

        //Mini Challenge: User
        System.out.println(" --- Exercise 8 (Challenge) --- ");
        User user = new User("Th1$Pa5sW0rD1sV3rYsTr0ng!");
        user.setPassword("1234567");
        user.setPassword("THIS_PASSWORD_IS_WEAK");
        System.out.println();
    }
}
