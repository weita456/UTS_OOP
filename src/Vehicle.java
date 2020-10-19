public abstract class Vehicle
{
    private String license;
    private String type;
    private String drivername;
    private String vehiclename;

    public Vehicle(String license, String type, String drivername, String vehiclename) {
        super();
        this.license = license;
        this.type = type;
        this.drivername = drivername;
        this.vehiclename = vehiclename;
    }

    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDrivername() {
        return drivername;
    }
    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }
    public String getVehiclename() {
        return vehiclename;
    }
    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }

    public abstract void printf();

}
