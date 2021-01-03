public class Heating extends State {

    Operation myOperation;

    public Heating(Operation operation){
        this.myOperation = operation;
    }

    public void entryState(){
        System.out.println("OPERATION-HEATING");
    }
}
