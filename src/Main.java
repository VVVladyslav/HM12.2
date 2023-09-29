public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n = 30;

        Methods methods = new Methods(n);

        Thread threadA = new Thread(() -> {
            try {
                methods.fizz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                methods.buzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadC = new Thread(() -> {
            try {
                methods.fizzbuzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadD = new Thread(() -> {
            try {
                methods.number();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();

        threadA.join();
        threadB.join();
        threadC.join();
        threadD.join();
   }
}
