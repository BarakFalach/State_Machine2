public class Cooling extends State {


    Operation myOperation;

    public Cooling(Operation operation){
        this.myOperation = operation;
    }

    public void entryState(){
        System.out.println("OPERATION-COOLING");
    }
}
