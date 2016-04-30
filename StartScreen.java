import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 * This class creates the start screen and
 * opportunity to pick from one of two pianos.
 * 
 * @author Helene Casanova
 * @version 1.0
 * @since 2016-04-13
 */


public class StartScreen extends Application{

	Pane p = new Pane();
	Scene scene = new Scene(p, 1400, 900);
	ToggleGroup toggle = new ToggleGroup();
	Button enter = new Button("enter");
	RadioButton middleOctave = new RadioButton();
	RadioButton threeOctave = new RadioButton();
	DropShadow ds = new DropShadow();
	
	/**
	 * This is the start method where methods are called to add the objects
	 * to the screen.
	 * 
	 * @param stage
	 * @throws Exception
	 * @return nothing
	 */
	@Override
	public void start(Stage stage) throws Exception {
		
		p.setStyle("-fx-background-color: BLACK");
		
		Title();
		PickOctaves();
		button();
		makeSettingsMenu(stage);
		toNextScreen(stage);
		
		scene.getStylesheets().add("file:src/stylesheet.css");
		stage.getIcons().add(new Image("file:src/PianoIcon.jpg"));
		stage.setScene(scene);
		stage.setTitle("Piano Simulator");
		stage.setResizable(false);
		stage.show();
		
	}
	
	/**
	 * This method adds any text that is on this screen to the pane.
	 * @param none
	 * @return nothing
	 */
	
	public void Title(){
		Text t = new Text("Piano Simulator");
		TextFlow title = new TextFlow(t);
		t.setFill(Color.web("#91c7a9"));
		t.setFont(Font.font("2Dumb", 50));
		
		title.setTranslateX(210);
		title.setTranslateY(200);
		
		ds.setColor(Color.web("#03C1D8"));
		ds.setOffsetX(40);
		ds.setOffsetY(20);
		title.setEffect(ds);
		
		Text c = new Text("Pick the Size KeyBoard you Want:");
		TextFlow choice = new TextFlow(c);
		c.setFill(Color.web("#E5DFC5"));
		c.setFont(Font.font("2Dumb", 30));
		choice.setTranslateX(260);
		choice.setTranslateY(280);
		
		p.getChildren().addAll(title, choice);
	}
	
	/**
	 * This method gives the user the option to pick between a one and three octave
	 * piano.
	 * @param none
	 * @return nothing
	 */
	
	public void PickOctaves(){
		
		String label = "Middle Octave";
		Text t = new Text(label);
		t.setFont(Font.font("2Dumb", 30));
		t.setFill(Color.web("#91c7a9"));
		t.setStroke(Color.BLACK);
		TextFlow tf = new TextFlow(t);
		tf.setTranslateX(330);
		tf.setTranslateY(350);
		
		middleOctave.setTranslateX(300);
		middleOctave.setTranslateY(360);
		middleOctave.setToggleGroup(toggle);
	
		
		Text t1 = new Text("Three Octaves");
		t1.setFont(Font.font("2Dumb", 30));
		t1.setFill(Color.web("#91c7a9"));
		t1.setStroke(Color.BLACK);
		TextFlow tf1 = new TextFlow(t1);
		tf1.setTranslateX(330);
		tf1.setTranslateY(400);
		
		threeOctave.setTranslateX(300);
		threeOctave.setTranslateY(410);
		threeOctave.setToggleGroup(toggle);
		
		
		
		p.getChildren().addAll(middleOctave, tf, threeOctave, tf1);
	}
	
	/**
	 * This method adds the combo boxes to the stage and lets the
	 * user choose between a few options.
	 * @param none
	 * @return nothing
	 */
	
	public void makeSettingsMenu(Stage stage){
		ComboBox<String> Settings = new ComboBox<String>();
		Settings.getItems().addAll("Help", "Exit");
		Settings.setValue("Settings");
		Settings.setStyle("-fx-font-family: '2Dumb'; -fx-font-size: 20px; -fx-text-fill: #E5DFC5");
		Settings.setTranslateX(1250);
		Settings.setTranslateY(50);
		
		Tooltip tt = new Tooltip();	
			tt.setText("Help"
					  +"\nExit");
			tt.setStyle("-fx-background-color: #4f0040; -fx-text-fill: #E5DFC5");
			tt.setFont(Font.font("2Dumb", 20));
	
		Settings.setTooltip(tt);
		
		ComboBox<String> Home = new ComboBox<String>();
		Home.getItems().add("Go Home");
		Home.setValue("Home");
		Home.setStyle("-fx-font-family: '2Dumb'; -fx-font-size: 20px; -fx-text-fill: #E5DFC5");
		Home.setTranslateX(1260);
		
		StartScreen ss = new StartScreen();
		
		Home.setOnAction(e ->{
			
			if(Home.getValue() != null){
			try {
				ss.start(stage);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			}
		});
		
		Settings.setOnAction(e ->{
			Stage stageTwo = new Stage();
			
			if(Settings.getValue() == "Help"){
				
				HelpPopUp h = new HelpPopUp();
				try {
					h.start(stageTwo);
					
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				
			
			}
			
			if(Settings.getValue() == "Exit"){
				stage.close();
			}
		});
		
		p.getChildren().addAll(Settings, Home);
	}
	
	/**
	 * This method adds the 'enter' button to the stage
	 * @param none
	 * @return nothing
	 */
	public void button(){
		ds.setColor(Color.web("#03C1D8"));
		
		enter.setTranslateX(570);
		enter.setTranslateY(480);
		enter.setStyle("-fx-border-color:white; -fx-background-color: #A92F41; -fx-font-size: 20px; -fx-font-family: '2Dumb'");
		
		p.getChildren().add(enter);
	}
	
	/**
	 * This method gives tells the button where to go if it is pressed.
	 * @param none
	 * @return nothing
	 */
	public void toNextScreen(Stage stage){
	
		Piano piano = new Piano();
		PianoThreeOctave pto = new PianoThreeOctave();
		enter.setOnAction(e -> {
			
			if(toggle.getSelectedToggle() == middleOctave){
				try {
					piano.start(stage);
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
			else if(toggle.getSelectedToggle() == threeOctave){
			
				try {
					pto.start(stage);
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
			
		});
		
	}
	
	public static void main(String[] args){
		
		Application.launch();
	}

}
