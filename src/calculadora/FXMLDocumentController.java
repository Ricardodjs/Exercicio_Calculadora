/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author IFNMG
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button btnCalcular;
    @FXML
    private TextField txtnum;
    @FXML
    private Label lblDobro;
    @FXML
    private Label lblTriplo;
    @FXML
    private Label lblQuad;
    @FXML
    private Label lblCubo;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String num = txtnum.getText();
        
        int dobro  = Integer.parseInt(num);
        int soma = dobro * 2;
        lblDobro.setText(Integer.toString(soma));
        
        int triplo = Integer.parseInt(num);
         int soma2 = triplo * 3;
         lblTriplo.setText(Integer.toString(soma2));
         
           int quad = Integer.parseInt(num);
         int quadrado = quad * quad;
         lblQuad.setText(Integer.toString(quadrado));
         
         int cub = Integer.parseInt(num);
         int cubo = cub*cub*cub;
         lblCubo.setText(Integer.toString(cubo));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
