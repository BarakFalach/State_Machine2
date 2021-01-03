public class On extends ComplexState {

    Mode mode;
    Operation operation;
    AirConditioner myAirConditioner;

    public On(AirConditioner airConditioner){
        this.myAirConditioner = airConditioner;
        this.mode = new Mode(this);
        this.operation = new Operation(this);
    }

    public void entryState(){
        System.out.println("ON");
        this.mode.setMyState(this.mode.cool);
        this.operation.setMyState(this.operation.fanning);
    }
}
