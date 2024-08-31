package All_Patterns.ASS1;

public class Prog5 {
    int id;
    String name;
    String address;
    String mobNo;

    Prog5(int id,String name,String address,String mobNo){
        this.id=id;
        this.name=name;
        this.address=address;
        this.mobNo=mobNo;
    }
    public void display(){
        System.out.println("Id: "+id+" Aame: "+name+" Address: "+address+" Mobile No: "+mobNo);
    }

    public static void main(String[] args) {
        Prog5 prog5=new Prog5(101,"Nilesh","Pune","8380854583");
        prog5.display();
    }
}
