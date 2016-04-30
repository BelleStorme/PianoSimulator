import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * This class plays songs on a one piano and 
 * also gives the user an opportunity to play 
 * the piano.
 * 
 * @author Helene Casanova
 * @version 1.0
 * @since 2016-04-13
 */

public class Piano extends Application{

	Pane p = new Pane();
	Scene scene = new Scene(p, 1400, 900);
	
	Rectangle[] rect = new Rectangle[8];
	Rectangle[] black = new Rectangle[6];
	Polygon[] bottomOne = new Polygon[8];
	Polygon sidePiano = new Polygon();
	
	
	AudioClip d;
	
	AudioClip eM;
	
	AudioClip f;
	
	AudioClip g;
	
	AudioClip a;
	
	AudioClip b;
	
	AudioClip cN;
	
	AudioClip c1;
	
	AudioClip cS;

	AudioClip dS;
	
	AudioClip fS;
	
	AudioClip gS;
	
	AudioClip aS;
	
	String funsong = "CDECAADCACCDEGDCCDEDCAABCBAGGGEDC";
	String drunkenSailor = "AAAAAADFAGGGGGGGCEGAAAAAAABCDCAGEDD";
	String whenTheSaintsGoMarching="CEFG CEFG CEFG ECED EEDC CEGGF EEFGECDC";
	int i = 0;
	

	/**
	 * The start method calls the void methods so we can add them
	 * to the screen. It also sets the icons title and adds a 
	 * style sheet to the program.
	 * @param stage setting stage
	 * @throws Exception
	 * @return nothing
	 */
	
	@Override
	public void start(Stage stage) throws Exception {

		makeWhiteKeys();
		makeBlackKeys();
		threeD();
		hoverKey();
		pressBlackKeys();
		pressWhiteKeys();
		makeSettingsMenu(stage);
		lettersOnKeys();
		
	
		p.setStyle("-fx-background-color:black;");
		
		scene.getStylesheets().add("file:src/stylesheet.css");
		stage.getIcons().add(new Image("file:src/PianoIcon.jpg"));
		stage.setScene(scene);
		
		stage.show();
		
	}
	
	/**
	 * This method sets the keys to red if you hover over them and
	 * back to white if you are not hovered 
	 * @param nothing
	 * @return void method
	 */
	
	public void hoverKey(){
		rect[0].setOnMouseMoved(e ->{
			
			rect[0].setFill(Color.RED);
			bottomOne[0].setFill(Color.RED);
			sidePiano.setFill(Color.RED);
			
		});
		rect[0].setOnMouseExited(e ->{
			
			rect[0].setFill(Color.WHITE);
			bottomOne[0].setFill(Color.WHITE);
			sidePiano.setFill(Color.WHITE);
		});
	
		rect[1].setOnMouseMoved(e ->{
			
			rect[1].setFill(Color.RED);
			bottomOne[1].setFill(Color.RED);
			
			
		});
		rect[1].setOnMouseExited(e ->{
			
			rect[1].setFill(Color.WHITE);
			bottomOne[1].setFill(Color.WHITE);
		});
		
		rect[2].setOnMouseMoved(e ->{
			
			rect[2].setFill(Color.RED);
			bottomOne[2].setFill(Color.RED);
			
			
		});
		rect[2].setOnMouseExited(e ->{
			
			rect[2].setFill(Color.WHITE);
			bottomOne[2].setFill(Color.WHITE);
			
		});
	
		rect[3].setOnMouseMoved(e ->{
			
			rect[3].setFill(Color.RED);
			bottomOne[3].setFill(Color.RED);
			
			
		});
		rect[3].setOnMouseExited(e ->{
			
			rect[3].setFill(Color.WHITE);
			bottomOne[3].setFill(Color.WHITE);
		});
		
		rect[4].setOnMouseMoved(e ->{
			
			rect[4].setFill(Color.RED);
			bottomOne[4].setFill(Color.RED);
			
			
		});
		rect[4].setOnMouseExited(e ->{
			
			rect[4].setFill(Color.WHITE);
			bottomOne[4].setFill(Color.WHITE);
		});
		
		rect[5].setOnMouseMoved(e ->{
			
			rect[5].setFill(Color.RED);
			bottomOne[5].setFill(Color.RED);
			
			
		});
		rect[5].setOnMouseExited(e ->{
			
			rect[5].setFill(Color.WHITE);
			bottomOne[5].setFill(Color.WHITE);
			
		});
	
		rect[6].setOnMouseMoved(e ->{
			
			rect[6].setFill(Color.RED);
			bottomOne[6].setFill(Color.RED);
			
			
		});
		rect[6].setOnMouseExited(e ->{
			
			rect[6].setFill(Color.WHITE);
			bottomOne[6].setFill(Color.WHITE);
		});
		
		rect[7].setOnMouseMoved(e ->{
			
			rect[7].setFill(Color.RED);
			bottomOne[7].setFill(Color.RED);
			
			
		});
		rect[7].setOnMouseExited(e ->{
			
			rect[7].setFill(Color.WHITE);
			bottomOne[7].setFill(Color.WHITE);
		});
	}
	
	/**
	 * This method adds the white keys to the pane.
	 * @param nothing
	 * @return void method
	 */
	
	public void makeWhiteKeys(){

		
		int x = 200;
		
		for(int i = 0; i < rect.length; i++){
			
			rect[i] = new Rectangle(100, 500);
			rect[i].setTranslateX(x);
			rect[i].setTranslateY(200);
			rect[i].setFill(Color.WHITE);
			rect[i].setStroke(Color.BLACK);
			
			x += 100;
			
			p.getChildren().add(rect[i]);
		}
		
	
	}
	
	/**
	 * This method adds the black keys to the pane.
	 * @param nothing
	 * @return void method
	 */
	
	public void makeBlackKeys(){
		int x = 280;
		
		for(int i = 0; i < black.length; i++){
			
			black[i] = new Rectangle(40, 200);
			black[i].setTranslateX(x);
			black[i].setTranslateY(200);
			
			if(i == 2){
				black[i].setFill(Color.WHITE);
				x+=100;
			}
			
			else{
			x+=100;
			
			black[i].setArcHeight(20);
			black[i].setArcWidth(10);
			
			p.getChildren().add(black[i]);
			}
			
		}
	}
	
	/**
	 * This method gives the piano keys a 3d effect.
	 * @param nothing
	 * @return void method
	 */
	
	public void threeD(){

			
			int x = 0;
			for(int i = 0; i < bottomOne.length; i++){
				bottomOne[i] = new Polygon();
				bottomOne[i].setStroke(Color.BLACK);
				bottomOne[i].getPoints().addAll(new Double[]{
						130.0 + x,760.0,
						200.0 + x, 700.0,
						300.0 + x, 700.0,
						230.0 + x, 760.0});
				
					x+=100;
				bottomOne[i].setFill(Color.WHITE);
				
				p.getChildren().add(bottomOne[i]);
			}
			
		sidePiano.getPoints().addAll(new Double[]{
		        90.0, 250.0,
		        160.0, 200.0,
		        160.0, 700.0,
		        90.0, 760.0 });
		sidePiano.setFill(Color.WHITE);
		sidePiano.setStroke(Color.BLACK);
		sidePiano.setTranslateX(40);
		p.getChildren().add(sidePiano);
		
		
	}
	
	/**
	 * This method gives the white keys sound and a change in color if
	 * they are pressed 
	 * @param nothing
	 * @return void method
	 */
	
	public void pressWhiteKeys(){

		
		rect[0].setOnMousePressed(new EventHandler<MouseEvent>(){
			
			@Override
			public void handle(MouseEvent e) {
				
				
					rect[0].setFill(Color.RED);
					bottomOne[0].setFill(Color.RED);
					sidePiano.setFill(Color.RED);
					
					cN = new AudioClip("file:src/com/casanovah/piano/Sound/piano_middle_C.wav");
					cN.play();
					e.consume();	
				}	
		});
		
	
		rect[0].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[0].setFill(Color.WHITE);
				bottomOne[0].setFill(Color.WHITE);
				sidePiano.setFill(Color.WHITE);
				
			}
			
		});
		
		
		
		rect[1].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[1].setFill(Color.RED);
					bottomOne[1].setFill(Color.RED);
					d = new AudioClip("file:src/com/casanovah/piano/Sound/piano_D.wav");					
					d.play();
					e.consume();
			}
		});
		
	
		rect[1].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[1].setFill(Color.WHITE);
				bottomOne[1].setFill(Color.WHITE);
				
				
			}
			
		});
		
		rect[2].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[2].setFill(Color.RED);
					bottomOne[2].setFill(Color.RED);
					
					eM = new AudioClip("file:src/com/casanovah/piano/Sound/piano_E.wav");
					eM.play();
					e.consume();
			}
		});
		
	
		rect[2].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[2].setFill(Color.WHITE);
				bottomOne[2].setFill(Color.WHITE);
				
				
			}
			
		});
		
		rect[3].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[3].setFill(Color.RED);
					bottomOne[3].setFill(Color.RED);
					
					f = new AudioClip("file:src/com/casanovah/piano/Sound/piano_F.wav");
					f.play();
					e.consume();
			}
		});
		
	
		rect[3].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[3].setFill(Color.WHITE);
				bottomOne[3].setFill(Color.WHITE);
				
				
			}
			
		});
		
		rect[4].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[4].setFill(Color.RED);
					bottomOne[4].setFill(Color.RED);
				
					g = new AudioClip("file:src/com/casanovah/piano/Sound/piano_G.wav");
					g.play();
					e.consume();
			}
		});
		
	
		rect[4].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[4].setFill(Color.WHITE);
				bottomOne[4].setFill(Color.WHITE);
				
				
			}
			
		});
		
		rect[5].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[5].setFill(Color.RED);
					bottomOne[5].setFill(Color.RED);
					
					a = new AudioClip("file:src/com/casanovah/piano/Sound/piano_A.wav");
					a.play();
					e.consume();
			}
		});
		
	
		rect[5].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[5].setFill(Color.WHITE);
				bottomOne[5].setFill(Color.WHITE);
				
				
			}
			
		});
		
		rect[6].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[6].setFill(Color.RED);
					bottomOne[6].setFill(Color.RED);
					b = new AudioClip("file:src/com/casanovah/piano/Sound/piano_B.wav");
					b.play();
					e.consume();
			}
		});
		
	
		rect[6].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[6].setFill(Color.WHITE);
				bottomOne[6].setFill(Color.WHITE);
				
				
			}
			
		});
		
		rect[7].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[7].setFill(Color.RED);
					bottomOne[7].setFill(Color.RED);
					
					c1 = new AudioClip("file:src/com/casanovah/piano/Sound/C_High.wav");
					c1.setVolume(.5);
					c1.play();
					e.consume();
			}
		});
		
	
		rect[7].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[7].setFill(Color.WHITE);
				bottomOne[7].setFill(Color.WHITE);
				
				
			}
			
		});
	}
		
	/**
	 * This method gives the black keys sound and a change in color if
	 * they are pressed 
	 * @param nothing
	 * @return void method
	 */
	
	public void pressBlackKeys(){

		
		black[0].setOnMousePressed(new EventHandler<MouseEvent>(){
			
			@Override
			public void handle(MouseEvent e) {
					black[0].setFill(Color.RED);
					
					cS = new AudioClip("file:src/com/casanovah/piano/Sound/piano_C_Sharp.wav");
					cS.play();
					e.consume();
					
				}
		});
		
	
		black[0].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[0].setFill(Color.BLACK);
				
			}
			
		});
		
		
		black[1].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					black[1].setFill(Color.RED);
					
					dS = new AudioClip("file:src/com/casanovah/piano/Sound/piano_D_Sharp.wav");
					dS.play();
					e.consume();
			}
		});
		
	
		black[1].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[1].setFill(Color.BLACK);
				
			}
			
		});
		
		
		black[3].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					black[3].setFill(Color.RED);
					
					fS = new AudioClip("file:src/com/casanovah/piano/Sound/piano_F_Sharp.wav");
					fS.play();
					e.consume();
			}
		});
		
	
		black[3].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[3].setFill(Color.BLACK);
				
			}
			
		});
		
		black[4].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					black[4].setFill(Color.RED);
					
					gS = new AudioClip("file:src/com/casanovah/piano/Sound/piano_G_Sharp.wav");
					gS.play();
					e.consume();
			}
		});
		
		black[4].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[4].setFill(Color.BLACK);
				
				
				
			}
			
		});
		
		black[5].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					black[5].setFill(Color.RED);
					
					aS = new AudioClip("file:src/com/casanovah/piano/Sound/piano_A_Sharp.wav");
					aS.play();
					e.consume();
			}
		});
		
	
		black[5].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[5].setFill(Color.BLACK);		
			}
			
		});
		
	
	}
	
	/**
	 * This method makes the menu on the side of the screen
	 * @param nothing
	 * @return void method
	 */
	
	public void makeSettingsMenu(Stage stage){
		
		ComboBox<String> Settings = new ComboBox<String>();
		Settings.getItems().addAll("Help", "Exit");
		Settings.setValue("Settings");
		Settings.setStyle("-fx-font-family: '2Dumb'; -fx-font-size: 20px; -fx-text-fill: #E5DFC5");
		Settings.setTranslateX(1230);
		Settings.setTranslateY(50);
		
		
		ComboBox<String> Home = new ComboBox<String>();
		Home.getItems().add("Go Home");
		Home.setValue("Home");
		Home.setStyle("-fx-font-family: '2Dumb'; -fx-font-size: 20px; -fx-text-fill: #E5DFC5");
		Home.setTranslateX(1230);
		
		ComboBox<String> Music = new ComboBox<String>();
		Music.getItems().addAll("Sheet Music");
		Music.setValue("Music");
		Music.setStyle("-fx-font-family: '2Dumb'; -fx-font-size: 20px; -fx-text-fill: #E5DFC5");
		Music.setTranslateX(1230);
		Music.setTranslateY(100);
		
		ComboBox<String> Songs = new ComboBox<String>();
		//The subtopic include the various songs the piano can play
		Songs.getItems().addAll("FUN Song", "Drunken Sailor", "When the Saints go Marching One by One");
		Songs.setValue("Songs");
		Songs.setStyle("-fx-font-family: '2Dumb'; -fx-font-size: 20px; -fx-text-fill: #E5DFC5");
		Songs.setTranslateX(1230);
		Songs.setTranslateY(150);
		
		sheetMusic sm = new sheetMusic();
		
		Music.setOnAction(e ->{
			Stage stageTwo = new Stage();
			if(Music.getValue() == "Sheet Music"){
				try {
					sm.start(stageTwo);
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
			
		});
		Songs.setOnAction(e ->{
			if(Songs.getValue() == "FUN Song"){
				Text t = new Text("FUN Song");
				t.setFont(new Font("2Dumb", 30));
				t.setFill(Color.WHITE);
				TextFlow tf = new TextFlow(t);
				
				p.getChildren().add(tf);
				if(i == funsong.length()-1){
					p.getChildren().remove(tf);
				}	
				animatePiano ani = new animatePiano(funsong, rect, sidePiano, black, p, tf);
				
				//This huge if-else block gets the first letter of the song and call the class animate which animates
				//the rest of the song
				if(funsong.charAt(i) == 'C'){
					ani.playC();
				}
				else if(funsong.charAt(i) == 'D'){
					ani.playD();
				}
				else if(funsong.charAt(i) == 'E'){
					ani.playE();
				}
				else if(funsong.charAt(i) == 'F'){
					ani.playF();
				}
				else if(funsong.charAt(i) == 'G'){
					ani.playG();
				}
				else if(funsong.charAt(i) == 'A'){
					ani.playA();
				}
				else if(funsong.charAt(i) == 'B'){
					ani.playB();
				}
				else{
					ani.playSpace();
				}
			}
			if(Songs.getValue() == "When the Saints go Marching One by One"){
				Text t = new Text("When the Saints go Marching One by One");
				t.setFont(new Font("2Dumb", 30));
				t.setFill(Color.WHITE);
				TextFlow tf = new TextFlow(t);
				
				p.getChildren().add(tf);
					
				animatePiano ani = new animatePiano(funsong, rect, sidePiano, black, p, tf);
				
				//This huge if-else block gets the first letter of the song and call the class animate which animates
				//the rest of the song
				if(whenTheSaintsGoMarching.charAt(i) == 'C'){
					ani.playC();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'D'){
					ani.playD();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'E'){
					ani.playE();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'F'){
					ani.playF();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'G'){
					ani.playG();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'A'){
					ani.playA();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'B'){
					ani.playB();
				}
				else{
					ani.playSpace();
				}
			}
			
			if(Songs.getValue() == "Drunken Sailor"){
				Text t = new Text("Drunken Sailor");
				t.setFont(new Font("2Dumb", 30));
				t.setFill(Color.WHITE);
				TextFlow tf = new TextFlow(t);
				
				p.getChildren().add(tf);
				if(i == drunkenSailor.length()-1){
					p.getChildren().remove(tf);
				}	
				animatePiano ani = new animatePiano(drunkenSailor, rect, sidePiano, black, p , tf);
				
				//This huge if-else block gets the first letter of the song and call the class animate which animates
				//the rest of the song
				if(drunkenSailor.charAt(i) == 'C'){
					ani.playC();
				}
				else if(drunkenSailor.charAt(i) == 'D'){
					ani.playD();
				}
				else if(drunkenSailor.charAt(i) == 'E'){
					ani.playE();
				}
				else if(drunkenSailor.charAt(i) == 'F'){
					ani.playF();
				}
				else if(drunkenSailor.charAt(i) == 'G'){
					ani.playG();
				}
				else if(drunkenSailor.charAt(i) == 'A'){
					ani.playA();
				}
				else if(drunkenSailor.charAt(i) == 'B'){
					ani.playB();
				}
				else{
					ani.playSpace();
				}
			}
		});
		
		
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
		
		
		
		
		p.getChildren().addAll(Settings, Home, Music, Songs);
	}
	
	/**
	 * This method adds the letter on the keys so the user knows what keys
	 * they are pressing.
	 * 
	 * @param nothing
	 * @return void method
	 */
	public void lettersOnKeys(){

		Text t = new Text("C");
		t.setFont(Font.font("2Dumb", 30));
		TextFlow tf = new TextFlow(t);
		tf.setTranslateX(220);
		tf.setTranslateY(650);
		
		Text t1 = new Text("D");
		t1.setFont(Font.font("2Dumb", 30));
		TextFlow tf1 = new TextFlow(t1);
		tf1.setTranslateX(320);
		tf1.setTranslateY(650);
		
		Text t2 = new Text("E");
		t2.setFont(Font.font("2Dumb", 30));
		TextFlow tf2 = new TextFlow(t2);
		tf2.setTranslateX(420);
		tf2.setTranslateY(650);
		
		Text t3 = new Text("F");
		t3.setFont(Font.font("2Dumb", 30));
		TextFlow tf3 = new TextFlow(t3);
		tf3.setTranslateX(520);
		tf3.setTranslateY(650);
		
		Text t4 = new Text("G");
		t4.setFont(Font.font("2Dumb", 30));
		TextFlow tf4 = new TextFlow(t4);
		tf4.setTranslateX(620);
		tf4.setTranslateY(650);
		
		Text t5 = new Text("A");
		t5.setFont(Font.font("2Dumb", 30));
		TextFlow tf5 = new TextFlow(t5);
		tf5.setTranslateX(720);
		tf5.setTranslateY(650);
		
		Text t6 = new Text("B");
		t6.setFont(Font.font("2Dumb", 30));
		TextFlow tf6 = new TextFlow(t6);
		tf6.setTranslateX(820);
		tf6.setTranslateY(650);
		
		Text t7 = new Text("C");
		t7.setFont(Font.font("2Dumb", 30));
		TextFlow tf7 = new TextFlow(t7);
		tf7.setTranslateX(920);
		tf7.setTranslateY(650);
		
		p.getChildren().addAll(tf, tf1, tf2, tf3, tf4, tf5, tf6, tf7);
	}
	
	
	
	
	public static void main(String[] args){
		
		Application.launch();
		
	}
	

}

