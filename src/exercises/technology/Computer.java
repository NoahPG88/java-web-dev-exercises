package exercises.technology;

public class Computer extends AbstractEntity {
    private String deviceName;
    private String wifiNetwork;
    public Boolean portable;
    protected String deviceStatus;

    public Computer(String deviceName, String wifiNetwork, Boolean portable, String deviceStatus) {
        this.deviceName = deviceName;
        this.wifiNetwork = wifiNetwork;
        this.portable = portable;
        this.deviceStatus = deviceStatus;
    }

    @Override
    public String toString(){
        return  getDeviceName() + " Characteristics: \n" +
                "portable: " + getPortable().toString() + "\n" +
                "wifiNetwork: " + getWifiNetwork() + "\n" +
                "deviceStatus: " + getDeviceStatus();
    }

    public void setWifiNetwork(String wifiNetwork) {
        this.wifiNetwork = wifiNetwork;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getWifiNetwork() {
        return wifiNetwork;
    }

    public Boolean getPortable() {
        return portable;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

}
