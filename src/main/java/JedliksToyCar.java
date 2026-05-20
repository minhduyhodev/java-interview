public class JedliksToyCar {
    private int distance;
    private int battery;
    private String message;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+ this.distance + "meters";
    }

    public String batteryDisplay() {
        if(battery == 0) return "Battery empty";
        return "Battery at " + battery +  "%";
    }

    public void drive() {
        if (battery > 0) {
            battery -= 1;
            distance += 20;  // Each drive adds 20 meters
        }
    }

    public static void main(String[] args) {

    }
}