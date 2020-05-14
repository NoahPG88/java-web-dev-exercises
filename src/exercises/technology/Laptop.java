package exercises.technology;

public class Laptop extends Computer {
    private Boolean hasNumberpad = false;

    public Laptop(String deviceName, String wifiNetwork, Boolean portable, String deviceStatus, Boolean hasNumberpad) {
        super(deviceName, wifiNetwork, portable, deviceStatus);
        this.hasNumberpad = hasNumberpad;
    }

    public void putLaptopToSleep(){
        this.deviceStatus = "Sleep";
    }

    public Boolean getHasNumberpad(){
        return this.hasNumberpad;
    }


}
