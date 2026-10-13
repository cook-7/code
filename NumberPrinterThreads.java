class NumberThread extends Thread {
    private int number;

    public NumberThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread [" + Thread.currentThread().getName() + "] printed number: " + number);
    }
}

public class NumberPrinterThreads {
    public static void main(String[] args) {
        NumberThread[] threads = new NumberThread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new NumberThread(i + 1);
            threads[i].setName("Worker-" + (i + 1));
            threads[i].start();
        }

        for (NumberThread t : threads) {
            System.out.println(t.getName() + " isAlive before join: " + t.isAlive());
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("All threads finished. Main thread resumes.");
    }
}
