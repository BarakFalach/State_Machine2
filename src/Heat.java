public class Heat extends State {

    Mode myMode;

    public Heat(Mode mode){
        this.myMode = mode;
    }

    public void entryState(){
        System.out.println("MODE-HEAT");
    }
}
