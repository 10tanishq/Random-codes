class Car{
     
    String name;
    int model;
    String company;

    //Initialising a parametrized constructors

    public Car(String name, int model, String company){
        this.name = name;
        this.model = model;
        this.company = company; 

        System.out.println(name + "\n" + model + "\n" + company);
    }

}


public class Main{
    public static void main(String args[]){

        //Creating an object 
        Car car = new Car("Mercedees" , 2024, "AMG");

    }
}