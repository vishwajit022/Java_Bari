package F6_Networking;

import java.io.*;
import java.net.*;

//Server Program
public class p1_revecho {

    public static void main(String arg[]) throws Exception {
        // We are writing Server
        ServerSocket ss = new ServerSocket(4000);
        Socket stk = ss.accept();// This returns a socket
        // Here didn't need to create Socket Object is because
        // a server can potentially handle multiple client connections, and each time a
        // client connects, a new Socket object is generated to handle that specific
        // connection.

        // Let's Read the input coming from client
        // It belongs to a reader writer classes it cannot take streams as an input
        // So here we bring up input stream so that we could read and convert input
        // stream socket stk
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        // Converting an Input
        // Stream to Stream Reader
        // so we could read it in
        // Buffered Reader

        // After reading we need to show the output
        PrintStream ps = new PrintStream(stk.getOutputStream());
        // Here the data already in the form of stream and Print Stream supports streams
        // for output

        String msg;
        StringBuilder sb;
        do {
            // Reading
            msg = br.readLine();

            // Reversing
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();

            // Writing
            ps.print(msg);
        } while (!msg.equals("dne"));

    }

}

// Client
// It cannot be public because only one class can be public in java
class Client {
    public static void main(String arg[]) throws Exception {
        Socket s = new Socket("localhost", 3000);

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream p = new PrintStream(s.getOutputStream());
        String msg;
        do {
            msg = kb.readLine();
            p.println(msg);
            msg = br.readLine();
            System.out.println("From Server " + msg);

        } while (!msg.equals("dne"));

    }
}
