public class Methods {
    int n;
    int current = 1;

    public Methods(int n) {
        this.n = n;
    }

    public synchronized void fizz() throws InterruptedException {
        while (current <= n) {
            if (current % 3 == 0 && current % 5 != 0) {
                System.out.println("fizz");
                current++;
                notifyAll();
            } else {
                wait();
            }
        }
    }

    public synchronized void buzz() throws InterruptedException {
        while (current <= n) {
            if (current % 5 == 0 && current % 3 != 0) {
                System.out.println("buzz");
                current++;
                notifyAll();
            } else {
                wait();
            }
        }
    }


    public synchronized void fizzbuzz() throws InterruptedException {
        while (current <= n) {
            if (current % 3 == 0 && current % 5 == 0) {
                System.out.println("fizzbuzz");
                current++;
                notifyAll();
              } else {
                this.wait();
                }
            }
        }

    public synchronized void number() throws InterruptedException {
            while (current <= n) {
                if (current % 3 != 0 && current % 5 != 0) {
                    System.out.println(Integer.toString(current));
                    current++;
                    notifyAll();
                } else {
                   wait();
                }
            }
    }
}


