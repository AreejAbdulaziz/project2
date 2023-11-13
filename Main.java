import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Passengers>passengers=new ArrayList<>();
        Route r1=new Route("Street1","Street2",50);
        Route r2=new Route("Street3","Street14",65);
        Car c1=new Car("5674",r1,3);
        Car c2=new Car("4532",r2,0);
 SubscribersPassengers s1=new SubscribersPassengers("Areej",1112);
 NonSubscribersPassengers s2=new NonSubscribersPassengers("Sarah",7776);
 passengers.add(s1);
 passengers.add(s2);
 try {
     s1.reserveCar(c1);//بما انه هو اللي طلع فيه الغلط لما سويت رن يعني الاغلاط عالريسيرف رحت خليت اي ريسيرف جوات تري و كاتش
     s1.display();
     s2.reserveCar(c2);
     s2.display(); //س2 مانحجزت لان كان فيها ايرور فلما سويت عرض طلع لي غلط لانها اصلا فاضيه

 }catch (IllegalArgumentException e){
     System.out.println("Error "+ e.getMessage());
         }
    }
}