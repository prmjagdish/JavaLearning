package InnerClasses;

public class Car {

    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine{
        public void start(){
            if (!isEngineOn){
                isEngineOn = true;
                System.out.println(model + " Engine started");
            }else {
                System.out.println(model + " Engine already on");
            }
        }

        public void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + " Engine stopped.");
            }else {
                System.out.println(model + " Engine already off");
            }
        }
    }
}
