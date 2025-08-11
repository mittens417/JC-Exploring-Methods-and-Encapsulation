package org.example;

public class SmartDoor {
    private boolean isLocked;


    public boolean isLocked(){
        return isLocked;
    }

    public void lockDoor(){
        System.out.println("Is the door locked? "+ isLocked());

        this.isLocked = true;
        System.out.println("Locking the door...");
    }

    public void unlockDoor(){
        System.out.println("Is the door locked? "+ isLocked());

        this.isLocked = false;
        System.out.println("Unlocking the door...");
    }



}
