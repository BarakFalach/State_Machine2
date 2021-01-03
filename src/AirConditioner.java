public class AirConditioner extends ComplexState {

    double Room_Temp ;
    double Change_Temp;
    public State on;
    public State off;
    public State wait;

    public AirConditioner(){
        this.Room_Temp = 25;
        this.Change_Temp = 25;
        this.on = new On(this);
        this.off = new Off(this);
        this.wait = new Wait(this);
        this.setMyState(this.off);
    }

    public void on(){
        this.setMyState(this.wait);
        this.setMyState(this.on);
    }

    public void off(){
        this.setMyState(this.off);
    }

    public void setR_temp(double R_temp){

    }

    public void setC_temp(double C_temp){

    }
}
