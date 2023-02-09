class mythread1 implements Runnable {
    public void run() {
        int i = 1;
        while (i < 152) {
            System.out.println("i am thread 1 ");
            System.out.println("running thread 1");
            i++;
        }
    }
}

class mythread2 implements Runnable {
    public void run()

    {
        int i = 1;
        while (i < 152) {
           System.out.println("i am 2nd thread and i am good citizen");

            i++;
        }
    }

  
}

public class threadrunnableinterface {
    public static void main(String[] args) {
        mythread1 bullet1 = new mythread1();
        Thread gun1 = new Thread(bullet1);
        mythread2 bullet2 = new mythread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}