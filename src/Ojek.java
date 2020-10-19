public class Ojek extends Vehicle {
    private String service;

    public Ojek(String license, String type, String drivername, String vehiclename, String service) {
        super(license, type, drivername, vehiclename);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public void printf() {
        // TODO Auto-generated method stub

    }




}
