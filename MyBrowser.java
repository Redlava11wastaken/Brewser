import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
public class MyBrowser extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Web Browser");
        WebView webView = new WebView();
        webView.getEngine().load("https://www.example.com");
        StackPane root = new StackPane();
        root.getChildren().add(webView);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
