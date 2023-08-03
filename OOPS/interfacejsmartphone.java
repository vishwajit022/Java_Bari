// Class Phone: Represents a basic phone with call and text functionality.
class Phone {
    void call() {
        System.out.println("Phone Call");
    }

    void text() {
        System.out.println("Texting on Phone");
    }
}

// Interface MusicPlayer: Defines default methods 'play()' and 'pause()' for
// playing and pausing music.
interface MusicPlayer {
    default void play() {
        System.out.println("Play Music");
    }

    default void pause() {
        System.out.println("Pause Music");
    }
}

// Interface Camera: Defines a default method 'click()' for taking a picture.
interface Camera {
    default void click() {
        System.out.println("Click a Picture");
    }
}

// Class Smartphone: Represents a smartphone that extends Phone and implements
// MusicPlayer and Camera interfaces.
class Smartphone extends Phone implements MusicPlayer, Camera {

}

public class interfacejsmartphone {
    public static void main(String arg[]) {
        Smartphone s = new Smartphone();
        s.play(); // This will call the 'play()' method from the MusicPlayer interface since the
                  // Smartphone class implements it.
    }
}
