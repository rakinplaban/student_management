abstract public class User {
    public String username;
    public String password;

    abstract public boolean authentication(String username,String password);
}
