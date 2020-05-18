public class Car {
    
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Accord", "Spencer", 1994);
        System.out.println(car1.getOwner());

    }

    private String make, model, owner;
    private int year;

    Car() {
        this.make = "Toyota";
        this.model = "Matrix";
        this.owner = "Elijah";
        this.year = 2003;
    }

    Car(String make, String model, String owner, int year){
        this.make = make;
        this.model = model;
        this.owner = owner;
        this.year = year;
    }

    Car(String model, String owner){
        this.model = model;
        this.owner = owner;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getOwner() {
        return owner;
    }
    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setYear(int year) {
        this.year = year;
    }

}