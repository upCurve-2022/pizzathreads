public class Chef  implements Runnable {
public synchronized void run() {
for(String[] names:ThreadEx.customers){
if(names.length==0){
try{wait();
}
catch(Exception e)
{
}
}
else
{String customer=names[0];
System.out.println(customer+"'s oreder is ready to deliver");
try{
Thread.sleep(300);
}catch(Exception e)
{
}
}
notifyAll();
}
}
}