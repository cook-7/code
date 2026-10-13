class AlphabetThread extends Thread {
    private char letter;

    public AlphabetThread(char letter) {
        this.letter = letter;
    }

    @Override
    public void run() {
        System.out.println("Thread [" + Thread.currentThread().getName() + "] displays: " + letter);
    }
}

public class AlphabetPrinterThreads {
    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        AlphabetThread[] threads = new AlphabetThread[letters.length];

        for (int i = 0; i < letters.length; i++) {
            threads[i] = new AlphabetThread(letters[i]);
            threads[i].setName("LetterThread-" + letters[i]);
            threads[i].start();
        }

        for (AlphabetThread t : threads) {
            System.out.println(t.getName() + " running status (isAlive): " + t.isAlive());
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("Main thread: Alphabets A through E printed completely.");
    }
}
