package mypackage;

/**
 *
 * @author RIVU
 */
public class Truck extends Vehicle{
    private int load_limit_;
    public Truck(int speed,int wheels, int load_limit){
        super(speed,wheels);
        load_limit_=load_limit;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("load limit: "+load_limit_);
    }
    @Override
    public void printmessage(){
        System.out.println("Truck is faster");
    }
}