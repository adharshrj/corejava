package WK3.D1;

class powerSwitch{
    boolean isOn;

    void switchOn(){
        isOn = true;
        System.out.println("Checking if switch on is true or false   " + isOn);
    }
    
    void switchOff(){
        isOn = false;
        System.out.println("Checking if switch on is true or false   " + isOn);
    }
}
public class ObjectAndClasses {
    public static void main (String a[]){
        powerSwitch Light = new powerSwitch();
        powerSwitch Fan = new powerSwitch();
        powerSwitch AC = new powerSwitch();

            Light.switchOn();
            Fan.switchOff();
            AC.switchOn();
    
    }

}
