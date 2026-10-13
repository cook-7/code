class EvenNumberThread extends Thread {
    private int evenNumber;

    public EvenNumberThread(int evenNumber) {
        this.evenNumber = evenNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread [" + Thread.currentThread().getName() + "] Output: " + evenNumber);
    }
}

public class EvenNumberThreads {
    public static void main(String[] args) {
        int[] evens = {2, 4, 6, 8, 10};
        EvenNumberThread[] threads = new EvenNumberThread[evens.length];

        for (int i = 0; i < evens.length; i++) {
            threads[i] = new EvenNumberThread(evens[i]);
            threads[i].setName("EvenThread-" + evens[i]);
            threads[i].start();
        }

        for (EvenNumberThread t : threads) {
            System.out.println(t.getName() + " isAlive: " + t.isAlive());
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("Main thread: All even number threads have terminated.");
    }
}
