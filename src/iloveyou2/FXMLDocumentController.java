/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iloveyou2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author apple
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private AnchorPane anchor;
    @FXML
    private Pane pane;
    @FXML
    private void handleButtonAction(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        TiledMap map = new TiledMap();
        map.mapData();
        map.renderMap(pane);
    }    
    
}
