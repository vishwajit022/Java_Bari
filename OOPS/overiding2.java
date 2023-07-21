package OOPS;

class TV {
    public void switchOn() {
        System.out.println("Tv Switched ON");
    }

    public void channelChanged() {
        System.out.println("TV Channel Changed");
    }
}

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

public class overiding2 {

    public static void main(String arg[]) {
        TV t = new TV();
        t.switchOn();
        t.channelChanged();
        // This will access directly object method
        SmartTV tv = new SmartTV();
        tv.switchOn();
        tv.channelChanged();
        // This will access directly access object method

        TV te = new SmartTV();
        te.channelChanged();
        te.switchOn();
        // te.Browse();
        // This will threw compilation error because we created a object instance using
        // TV and Tv doesn't have a Browse method
        ((SmartTV) te).Browse();
        // If we want to fix this issue and use the browse method we need to use
        // typecasting
    }
}
