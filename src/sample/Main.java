package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        Artiklar art = new Artiklar();
        art.setTitel("Johan Falk 3");
        art.setSkådespelare("Johan");
        art.setÅldergräns("15+");
        art.setGenrer("Kriminalfilm");
        art.setRegissör("Anders Nilsson");
        art.setProductionsLand("Sverige");
        art.setMaxLånTid(30);
        art.setProductionsLand("Sverige");
        art.setKlassificering("Film");
        art.setHyllplatsNr(142);
        art.setIsbn(0);
        art.setStreckkodNr(987547329);
        art.setFörfattare("Anders Nilsson, Joakim Hansson");


    }
}
