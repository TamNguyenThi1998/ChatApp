package ducthuan.com.chatapp.Model;

public class User {
    private String id;
    private String username;
    private String email;
    private String image;
    private String status;

    public User() {
    }

    public User(String id, String username, String email, String image,String status) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.image = image;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
