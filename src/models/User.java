package models;

public class User {
    private String user;
    private String name;
    private String password;
    
    public User(String user, String name, String password) {
        this.user = user;
        this.name = name;
        this.password = password;
    }
    
    public String getUser() {
        return user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
}

