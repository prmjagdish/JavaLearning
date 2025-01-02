package Interfaces.MultipleInheritances;

public class SmartPhone implements Camera,MusicPlayer,Phone {

    @Override
    public void clickedPhoto() {
        System.out.println("Smartphone clicked photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone play music...");
    }


    @Override
    public void makecall() {
        System.out.println("Smartphone make call...");

    }
}
