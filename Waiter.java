public class Waiter  implements Runnable {
public synchronized void run() {
for(String[] names:ThreadEx.customers){

String customer=names[0];
String item=names[1];
System.out.println(customer+"your order is ready!Enjoy your"+item);
System.out.println("__order__"+ThreadEx.orderId()+"is delivered!!");

try{
Thread.sleep(400);
}catch(Exception e){}
}
}
}
