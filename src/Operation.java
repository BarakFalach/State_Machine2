public class Operation extends ComplexState {

    State heating;
    State cooling;
    State fanning;
    On myOn;

    public Operation(On on){
        this.myOn = on;
        this.heating = new Heating(this);
        this.cooling = new Cooling(this);
        this.fanning = new Fanning(this);
    }

}
