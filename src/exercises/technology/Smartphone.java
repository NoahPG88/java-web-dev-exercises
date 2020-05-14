package exercises.technology;

public class Smartphone extends Computer {
    protected String carrier;

    public Smartphone(String deviceName, String wifiNetwork, Boolean portable, String deviceStatus, String carrier) {
        super(deviceName, wifiNetwork, portable=true, deviceStatus);
        this.carrier = carrier;
        setID();
    }

    protected String sendText(String aMsg){
        System.out.println(aMsg);
        return aMsg;
    }
}
