public class Wait extends State {

    AirConditioner myAirConditioner;

    public Wait(AirConditioner airConditioner){
        this.myAirConditioner = airConditioner;
    }

    public void entryState(){
        System.out.println("WAITING 30 SECONDS");
    }
}
