import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/home", ((request, response) -> "Hello world"));

        return ;
    }
}
