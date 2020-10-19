public class Car extends Vehicle
{
    private int capacity;

    public Car(String license, String type, String drivername, String vehiclename, int capacity) {
        super(license, type, drivername, vehiclename);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void printf() {
        // TODO Auto-generated method stub

    }


}