package q3;

public class MyThread1 extends Thread {

    public void run() {

        MyFileReader.getInstance().performCalculateInFile();

    }
}


class MyThread2 extends Thread{

    public void run(){
        MyFileReader.getInstance().performCalculateInFile();
    }

}


class Main{
    public static void main(String[] args) {
        MyThread1 thread1=new MyThread1();
        thread1.start();


        MyThread2 thread2=new MyThread2();
        thread2.start();
    }
}
