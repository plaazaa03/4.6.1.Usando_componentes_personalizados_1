package es.ieslosmontecillos.appusoselector;

import es.ieslosmontecillos.componentes_plazaraul.SelectorDeslizamiento;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class UsoSelectorController implements Initializable {

    @FXML
    private SelectorDeslizamiento selector1;
    @FXML
    private SelectorDeslizamiento selector2;
    @FXML
    private Label text;


    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> listaElementos = new ArrayList<>();

        listaElementos.add("Uno");
        listaElementos.add("Dos");
        listaElementos.add("Tres");

        selector1.setItems(listaElementos);
        selector2.setItems(listaElementos);

        selector1.setOnAction(event -> {
            text.setText("Pulsado selector de arriba");
        });

        selector2.setOnAction(event -> {
            text.setText("Pulsado selector de abajo");
        });
    }
}