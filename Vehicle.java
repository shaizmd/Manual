
public class Vehicle {
    int no_of_seats, no_of_wheels;
    public Vehicle(int numseats, int numwheels ){
        this.no_of_seats = numseats;
        this.no_of_wheels = numwheels;
    }
    public void showVehicle(){
        System.out.println("No of seats:"+this.no_of_seats);
        System.out.println("No of Wheels:"+this.no_of_wheels);
    }
    public static void main(String args[]){
    Vehicle car = new Vehicle(4,4);
    Vehicle motorcycle = new Vehicle(2,2);
    
    System.out.println("Details of car");
    car.showVehicle();
    System.out.println("Details of motorcycle");
    motorcycle.showVehicle();
    
}
}
