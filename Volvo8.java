public class Volvo8 extend car8{
    double price;
    String productionYear;
    String registrationNumber;
    String  engine;
    String dashboard;
    public Volvo8(double price, String productionYear, String registrationNumber,String Engine ,String DashBoard )
    {
        this.price=price;
        this.productionYear=productionYear;
        this.registrationNumber=registrationNumber;
        this.engine=engine;
        this.dashboard=dashboard;
    }
    public void changeFuel()
    {
        System.out.println("Changing Fuel");
    }
    public void checkBattery()
    {
        System.out.println("Checking battery");
    }

}
