package Threads;

public class ThreadMain extends Thread{
    public static void main(String[] args) {
       ThreadMain thread = new ThreadMain();
       thread.start();
        System.out.println("This is code is outside of thread ");
    }

    public void run(){
        System.out.println("This code is running in a thread");
    }
}

