public class Lamp{
            boolean isOn;
 void turnOn(){
                   isOn = true;
                    System.out.println("TurnOn lamp="+isOn);
                   }
void turnOff(){
                  isOn = false;
                    System.out.println("Turnoff lamp="+isOn);
                    }
public static void main(String[] args){
                    Lamp led=new Lamp();
                    Lamp halogen=new Lamp();
                    led.turnOn();
                    halogen.turnOff();
}
}
