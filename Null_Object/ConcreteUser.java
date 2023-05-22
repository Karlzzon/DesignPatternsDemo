package Null_Object;

public class ConcreteUser implements User {
    private String name;
    private String email;

    public ConcreteUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public boolean hasEmail() {
        return true;
    }
}
