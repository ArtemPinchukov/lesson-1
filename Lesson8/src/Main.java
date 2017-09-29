import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
   /* public static int k=0;
    synchronized public static void doSome(int d){
        k+=d;
    }
    public static void main(String[] args) throws InterruptedException {
        /*double s=Math.cos(Math.toRadians(60));
        System.out.println(s);*/
       /* long t=System.currentTimeMillis();// показывает время в данный момент переведенное в милисекунды
        /*for(int i=0;i<10000000;i++){
            double d=Math.sin(i)*Math.tan(i*2)-Math.sqrt(i/2);
        }*/
        /*MyThread mt=new MyThread();// создали объект
        MyThread2 mt2=new MyThread2();
        mt.start();// запускает поток на выполнение
        mt2.start();
        mt.join();
        mt2.join();
        long dt=System.currentTimeMillis()-t;
        System.out.println(dt);*/
        /*Thread t1=new Thread((new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100000000;i++){
                    doSome(1);
                }

            }
        }));
        Thread t2=new Thread((new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100000000;i++){
                    doSome(-1);
                }

            }
        }));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(k);
    }*/
   public static void main(String[] args) {
       Date d= new Date();
       d.setTime(1506706700000l);
       System.out.println(d);

       Date d2=new Date();
       System.out.println(d2);
       if (d2.before(d)){
           System.out.println("d2<d");
       }
       else {
           System.out.println("d2>d");
       }

       SimpleDateFormat format=new SimpleDateFormat("'Today 'dd.MM.EEE");
       System.out.println(format.format(d));


       Calendar c= Calendar.getInstance();
       c.add(Calendar.MONTH,2);
       System.out.println(c.getTime());
       c.set(Calendar.DAY_OF_WEEK,1);
       System.out.println(c.getTime());
       int year= c.get(Calendar.YEAR);
       System.out.println(year);


       GregorianCalendar gc=new GregorianCalendar();
       gc.set(Calendar.YEAR,1960);
       if(gc.isLeapYear(1960)){
           System.out.println("Год високосный");
       }
       else{
           System.out.println("Год не високосный");
       }
   }
}
