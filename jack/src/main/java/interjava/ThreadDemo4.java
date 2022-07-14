package interjava;


import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Scanner;



public class ThreadDemo4 {

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
System.out.println("SOup");

ExecutorService es=Executors.newFixedThreadPool(2);
es.execute(()->{met();});
es.execute(()->{met1();});

es.shutdown();


System.out.println("STARTER.....");
}



public static void met() {
try {Thread.sleep(5000);}catch(Exception e) {}
System.out.println("MAIN ITEM....");
}

public static void met1() {
try {Thread.sleep(3000);}catch(Exception e) {}
System.out.println(" please mention Desert....");

}



}