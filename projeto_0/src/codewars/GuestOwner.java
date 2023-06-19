package codewars;

public class GuestOwner {
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest"; 
    }

}
