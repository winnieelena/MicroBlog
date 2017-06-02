import java.util.Scanner;
public class User
{
    private String picUrl;
    private String userName;
    private String name;
    private String email;
    
    public User(String picUrl, String userName, String name, String email) {
        this.picUrl = picUrl;
        this.userName = userName;
        this.name = name;
        this.email = email;
    }

    public String getURL() {
        return picUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
//     public Post getPost(Post post) {
//         return post;
//     }

    public void setURL(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//     
//     public void setPost(Post post) {
//         this.post = post;
//     }

    
}