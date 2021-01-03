public class Fanning extends State{

    Operation myOperation;

    public Fanning(Operation operation){
        this.myOperation = operation;
    }

    public void entryState(){
        System.out.println("OPERATION-FANNING (120 SECONDS AT LEAST)");
    }
}
