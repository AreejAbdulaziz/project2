public class Route {
    private String startAddress;
    private String destinationAddress;
    private double tripPrice; //سعر الرحلة كاملة

    public double getTripPrice() {
        return tripPrice;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public Route(String startAddress, String destinationAddress, double tripPrice) {
        this.startAddress = startAddress;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }

}
