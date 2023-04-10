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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abdullah alhasani
 */
public class E_signup1Controller implements Initializable {
   private Stage stage;
   private Scene scene;
   private Parent root;
   
    @FXML
    private TextField usarName;
    @FXML
    private TextField usarName1;
    @FXML
    private TextField usarName11;
    @FXML
    private TextField usarName12;
    @FXML
    private TextField usarName2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    public void GoToNextSingup(ActionEvent event) throws IOException {
              Parent root = FXMLLoader.load(getClass().getResource("E_signup2.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
    }

    @FXML
    public void BackToPage_E(ActionEvent event) throws IOException {
        
      Parent root = FXMLLoader.load(getClass().getResource("E_Login_2.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
        } 
        
        
        
    
    
       
     //bar buttons
    //main icon
     @FXML
    public void BackToHomePage_E(ActionEvent event) throws IOException{
           
      Parent root = FXMLLoader.load(getClass().getResource("E_CreateRequest_4.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
        } 
    

    
    
    
    //request icon
     @FXML
     public void GoToRequest_E(ActionEvent event) throws IOException{

      Parent root = FXMLLoader.load(getClass().getResource("E_AllRequest_7.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
        } 

 
   
    //more icon
    @FXML
     public void GoToMore_E(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("E_More_00.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 
    
}
