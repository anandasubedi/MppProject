package dashboard;

import javafx.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.Login;
import ui.ViewPane;

public class DashboardController {
	
	private ActionEvent event;
	
	public Stage stage;

	@FXML
	private Parent embedmenu;
	
	@FXML
	private MenuController menu;
	
	@FXML protected void addBookAction(ActionEvent actionEvent) throws IOException{
		event = actionEvent;
		loadPage("addBook.fxml");
	}
	@FXML protected void addMemberAction(ActionEvent actionEvent) throws IOException{
		event = actionEvent;
		loadPage("addBook.fxml");
	}
	@FXML protected void checkoutBookAction(ActionEvent actionEvent) throws IOException{
		event = actionEvent;
		loadPage("checkoutBook.fxml");
	}
	@FXML protected void addBookCopyAction(ActionEvent actionEvent) throws IOException{
		event = actionEvent;
		loadPage("checkoutBook.fxml");
	}
	@FXML protected void print(ActionEvent actionEvent) throws IOException{
		event = actionEvent;
		loadPage("searchBook.fxml");
	}
	@FXML protected void overDueAction(ActionEvent actionEvent) throws IOException{
		event = actionEvent;
		loadPage("searchBook.fxml");
	}
	public void loadPage(String fxml) throws IOException{
		Parent parent = FXMLLoader.load(getClass().getResource(fxml));
        Scene scene = new Scene(parent,600, 550);
        scene.getStylesheets().add(Login.class.getResource("login.css").toExternalForm());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
      //  stage.hide();
        stage.setScene(scene);
        stage.show();
	}
}
