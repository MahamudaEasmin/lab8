public class Main8  {
    public static void main(String[] args) {
        Engine8 eng = new Engine8(34.7);
        DashBoard8 db= new DashBoard8(5.0);
        Volvo8 v=new Volvo8(700,"2022", "DHA34567",eng,db);
        v.drive();
        v.stop();
        v.changeFuel();
        v.checkBattery();
        v.model="SUV. XC40";
        v.company="Volvo";

    }
}

