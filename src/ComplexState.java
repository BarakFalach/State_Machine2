public class ComplexState extends State {

    State myState;

    public void setMyState(State myState) {
        this.myState = myState;
        this.myState.entryState();
    }

    public State getMyState(){
        return this.myState;
    }
}
