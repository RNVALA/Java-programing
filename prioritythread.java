class mythread1 extends Thread {
    public mythread1(String name) {
        super(name);

    }

    public void run() {
        int i = 1;
        while (i < 20) {
            System.out.println("i am learning javar" + getName());
            i++;
        }
    }
}

public class prioritythread{
    public static void main(String[] args) 
    {
        mythread1 t1 = new mythread1("ronak1");
        mythread1 t2 = new mythread1("ronak2");
        mythread1 t3 = new mythread1("ronak3");
        mythread1 t4 = new mythread1("ronak4");
        mythread1 t5 = new mythread1("ronak5");
         t5.setPriority(Thread.MAX_PRIORITY);
         t4.setPriority(Thread.MIN_PRIORITY);
         t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
