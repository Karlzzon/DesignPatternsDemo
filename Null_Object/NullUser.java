package Null_Object;

public class NullUser implements User {

    @Override
    public String getName() {
        return "Guest";
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public boolean hasEmail() {
        return false;
    }

}
