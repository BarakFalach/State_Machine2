public class Off extends State {

    AirConditioner myAirConditioner;

    public Off(AirConditioner airConditioner){
        this.myAirConditioner = airConditioner;
    }

    public void entryState(){
        System.out.println("OFF");
    }

}
