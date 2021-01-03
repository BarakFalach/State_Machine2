public class Cool extends State {

    Mode myMode;

    public Cool(Mode mode){
        this.myMode = mode;
    }

    public void entryState(){
        System.out.println("MODE-COOL");
    }
}
