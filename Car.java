public class Car {
    private String code;
    private Route fixedRoute;
    private int maximumCapacity;

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public String getCode() {
        return code;
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }
    public Car(String code, Route fixedRoute, int maximumCapacity) {
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.maximumCapacity = maximumCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "code='" + code + '\'' +
                ", fixed Route=" + fixedRoute.getStartAddress()+","+fixedRoute.getDestinationAddress() +
                ", maximum Capacity=" + maximumCapacity +
                '}';
    }
}
