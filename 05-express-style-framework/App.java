public class App {
    public static void main(String[] args) {
        Server app = new Server();

        app.use("/test", ((request, response) -> {
            response.setStatus(200)
                    .setHeaders("Content-Type", "text/html")
                    .send("<h1>Hello, web framework!</h1>");
        }));

        app.listen(3000);
    }
}
