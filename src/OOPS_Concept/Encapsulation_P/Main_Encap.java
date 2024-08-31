package OOPS_Concept.Encapsulation_P;
class Employee{
    private int eid;
    private String ename;
    private String eaddress;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid1) {
        eid = eid1;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }
}
class Customer{
    private int cid;
    private String cname;
    private String caddress;

    public void Cid(int cid){
        this.cid=cid;
    }
    public int getCid(){
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }
}
public class Main_Encap {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.setEid(101);
        obj.setEname("Nilesh");
        obj.setEaddress("Pune");
        System.out.println("------------------------Employee Details -----------------------");
        System.out.println("Employee id: "+obj.getEid());
        System.out.println("Employee Name: "+obj.getEname());
        System.out.println("Employee Address: "+obj.getEaddress());

        System.out.println("-------------------------Customer Ditails-------------------------");
        Customer obj1=new Customer();
        obj1.Cid(101);
        obj1.setCname("Deva Shinde");
        obj1.setCaddress("Pune 411027");
        System.out.println("Customer id: "+obj1.getCid());
        System.out.println("Customer Name: "+obj1.getCname());
        System.out.println("Customer Address: "+obj1.getCaddress());
    }
}

