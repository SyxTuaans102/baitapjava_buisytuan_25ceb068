public class Test {
    private String name;
    private String email;
    private char gender;

    public Test(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "[Name: " + name + ", Email: " + email + ", Gender: " + gender + "]";
    }
}

