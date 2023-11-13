public class NonSubscribersPassengers extends Passengers{
    private boolean discountCoupon;
    public NonSubscribersPassengers(String name, int ID) {
        super(name, ID);
    }

    @Override
    public void reserveCar(Car c) {
        if(c.getMaximumCapacity()==0){
            throw new IllegalArgumentException("car capacity is zero ");
        }
        setReservedCar(c);
        if(discountCoupon){
        setTripCost(c.getFixedRoute().getTripPrice()-(0.1*c.getFixedRoute().getTripPrice()));
       }
       else setTripCost(c.getFixedRoute().getTripPrice());
    }

    @Override
    public void display() {
        System.out.println("Name : "+getName()+" ID : "+getID()+" Trip cost : "+getTripCost()+" Reserved car : "+getReservedCar()+" Car code : "+getReservedCar().getCode()+" Route price :"+getReservedCar().getFixedRoute().getTripPrice());
    }
}
