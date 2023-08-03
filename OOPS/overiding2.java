// Class TV: Re// Class TV: Represents a basic TV with methods switchOn() and channelChanged().
class TV {
    public void switchOn() {
        System.out.println("TV Switched ON");
    }

    public void channelChanged() {
        System.out.println("TV Channel Changed");
    }
}

// Class SmartTV: Extends TV and overrides switchOn() and channelChanged()
// methods. It also has an additional method Browse().
class SmartTV extends TV {
    @Override
    public void switchOn() {
        System.out.println("Smart TV Switched ON");
    }

    @Override
    public void channelChanged() {
        System.out.println("Smart TV Channel Changed");
    }

    public void Browse() {
        System.out.println("Smart Browsing");
    }
}

public class overriding2 {
    public static void main(String arg[]) {
        TV t = new TV();
        t.switchOn();
        t.channelChanged();
        // This will access the methods of the TV class directly.

        SmartTV tv = new SmartTV();
        tv.switchOn();
        tv.channelChanged();
        // This will access the methods of the SmartTV class directly.

        TV te = new SmartTV();
        te.channelChanged();
        te.switchOn();
        // te.Browse();
        // This will throw a compilation error because the variable 'te' is of type TV,
        // which does not have a Browse() method.

        // To access the Browse() method, we need to use typecasting:
        ((SmartTV) te).Browse();
    }
}
