package login;

import java.io.IOException;

import dataaccess.Auth;
import dataaccess.DataAccessFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginController {
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML 
	private Text actiontarget;
	    
	    @FXML 
	protected void handleSubmitButtonAction(ActionEvent event) throws IOException {
	    	
	    	if(username.getText().equals("") || password.getText().equals("")){
	    		actiontarget.setText("Please enter username and password");
	    		
	    	}
	    	else{
	    	Auth auth = new DataAccessFacade().login(username.getText(), password.getText());
	    	if(auth == null ){
	    		actiontarget.setText("Password is incorrect");
	    	}
	    	else{
	    		Parent parent = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
	            Scene scene = new Scene(parent,600, 550);
	            scene.getStylesheets().add(Login.class.getResource("login.css").toExternalForm());
	            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	            
	            stage.hide();
	            stage.setScene(scene);
	            stage.show();  
	        
	    	}
	    	}
	    	
	    }
}
