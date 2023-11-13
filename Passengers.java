public abstract class Passengers {
private String name;
private int ID;
private Car reservedCar; //بوصل لكل بيانات الكار عن طريق الريسيرفيد كار لان نوعها اوبجكت كار
    private double tripCost; //سعر بعد الخصم
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }



    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public Passengers(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract void reserveCar(Car c);
    public abstract void display();

}
