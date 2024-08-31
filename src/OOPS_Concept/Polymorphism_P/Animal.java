package OOPS_Concept.Polymorphism_P;
//Method overloading
public class Animal {
    public void cat(String name,String type){
        System.out.println("Name: "+ name+"Type: "+ type);
    }
    public void cat(int id,String name,String type){
        System.out.println("id: "+id+" Name: "+name+" Type: "+type);
    }

    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.cat(101,"Bably","Indian cat");
        obj.cat("lalu","Forest cat");
    }
}

