/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehtiwaa;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class E_Login_2Controller implements Initializable {
   private Stage stage;
   private Scene scene;
   private Parent root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    //login for elderly
       @FXML
     public void GoTologinE(ActionEvent event) throws IOException {
      
      Parent root = FXMLLoader.load(getClass().getResource("E_CreateRequest_4.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
     }
      @FXML 
     public void GoTosignupEpage(ActionEvent event) throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("E_signup1.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
     
     }

    
}
