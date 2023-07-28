package manager.dto;

public class Manager {
    private String Id;
    private String password;

    public Manager() {
    }

    public Manager(String Id, String password) {
        this.Id = Id;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
}
