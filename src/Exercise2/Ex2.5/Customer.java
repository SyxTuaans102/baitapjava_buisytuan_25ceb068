public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.gender = (char)(discount);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + "(" + id + ")";
    }
}