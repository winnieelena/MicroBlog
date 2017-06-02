import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
public class Menu
{

    String picUrl = "";
    String userName = "";
    String name = "";
    String email = "";
    static ArrayList<User> users = new ArrayList<User>();
    static int selection = -1;
    static int input = 0;

    static String username = "";
    static int number = 0;
    static String content = "";
    static String url = "";
    static Post post = new Post(username, number, content, url);
    static ArrayList<Post> posts = new ArrayList<Post>();

    public static void MicroBlogMenu() {
        out.println();
        out.println("Main Menu");
        out.println("1) Create a new user");
        out.println("2) Become an existing user");
        out.println("3) Create a post as the current user");
        out.println("4) Print all posts");
        out.println("5) Print all users");
        out.println("6) Exit");
        if (selection != -1) {
            out.println("You are currently user \"" + LastUser() + "\". What would you like to do?");
        }
        out.print("> ");
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextInt();

        if (input == 1) {
            CreateUser();
        }
        else if (input == 2) {
            BecomeUser();
        }
        else if (input == 3) {
            CreatePost();
        }
        else if (input == 4) {
            PrintPosts();
        }
        else if (input == 5) {
            PrintUsers();
        }
        else if (input == 6) {
            main();
        }
        else {
            out.println("Sorry, that is not a valid entry. Please try again.");
        }

    }

    public static String LastUser() {
        if (users.size() == 0) {
            return "";
        }
        return users.get(selection).getUserName();

    }

    public static void ChangeUser() {
        if (users.size() == 0) {
            System.out.print("");
        }

        Scanner intInput = new Scanner(System.in);
        selection = intInput.nextInt();
        System.out.print(users.get(selection).getUserName());
    }

    public static void BecomeUser() {
        PrintUsers();
        out.print("Which user would you like to select? ");
        ChangeUser();
    }

    public static void CreateUser() {

        out.print("URL to Picture: ");
        Scanner input1 = new Scanner(System.in);
        String picUrl = input1.nextLine();

        out.print("Username: ");
        Scanner input2 = new Scanner(System.in);
        String userName = input2.nextLine();

        out.print("Full Name: ");
        Scanner input3 = new Scanner(System.in);
        String name = input3.nextLine();

        out.print("Email: ");
        Scanner input4 = new Scanner(System.in);
        String email = input4.nextLine();

        users.add(new User(picUrl, userName, name, email));

    }

    public static void CreatePost() {

        PrintLastPost();

        out.print("Content: ");
        Scanner input1 = new Scanner(System.in);
        String content = input1.nextLine();

        out.print("URL: ");
        Scanner input2 = new Scanner(System.in);
        String url = input2.nextLine();

        if (selection != -1) {
            username = users.get(selection).getUserName().toString();
            posts.add(new Post(username, number, content, url));

            number++;
        }

        //         for (int i = 0; i < users.size(); i++) {
        //             if (i == selection) {
        //                 out.print(number);
        //                 posts.add(new Post(username, number, content, url));
        //                 number++;
        //             }
        //         }
    }

    public static void PrintUsers() {

        for (int i = 0; i < users.size(); i++) {
            out.print(i + ". ");
            out.println(users.get(i).getUserName().toString());
        }
    }

    public static void PrintPosts() {
        for (int i = 0; i < posts.size(); i++) {
            out.println(posts.get(i).getUsername().toString());
            out.println(i);
            out.println(posts.get(i).getContent().toString());
            out.println(posts.get(i).getURL().toString());
            out.println();
        }
    }

    public static void PrintLastPost() {
        if (posts.size() > 0) {
            for (int i = 0; i < posts.size(); i++) {
                if (username.equals(users.get(selection).getUserName())) {
                    out.println(posts.get(posts.size()-1).getUsername().toString());
                    out.println(posts.size()-1);
                    out.println(posts.get(posts.size()-1).getContent().toString());
                    out.println(posts.get(posts.size()-1).getURL().toString());
                    out.println();
                    break;
                }
            }
        }
    }

    public static void main() {
        boolean keepGoing = true;
        while (keepGoing) {
            if (input == 6) {
                break;
            }
            MicroBlogMenu();
        }
    }
}