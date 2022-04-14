import jdk.internal.dynalink.beans.StaticClass;
public class ThreadEx{
statix String [][]customers=new String[3][2];
static int i=0;
static void setName(){
customers[0][0]="Arun";
customers[1][0]="Arjun";
customers[2][0]="vikranth";
customers[0][1]="FarmHousePizza";
customers[1][1]="Vegpizza";
customers[2][1]="cheesePizza";
}
static int orederId(){
i=i+1;
return i;
}
public static void main(String args[]){
 System.out.println("Restaurant opened!!Enjoy the taste!!");
        //creating runnable objects for other classes
        Runnable obj1=new Counter();
        Runnable obj2=new Chef();
        Runnable obj3=new Waiter();
        //creating threads for each process
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);
        //Running the threads
        t1.start();
        t2.start();
        t3.start();
        //joining the threads to execute in an order
        try{
            t1.join();
            t2.join();
            t3.join();
        }
        catch(Exception e){
            System.out.println("Restaurant closed!!");
        }
    }







