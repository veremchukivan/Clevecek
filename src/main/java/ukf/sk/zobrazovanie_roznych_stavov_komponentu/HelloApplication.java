package ukf.sk.zobrazovanie_roznych_stavov_komponentu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox tlacidla=new VBox();
        HBox root=new HBox();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.show();





        Button b1=new Button("prava");
        Button b2=new Button("lava");
        Button b3=new Button("drep");
        Button b4=new Button("postav");

        Clovek c1=new Clovek();
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                c1.ZmenuPravu();
            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                c1.ZmenuLavy();
            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                c1.doDrepu();
            }
        });
        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                c1.postavSa();
            }
        });


        tlacidla.getChildren().addAll(b1,b2,b3,b4);
        root.getChildren().addAll(c1,tlacidla);
    }



    public static void main(String[] args) {
        launch();
    }
}