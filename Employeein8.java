public class Employeein8 {
    int id;
    String name;
    String address;

    public Employeein8(int id, String name,String  address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address8 address1=new Address8("gzb","UP","india");
        Address8 address2=new Address8("gno","UP","india");

        Employeein8 e=new Employeein8(111,"varun",address1);
        Employeein8 e2=new Employeein8(112,"arun",address2);

        e.display();
        e2.display();

    }


}
