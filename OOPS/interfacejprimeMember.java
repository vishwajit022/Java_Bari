// Interface Member: Defines a callback method 'callback()' that will be implemented by classes that implement this interface.
interface Member {
    public void callback();
}

// Class Store: Represents a store that can register members and invite them for
// a sale.
class Store {
    Member members[] = new Member[10]; // An array to store registered members.
    int count = 0; // Keeps track of the number of registered members.

    // Method to register a member.
    void register(Member m) {
        members[count++] = m; // Adds the member to the array and increments the count.
    }

    // Method to invite all registered members for a sale.
    void inviteSale() {
        for (int i = 0; i < count; i++) {
            members[i].callback(); // Calls the 'callback()' method for each registered member.
        }
    }
}

// Class Customer: Represents a customer who is a member of the store.
class Customer implements Member {
    String name;

    Customer(String n) {
        name = n;
    }

    // Implementation of the 'callback()' method from the 'Member' interface.
    public void callback() {
        System.out.println("Ok, I will visit, " + name);
    }
}

public class interfacejprimeMember {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");

        s.register(c1); // Registering customer 'c1' as a member.
        s.register(c2); // Registering customer 'c2' as a member.

        s.inviteSale(); // Inviting all registered members for a sale, which will call the 'callback()'
                        // method for each member.
    }
}
