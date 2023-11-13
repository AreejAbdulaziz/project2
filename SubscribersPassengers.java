public class SubscribersPassengers extends Passengers{

    public SubscribersPassengers(String name, int ID) {
        super(name, ID);
    }


    @Override
    public void reserveCar(Car c) {
        if(c.getMaximumCapacity()==0){
        throw new IllegalArgumentException("car capacity is zero ");
        }
        setReservedCar(c);
        setTripCost(c.getFixedRoute().getTripPrice()/2); //اذا بوصل لحاجه لازم اسوي منها اوبجكت فوصلت للفكسد روت عن طريق اوبجكت الكار قدر يوصله لاني ممرته له فوق بالميثود و من عند الفكسد روت دخلت عالترب برايس لان الفكسد روت هو عباره عن اوبجكت رووت فاقدر اوصل لكل سماته من هذا الاوبجكت
    }
    @Override
    public void display() {
    System.out.println("Name : "+getName()+" ID : "+getID()+" Trip cost : "+getTripCost()+" Reserved car : "+getReservedCar().toString()+" Car code : "+getReservedCar().getCode()+" Route price :"+getReservedCar().getFixedRoute().getTripPrice()); //الكود حق الكار جبناه من جوا القت ريسيرفيد كار لان نوعه كار فاقدر اطلع منه كل بيانات الكار
    }
}
