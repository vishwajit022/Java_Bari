package OOPS;

class Phone {
    void call() {
        System.out.println("Phone Call");
    }

    void text() {
        System.out.println("Texting on Phone");
    }
}

interface MusicPlayer {
    default void play() {
        System.out.println("Play Music");
    }

    default void pause() {
        System.out.println("Pause Music");
    }
}

interface Camera {
    default void click() {
        System.out.println("CLick a Picture");
    }
}

class Smartphone extends Phone implements MusicPlayer, Camera {

}

public class interfacejsmartphone {
    public static void main(String arg[]) {
        Smartphone s = new Smartphone();
        s.play();
    }
}
