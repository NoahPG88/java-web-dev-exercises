package exercises.technology;

public class Program {
    public static void main(String args[]){
        Laptop firstComp = new Laptop("Noah's Laptop", "Wolfpack", false, "Running", false);
        Smartphone firstPhone = new Smartphone("NPG's Phone", "Wolfpack 5G", true, "running", "Verizon");
        System.out.println(firstComp.toString());
        firstComp.setWifiNetwork("Lone Wolf 5G");
        firstComp.putLaptopToSleep();
        System.out.println(firstComp.getDeviceStatus());
        firstPhone.sendText("Neflix and chill tho?");
    }

}
