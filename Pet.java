public class Pet {

    public static void main(String[] args) {
        Pet pet2 = new Pet();
        pet2.setName("Maki");
        pet2.setAge(1);
        pet2.setLocation("Georgia");
        pet2.setType("Cat");
        System.out.println(pet2.getName());

        Pet pet1 = new Pet("Amy", 15, "Charlotte", "Shih Tzu");
        System.out.println(pet1.getName());
    }

    private String name, location, type;
    private int age;

    Pet() {
        this.name = "Harry";
        this.age = 3;
        this.location = "North Carolina";
        this.type = "Dog";
        }

    Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getLocation() {
        return location;
    }
    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setType(String type) {
        this.type = type;
    }
}