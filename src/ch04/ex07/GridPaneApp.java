package ch04.ex07;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GridPaneApp extends Application {

	@Override
	public void start(Stage stage) {
		final double rem = new Text("").getLayoutBounds().getHeight();
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(0.8 * rem));
		pane.setHgap(0.8 * rem);
		pane.setVgap(0.8 * rem);

		Label userNameLabel = new Label("User name:");
		Label passwordLabel = new Label("Password:");
		TextField username = new TextField();
		PasswordField password = new PasswordField();
		Button okButton = new Button("Ok");
		Button cancelButton = new Button("Cancel");
		HBox buttons = new HBox(0.8 * rem);
		buttons.getChildren().addAll(okButton, cancelButton);
		buttons.setAlignment(Pos.CENTER);

		pane.setGridLinesVisible(true);

		pane.add(userNameLabel, 0, 0);
		pane.add(username, 1, 0);
		pane.add(passwordLabel, 0, 1);
		pane.add(password, 1, 1);
		pane.add(buttons, 0, 2, 2, 1);

		GridPane.setHalignment(userNameLabel, HPos.RIGHT);
		GridPane.setHalignment(passwordLabel, HPos.RIGHT);
		stage.setScene(new Scene(pane));
		stage.show();
	}

	public static void main(String[] args) {
		GridPaneApp.launch();
    }
}
