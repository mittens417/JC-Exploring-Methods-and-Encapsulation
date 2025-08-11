package org.example;

public class User {
    private String password;

    public User(String initialPassword){
    setPassword(initialPassword);

    }
    public String getPassword() {
        return password.replaceAll(".","*");
    }

    public void setPassword(String password){
        if(password.length() > 8){
            System.out.println("Attempting to set valid password" + " '" + password + "'");
            this.password = password;
        }else{
            System.out.println("Attempting to set short password" + " '" + password + "'");
            System.out.println("Error: Password must be at least 8 characters long.");
        }

        System.out.println("Current masked password: " + getPassword());


        }
    }



