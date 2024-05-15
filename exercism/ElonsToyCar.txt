public class ElonsToyCar {
    private int metersDriven = 0;
    private int batteryLevel = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
       return "Driven "+metersDriven+" meters";
    }

    public String batteryDisplay() {
        if(batteryLevel == 0){
            return "Battery empty";
        }
        return "Battery at "+batteryLevel+"%";
    }

    public void drive() {
        if(batteryLevel != 0){
             metersDriven += 20;
            batteryLevel -= 1;   
        }
    }
}