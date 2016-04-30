import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;


/**
 * This class just contains the Help Pop Up. It pops up 
 * when it is chosen in the menu.
 * @author Helene Casanova
 * @version 1.0
 * @since 2016-04-13
 */
public class HelpPopUp extends Application{

	Pane p = new Pane();
	BorderPane pane = new BorderPane();
	Scene scene = new Scene(pane, 600, 400);
	ScrollBar sb = new ScrollBar();
	Text t, t1;
	int num;
	
	/**
	 * This is the start method where the text is added to the stage.
	 * @param stage
	 * @throws Exception
	 * @return nothing
	 */
	@Override
	public void start(Stage stage) throws Exception {
		
		//set our pane to center
		pane.setCenter(p);
		
		//put help text in a string
		String words = "Hello User! "
				+ "\n\nThis is a Piano Simulator."
				+ "\n\nYou can choose between the "
				+ "\n\nmiddle seven octaves and a "
				+ "\n\nthree octave piano. "
				+ "\n\nThere are also some simple "
				+ "\n\nsongs you can learn"
				+ "\n\njust by clicking the tab 'Songs'. "
				+ "\n\nYou can also choose to read "
				+ "\n\nthe sheet music or have the "
				+ "\n\npiano tell you the notes to "
				+ "\n\nplay.";
		
		//put in text so we can add it to the screen
		t = new Text(words);
		TextFlow tf = new TextFlow(t);
		t.setFont(Font.font("2Dumb", 30));
		
	
		p.getChildren().addAll(tf);
		
		//setting the scroll bar
		sb.setPrefHeight(scene.getHeight());
		sb.setOrientation(Orientation.VERTICAL);
		
		pane.setRight(sb);
		
		
		sb.valueProperty().addListener(ov ->
			tf.setTranslateY(-(sb.getValue() * p.getHeight() /
					sb.getMax())*2)
			
			
		);
		
		
		
		stage.setScene(scene);
		stage.setResizable(false);
		stage.getIcons().add(new Image("file:src/PianoIcon.jpg"));
		stage.setTitle("Piano Simulator: Help");
		stage.show();
		
	}
	
	
	
	public static void main(String[] args){
		
		Application.launch(args);
	}

}
