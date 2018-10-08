
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class PrincipalController implements Initializable {
    
    @FXML
    private TextField txtNumero1, txtNumero2, txtResultado;
    
    @FXML
    private Button btnResultado;
    @FXML
    private Label numero11;
    @FXML
    private Button btncompartilhar;
    @FXML
    private Button btncrescer;
    @FXML
    private Button btnDiminuir;
    
    @FXML
    private void somar(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText()),
               num2 = Double.parseDouble(txtNumero2.getText());
        Double result = num1 + num2;
        
        txtResultado.setText(result.toString());
    }
    @FXML
    private void dividir(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText()),
               num2 = Double.parseDouble(txtNumero2.getText());
        Double result = num1 / num2;
        
        txtResultado.setText(result.toString());
    }
    
    @FXML
    private void multiplicar(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText()),
               num2 = Double.parseDouble(txtNumero2.getText());
        Double result = num1 * num2;
        
        txtResultado.setText(result.toString());
    }
    
    private void Dividir(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText()),
               num2 = Double.parseDouble(txtNumero2.getText());
        Double result = num1 / num2;
        
        txtResultado.setText(result.toString());
    }
    @FXML
    private void subtrair(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText()),
               num2 = Double.parseDouble(txtNumero2.getText());
        Double result = num1 - num2;
        
        txtResultado.setText(result.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salvar(ActionEvent event) {
                EntityManagerFactory emf = Persistence.createEntityManegerFactory("calculadora");
    }
    
}