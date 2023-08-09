package F3_JavaIO.F1_PipedStreams;

import java.io.*;

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream o) {
        os = o;
    }

    public void run() {
        int count = 1;
        while (true) {
            try {
                os.write(count);
                os.flush();// System.out.flush();
                System.out.println("Producer is working" + count);
                System.out.flush();
                Thread.sleep(10);
                count++;

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream i) {
        is = i;
    }

    public void run() {
        int x;
        while (true) {
            try {
                x = is.read();
                System.out.println("Consumer" + x);
                System.out.flush();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class intro {
    public static void main(String arg[]) throws Exception {
        PipedInputStream pi = new PipedInputStream();
        PipedOutputStream po = new PipedOutputStream();

        pi.connect(po);

        Consumer c = new Consumer(pi);
        Producer p = new Producer(po);
        c.start();
        p.start();

    }
}
