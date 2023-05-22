package Null_Object;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new ConcreteUser("John", "John@Example.com");
        users[1] = new ConcreteUser("Jane", "Jane@Example.com");
        users[2] = new NullUser();
        for (User user : users) {
            displayUserEmail(user);
        }
    }

    public static void displayUserEmail(User user) {
        Optional<String> emailOptional = Optional.ofNullable(user.getEmail());
        String email = emailOptional.orElse("No email found");
        System.out.println("User: " + user.getName() + ", Email: " + email);
    }

}
