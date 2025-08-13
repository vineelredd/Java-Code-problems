public class Multithreading extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Multithreading thread = new Multithreading();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}