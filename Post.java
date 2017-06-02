import java.util.Scanner;
public class Post {
    private String username;
    private int number;
    private String content;
    private String url;
    private User user;

    public Post(String username, int number, String content, String url) {
        this.username = username;
        this.number = number;
        this.content = content;
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public int getNumber() {
        return number;
    }

    public String getContent() {
        return content;
    }

    public String getURL() {
        return url;
    }

    public User getUser() {
        return user;
    }
    
    public String setUsername() {
        Scanner keyboard = new Scanner(System.in);
        username = keyboard.nextLine();
        return username;
    }

    public int setNumber() {
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        return number;
    }

    public String setContent() {
        Scanner keyboard = new Scanner(System.in);
        content = keyboard.nextLine();
        return content;
    }

    public String setURL() {
        Scanner keyboard = new Scanner(System.in);
        url = keyboard.nextLine();
        return url;
    }
    
    public void setUser (User user) {
    this.user = user;
    }
    
}