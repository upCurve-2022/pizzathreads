public class Counter  implements Runnable {
public synchronized void run() {
try{
ThreadEx.setName();
for(String[] names:ThreadEx.customers){
if(names.length==0){
wait();
}

else
{String customer=names[0];
String item=names[1];
System.out.println(customer+"'s oredered for"+item);
}
}catch(Exception e)
{
}

notify();
}
}
