package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField Idartikel;

    @FXML
    private TextField titel;

    @FXML
    private TextField stkod;

    @FXML
    private TextField författare;

    @FXML
    private TextField reg;

    @FXML
    private TextField idbn;

    @FXML
    private TextField hyplnr;

    @FXML
    private TextField klass;

    @FXML
    private TextField genrer;

    @FXML
    private TextField proland;

    @FXML
    private TextField åldergr;

    @FXML
    private TextField skådsp;

    @FXML
    private TextField maxlt;

    @FXML
    private Button sparabutton;

    @FXML
    private Button avbrytbutton;

    @FXML
    void Connection(ActionEvent event) {

    }

    @FXML
    void avbryt(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
