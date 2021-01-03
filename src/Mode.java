public class Mode extends ComplexState {

    State cool;
    State heat;
    State myOn;

    public Mode(State on){
        this.myOn = on;
        this.heat = new Heat(this);
        this.cool = new Cool(this);
    }

}
