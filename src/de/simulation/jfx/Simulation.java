/**
 * 
 */
package de.simulation.jfx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
 


import javafx.scene.text.Text;
import de.simulation.jfx.event.UserEvent;

/**
 * @author ts
 *
 */
public class Simulation  extends Application {

	/**
	 * @param args
	 */
	static int noEvent;

	public static void main(String[] args) {
		launch(args);


		

	}
	
	@Override
	public void start(Stage priStage) throws Exception {

		priStage.setTitle("Simulation");
		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label noEvent = new Label("Enter number of events");
        grid.add(noEvent, 0, 1);		
		final TextField field1 = new TextField();
		grid.add(field1, 1, 1);
		Button btn = new Button();
		btn.setText("Apply");
		grid.add(btn, 0, 2);
		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				int no = Integer.parseInt(field1.getText());
				for (int i = 0; i < no; i++) {
					UserEvent uEvent = new UserEvent();
					System.out.println(uEvent.toString());

				}
			}
		});

		Scene scene = new Scene(grid, 350, 275);
		priStage.setScene(scene);
		priStage.show();

	}

}
