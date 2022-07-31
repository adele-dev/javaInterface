public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.printf("%s is going to fly!%n", this.getName());
    }

    @Override
    public int ascend(int meters){
        this.altitude  = this.altitude + meters;
        System.out.printf("%s is ascending and his new altitude is %s meters%n", this.getName(), meters);
        return this.altitude;
    }

    @Override
    public int descend(int meters){
        this.altitude  = this.altitude - meters;
        System.out.printf("%s is descending and his new altitude is %s meters%n", this.getName(), meters);
        return this.altitude;
    }

    @Override
    public void land(){
        System.out.printf("%s is about to land now :)%n", this.getName());
    }
}
