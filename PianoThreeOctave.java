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
 * This class plays songs on a three piano and 
 * also gives the user an opportunity to play 
 * the piano.
 * 
 * @author Helene Casanova
 * @version 1.0
 * @since 2016-04-13
 */

public class PianoThreeOctave extends Application{

	Pane p = new Pane();
	Scene scene = new Scene(p, 1400, 900);
	
	Rectangle[] rect = new Rectangle[22];
	Rectangle[] black = new Rectangle[20];
	Polygon[] bottomOne = new Polygon[22];
	Polygon sidePiano = new Polygon();

	int i;
	
	//initializing all the audio clips so they can be used all over the program
	AudioClip c1;
	AudioClip d1;
	AudioClip e1;
	AudioClip f1;
	AudioClip g1;
	AudioClip a1;
	AudioClip b1;
	
	AudioClip d;
	AudioClip eM;
	AudioClip f;
	AudioClip g;
	AudioClip a;
	AudioClip b;
	AudioClip cN;
	
	AudioClip c1H;
	AudioClip d1H;
	AudioClip e1H;
	AudioClip f1H;
	AudioClip g1H;
	AudioClip a1H;
	AudioClip b1H;
	AudioClip c1Hi;
	
	
	AudioClip cS0;
	AudioClip eS0;
	AudioClip fS0;
	AudioClip gS0;
	AudioClip aS0;
	
	AudioClip cS1;
	AudioClip dS1;
	AudioClip fS1;
	AudioClip gS1;
	AudioClip aS1;
	
	AudioClip cS2;
	AudioClip dS2;
	AudioClip fS2;
	AudioClip gS2;
	AudioClip aS2;
	
	
	String frereJacques = "CDEC CDEC EFG EFG GAGFEC GAGFEC CTC CTC FGAF FGAF ABC ABC CDCBAF CDCBAF FCF FCF";
	String cheerleader = "98E9988 E9B6AA98E99889 8B 9FEE9B889E9B88 9B6AA99888EE998 E9E 9B88 EE9988 9B6AA998 E8E9AB69A";
	String callMeMaybe = "UGGAAG FFEEDDU GGFFEED GGFFEED UUGGAAG FFEEDDU ";
	String drunkenSailor = "AAAAAADFAGGGGGGGCEGAAAAAAABCDCAGEDD";
	String whenTheSaintsGoMarching="CEFG CEFG CEFG ECED EEDC CEGGF EEFGECDC";
	String twinkle = "CDECYYUCY CCDEGDCCDEDC AABCBAGGGEDC ";
	String rudolphTheRedNose = "GAGEZAG GAGAGZB FGFDBAG GAGAGAE GAGEZAG GAGAGCB FGFDBAG GAGAGXZ AAZAGEG FAGFE DEGABBB ZZBAGFD GAEZGAG GAGAGZB FGFDBAG GAGAGXZ";
	String doYouWantToBuildASnowman = "77707GFG 7707GF 7707G9G7 79G7 7707G0 009G907 7FG7 7GF7FGC 77707GFG 777707GF7 7D7 77707GFG 777707GF 777707G9G7 77G9G7 7707G0 009G907 C7FG7 7GF7FGC 07GFG 777707GF 77770 FG9G777G9G7 7G70 009G907 C7FG77GF7FGC 77707GFG 777707GF7";
	
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
		
		//printing out the 3d method first just in case it overlaps anything else
		threeD();
		//the white keys get put next
		makeWhiteKeys();
		//the black keys get put on the top layer because they would have been hidden had i put the white keys first
		makeBlackKeys();
		hoverKey();
		pressWhiteKeys();
		pressBlackKeys();
		makeSettingsMenu(stage);
		
		p.setStyle("-fx-background-color: black;");
		scene.getStylesheets().add("file:src/stylesheet.css");
		
		stage.setScene(scene);
		stage.setTitle("Piano Simulator");
		stage.getIcons().add(new Image("file:src/PianoIcon.jpg"));
		stage.setResizable(false);
		stage.show();
		
		p.requestFocus();
	}

	/**
	 * This method adds the white keys to the pane.
	 * @param nothing
	 * @return void method
	 */

	public void makeWhiteKeys(){
		
		//Starts at x = 100 and it is incremented by 50 every time it goes through the for loop
		int x = 100;
		
		for(int i = 0; i < rect.length; i++){
			
			rect[i] = new Rectangle(50, 500);
			rect[i].setTranslateX(x);
			rect[i].setTranslateY(200);
			rect[i].setFill(Color.WHITE);
			rect[i].setStroke(Color.BLACK);
			
			x += 50;
			
			p.getChildren().add(rect[i]);
		}
		
	
	}

	
	/**
	 * This method adds the black keys to the pane.
	 * @param nothing
	 * @return void method
	 */
	public void makeBlackKeys(){
		
		//makes the black keys and and curves them 
		
		int x = 135;
		
		for(int i = 0; i < black.length; i++){
			
			black[i] = new Rectangle(30, 200);
			black[i].setTranslateX(x);
			black[i].setTranslateY(200);
			
			if(i == 2 || i == 6 || i == 9 || i == 13 || i == 16 || i == 20){
				black[i].setFill(Color.WHITE);
				x+=50;
			}
			
			else{
			x+=50;
			
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
		//This method fives the piano a three d effect
		
		//this is the piano on the side of the first key
		sidePiano = new Polygon();
		//sets the points for the polygon
		sidePiano.getPoints().addAll(new Double[]{
		        60.0 , 250.0, //top left corner
		        100.0, 200.0, //top right corner
		        100.0, 700.0, //bottom left corner
		        60.0, 760.0 }); //top right corner
		//fill the piano with the color white and set the stroke black
		sidePiano.setFill(Color.WHITE);
		sidePiano.setStroke(Color.BLACK);
		//add the side of the piano to the screen
		p.getChildren().add(sidePiano);
	
		
		int x = 0;
		for(int i = 0; i < bottomOne.length; i++){
			//this polygon is to give the piano a 3d effect on the bottom
			bottomOne[i] = new Polygon();
			bottomOne[i].setStroke(Color.BLACK);
			bottomOne[i].getPoints().addAll(new Double[]{
					60.0 + x,760.0, //We don't have to increment the y-values because we are staying on the bottom of the screen
					100.0 + x, 700.0,//so, we add 50 to the x-values because the white keys are 50 wide
					150.0 + x, 700.0,
					110.0 + x, 760.0});
			//increment the counter
				x+=50;
			bottomOne[i].setFill(Color.WHITE);
			//add the bottom to the screen
			p.getChildren().add(bottomOne[i]);
		}
	}

	/**
	 * This method sets the keys to red if you hover over them and
	 * back to white if you are not hovered 
	 * @param nothing
	 * @return void method
	 */
	public void hoverKey(){
		//This method changes color of the key to red if hovered over the white keys 
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
		
		rect[8].setOnMouseMoved(e ->{
			
			rect[8].setFill(Color.RED);
			bottomOne[8].setFill(Color.RED);
			
			
		});
		rect[8].setOnMouseExited(e ->{
			
			rect[8].setFill(Color.WHITE);
			bottomOne[8].setFill(Color.WHITE);
			
		});
	
		rect[9].setOnMouseMoved(e ->{
			
			rect[9].setFill(Color.RED);
			bottomOne[9].setFill(Color.RED);
			
			
		});
		rect[9].setOnMouseExited(e ->{
			
			rect[9].setFill(Color.WHITE);
			bottomOne[9].setFill(Color.WHITE);
		});
		
	rect[10].setOnMouseMoved(e ->{
			
			rect[10].setFill(Color.RED);
			bottomOne[10].setFill(Color.RED);
			
			
		});
		rect[10].setOnMouseExited(e ->{
			
			rect[10].setFill(Color.WHITE);
			bottomOne[10].setFill(Color.WHITE);
		});
		
		rect[11].setOnMouseMoved(e ->{
			
			rect[11].setFill(Color.RED);
			bottomOne[11].setFill(Color.RED);
			
			
		});
		rect[11].setOnMouseExited(e ->{
			
			rect[11].setFill(Color.WHITE);
			bottomOne[11].setFill(Color.WHITE);
			
		});
	
		rect[12].setOnMouseMoved(e ->{
			
			rect[12].setFill(Color.RED);
			bottomOne[12].setFill(Color.RED);
			
			
		});
		rect[12].setOnMouseExited(e ->{
			
			rect[12].setFill(Color.WHITE);
			bottomOne[12].setFill(Color.WHITE);
		});
		
		rect[13].setOnMouseMoved(e ->{
			
			rect[13].setFill(Color.RED);
			bottomOne[13].setFill(Color.RED);
			
			
		});
		rect[13].setOnMouseExited(e ->{
			
			rect[13].setFill(Color.WHITE);
			bottomOne[13].setFill(Color.WHITE);
		});
		
		rect[14].setOnMouseMoved(e ->{
			
			rect[14].setFill(Color.RED);
			bottomOne[14].setFill(Color.RED);
			
			
		});
		rect[14].setOnMouseExited(e ->{
			
			rect[14].setFill(Color.WHITE);
			bottomOne[14].setFill(Color.WHITE);
			
		});
	
		rect[15].setOnMouseMoved(e ->{
			
			rect[15].setFill(Color.RED);
			bottomOne[15].setFill(Color.RED);
			
			
		});
		rect[15].setOnMouseExited(e ->{
			
			rect[15].setFill(Color.WHITE);
			bottomOne[15].setFill(Color.WHITE);
		});
		
		rect[16].setOnMouseMoved(e ->{
			
			rect[16].setFill(Color.RED);
			bottomOne[16].setFill(Color.RED);
			
			
		});
		rect[16].setOnMouseExited(e ->{
			
			rect[16].setFill(Color.WHITE);
			bottomOne[16].setFill(Color.WHITE);
		});
		
		rect[17].setOnMouseMoved(e ->{
			
			rect[17].setFill(Color.RED);
			bottomOne[17].setFill(Color.RED);
			
			
		});
		rect[17].setOnMouseExited(e ->{
			
			rect[17].setFill(Color.WHITE);
			bottomOne[17].setFill(Color.WHITE);
			
		});
	
		rect[18].setOnMouseMoved(e ->{
			
			rect[18].setFill(Color.RED);
			bottomOne[18].setFill(Color.RED);
			
			
		});
		rect[18].setOnMouseExited(e ->{
			
			rect[18].setFill(Color.WHITE);
			bottomOne[18].setFill(Color.WHITE);
		});
		
		rect[19].setOnMouseMoved(e ->{
			
			rect[19].setFill(Color.RED);
			bottomOne[19].setFill(Color.RED);
			
			
		});
		rect[19].setOnMouseExited(e ->{
			
			rect[19].setFill(Color.WHITE);
			bottomOne[19].setFill(Color.WHITE);
		});
		
		rect[20].setOnMouseMoved(e ->{
			
			rect[20].setFill(Color.RED);
			bottomOne[20].setFill(Color.RED);
			
			
		});
		rect[20].setOnMouseExited(e ->{
			
			rect[20].setFill(Color.WHITE);
			bottomOne[20].setFill(Color.WHITE);
			
		});
	
		rect[21].setOnMouseMoved(e ->{
			
			rect[21].setFill(Color.RED);
			bottomOne[21].setFill(Color.RED);
			
			
		});
		rect[21].setOnMouseExited(e ->{
			
			rect[21].setFill(Color.WHITE);
			bottomOne[21].setFill(Color.WHITE);
		});
		
		
		
	}
	
	/**
	 * This method gives the white keys sound and a change in color if
	 * they are pressed 
	 * @param nothing
	 * @return void method
	 */
	
	public void pressWhiteKeys(){
		
		//This method gives the white keys sounds if pressed
		rect[0].setOnMousePressed(new EventHandler<MouseEvent>(){
			
			@Override
			public void handle(MouseEvent e) {
					//Handle if pressed so the color of the key sidePiano and bottom key turn red
					rect[0].setFill(Color.RED);
					bottomOne[0].setFill(Color.RED);
					sidePiano.setFill(Color.RED);
					//Set cN equal to the audio clip and give the path
					cN = new AudioClip("file:src/Sound/C1.wav");
					//set the volume because the original clip is loud
					cN.setVolume(.4);
					//play the clip of the key is pressed
					cN.play();
					//consume the event
					e.consume();
					
				}
		});
		
		//We have to reset the key to original state when the key is released 
		rect[0].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				//set the colors back to white
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
				
					d = new AudioClip("file:src/Sound/D1.wav");
					d.setVolume(.4);
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
					
					eM = new AudioClip("file:src/Sound/E1.wav");
					eM.setVolume(.4);
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
					
					f = new AudioClip("file:src/Sound/F1.wav");
					f.setVolume(.4);
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
					
					g = new AudioClip("file:src/Sound/G1.wav");
					g.setVolume(.4);
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
					
					a = new AudioClip("file:src/Sound/A1.wav");
					a.setVolume(.4);
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
					
					b = new AudioClip("file:src/Sound/B1.wav");
					b.setVolume(.4);
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
					
					c1 = new AudioClip("file:src/Sound/piano_middle_C.wav");
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
		rect[8].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[8].setFill(Color.RED);
					bottomOne[8].setFill(Color.RED);
				
					d1 = new AudioClip("file:src/Sound/piano_D.wav");
					d1.play();
					e.consume();
			}
		});
		
	
		rect[8].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[8].setFill(Color.WHITE);
				bottomOne[8].setFill(Color.WHITE);
				
				
			}
			
		});
		
		rect[9].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[9].setFill(Color.RED);
					bottomOne[9].setFill(Color.RED);
					
					e1 = new AudioClip("file:src/Sound/piano_E.wav");
					e1.play();
					e.consume();
			}
		});
		
	
		rect[9].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[9].setFill(Color.WHITE);
				bottomOne[9].setFill(Color.WHITE);
				
				
			}
			
		});
		
		rect[10].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[10].setFill(Color.RED);
					bottomOne[10].setFill(Color.RED);
					
					f1 = new AudioClip("file:src/Sound/piano_F.wav");
					f1.play();
					e.consume();
			}
		});
		
	
		rect[10].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[10].setFill(Color.WHITE);
				bottomOne[10].setFill(Color.WHITE);
				
				
			}
			
		});

		rect[11].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[11].setFill(Color.RED);
					bottomOne[11].setFill(Color.RED);
					
					g1 = new AudioClip("file:src/Sound/piano_G.wav");
					g1.play();
					e.consume();
			}
		});
		
	
		rect[11].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[11].setFill(Color.WHITE);
				bottomOne[11].setFill(Color.WHITE);
				
				
			}
			
		});
		
		rect[12].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[12].setFill(Color.RED);
					bottomOne[12].setFill(Color.RED);
					a1 = new AudioClip("file:src/Sound/piano_A.wav");
					a1.play();
					e.consume();
			}
		});
		
	
		rect[12].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[12].setFill(Color.WHITE);
				bottomOne[12].setFill(Color.WHITE);
				
				
			}
			
		});
		rect[13].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[13].setFill(Color.RED);
					bottomOne[13].setFill(Color.RED);
					
					b1 = new AudioClip("file:src/Sound/piano_B.wav");
					b1.play();
					e.consume();
			}
		});
		
	
		rect[13].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[13].setFill(Color.WHITE);
				bottomOne[13].setFill(Color.WHITE);
				
				
			}
			
		});

		rect[14].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[14].setFill(Color.RED);
					bottomOne[14].setFill(Color.RED);
					
					c1H = new AudioClip("file:src/Sound/68440__pinkyfinger__piano-c.wav");
					c1H.play();
					e.consume();
			}
		});
		
	
		rect[14].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[14].setFill(Color.WHITE);
				bottomOne[14].setFill(Color.WHITE);
				
				
			}
			
		});
		
		rect[15].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[15].setFill(Color.RED);
					bottomOne[15].setFill(Color.RED);
					
					d1H = new AudioClip("file:src/Sound/68442__pinkyfinger__piano-d.wav");
					d1H.play();
					e.consume();
			}
		});
		
	
		rect[15].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[15].setFill(Color.WHITE);
				bottomOne[15].setFill(Color.WHITE);
				
				
			}
			
		});

		rect[16].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[16].setFill(Color.RED);
					bottomOne[16].setFill(Color.RED);
					
					e1H = new AudioClip("file:src/Sound/68443__pinkyfinger__piano-e.wav");
					e1H.play();
					e.consume();
			}
		});
		
	
		rect[16].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[16].setFill(Color.WHITE);
				bottomOne[16].setFill(Color.WHITE);
				
				
			}
			
		});
		
		rect[17].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[17].setFill(Color.RED);
					bottomOne[17].setFill(Color.RED);
					
					f1H = new AudioClip("file:src/Sound/68445__pinkyfinger__piano-f.wav");
					f1H.play();
					e.consume();
			}
		});
		
	
		rect[17].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[17].setFill(Color.WHITE);
				bottomOne[17].setFill(Color.WHITE);
				
				
			}
			
		});
		rect[18].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[18].setFill(Color.RED);
					bottomOne[18].setFill(Color.RED);
					
					g1H = new AudioClip("file:src/Sound/68448__pinkyfinger__piano-g.wav");
					g1H.play();
					e.consume();
			}
		});
		
	
		rect[18].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[18].setFill(Color.WHITE);
				bottomOne[18].setFill(Color.WHITE);
				
				
			}
			
		});

		rect[19].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[19].setFill(Color.RED);
					bottomOne[19].setFill(Color.RED);
					
					a1H = new AudioClip("file:src/Sound/A_High.wav");
					a1H.setVolume(.2);
					a1H.play();
					e.consume();
			}
		});
		
	
		rect[19].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[19].setFill(Color.WHITE);
				bottomOne[19].setFill(Color.WHITE);
				
				
			}
			
		});

		rect[20].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[20].setFill(Color.RED);
					bottomOne[20].setFill(Color.RED);
		
					b1H = new AudioClip("file:src/Sound/B_High.wav");
					b1H.setVolume(.2);
					b1H.play();
					e.consume();
			}
		});
		
	
		rect[20].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[20].setFill(Color.WHITE);
				bottomOne[20].setFill(Color.WHITE);
				
				
			}
			
		});

		rect[21].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					rect[21].setFill(Color.RED);
					bottomOne[21].setFill(Color.RED);
					
					c1Hi = new AudioClip("file:src/Sound/C_Last.wav");
					c1Hi.setVolume(.2);
					c1Hi.play();
					e.consume();
			}
		});
		
	
		rect[21].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				rect[21].setFill(Color.WHITE);
				bottomOne[21].setFill(Color.WHITE);
				
				
			}
			
		});




	}
	
	/**
	 * This method makes the menu on the side of the screen
	 * @param nothing
	 * @return void method
	 */
	
	public void makeSettingsMenu(Stage stage){
		
		//The first box is Settings
		ComboBox<String> Settings = new ComboBox<String>();
		//add the subtopics of help and exit
		Settings.getItems().addAll("Help", "Exit");
		//Set the original value of settings
		Settings.setValue("Settings");
		
		//style the box
		Settings.setStyle("-fx-font-family: '2Dumb'; -fx-font-size: 20px; -fx-text-fill: #E5DFC5");
		//set the boxes x and y coordinates
		Settings.setTranslateX(1230);
		Settings.setTranslateY(50);
		
		//The technical first box is the home button
		ComboBox<String> Home = new ComboBox<String>();
		//the only sub topic of this box is going back to the start screen class
		Home.getItems().add("Go Home");
		//setting the original value of the home button
		Home.setValue("Home");
		//styling the box
		Home.setStyle("-fx-font-family: '2Dumb'; -fx-font-size: 20px; -fx-text-fill: #E5DFC5");
		Home.setTranslateX(1230);
		
		//The next box is the music box
		ComboBox<String> Music = new ComboBox<String>();
		//Here the two subtopics are sheet music(where you can get the actual pieces) 
		//or get the notes if you can't read music
		Music.getItems().addAll("Sheet Music");
		//settings the value of music
		Music.setValue("Music");
		Music.setStyle("-fx-font-family: '2Dumb'; -fx-font-size: 20px; -fx-text-fill: #E5DFC5");
		Music.setTranslateX(1230);
		Music.setTranslateY(100);
		
		//making this to go to the start screen later on
		StartScreen ss = new StartScreen();
		
		//This box contains the songs the piano can play by itself
		ComboBox<String> Songs = new ComboBox<String>();
		//The subtopic include the various songs the piano can play
		Songs.getItems().addAll("Twinkle", "Cheerleader", "Frere Jacques","When the Saints go Marching In","Drunken Sailor","FUN Song","Rudolph the Red Nose Reindeer", "Drunken Sailor", "Do you want to build a snowman");
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
		
		//Setting the actions of the home box
		Home.setOnAction(e ->{
			//.getValue returns a string value or the value i added up there
			if(Home.getValue() == "Go Home"){
			try {
				//goes back to the start screen
				ss.start(stage);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			}
		});
		
		//setting the actions of the settings box
		Settings.setOnAction(e ->{
			Stage stageTwo = new Stage();
			//the help box gives the user instructions and other tips for using this
			if(Settings.getValue() == "Help"){
				
				HelpPopUp h = new HelpPopUp();
				try {
					h.start(stageTwo);
					
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
			//an alternate way to exit the application
			if(Settings.getValue() == "Exit"){
				stage.close();
			}
		});
		
		//setting the actions of the songs tab
		Songs.setOnAction(e ->{
			if(Songs.getValue() == "Frere Jacques"){
				
				Text t = new Text("Frere Jacques");
				t.setFont(new Font("2Dumb", 30));
				t.setFill(Color.WHITE);
				TextFlow tf = new TextFlow(t);
				
				p.getChildren().add(tf);
				if(i == frereJacques.length()-1){
					p.getChildren().remove(tf);
				}	
				Animate ani = new Animate(frereJacques, rect, black, sidePiano, p, tf);
				
				//This huge if-else block gets the first letter of the song and call the class animate which animates
				//the rest of the song
				if(frereJacques.charAt(i) == 'C'){
					ani.playC();
				}
				else if(frereJacques.charAt(i) == 'D'){
					ani.playD();
				}
				else if(frereJacques.charAt(i) == 'E'){
					ani.playE();
				}
				else if(frereJacques.charAt(i) == 'F'){
					ani.playF();
				}
				else if(frereJacques.charAt(i) == 'G'){
					ani.playG();
				}
				else if(frereJacques.charAt(i) == 'A'){
					ani.playA();
				}
				else if(frereJacques.charAt(i) == 'B'){
					ani.playB();
				}
				else if(frereJacques.charAt(i) == 'Q'){
					ani.playC0();
				}
				else if(frereJacques.charAt(i) == 'W'){
					ani.playD0();
				}
				else if(frereJacques.charAt(i) == 'I'){
					ani.playE0();
				}
				else if(frereJacques.charAt(i) == 'R'){
					ani.playF0();
				}
				else if(frereJacques.charAt(i) == 'T'){
					ani.playG0();
				}
				else if(frereJacques.charAt(i) == 'Y'){
					ani.playA0();
				}
				else if(frereJacques.charAt(i) == 'U'){
					ani.playB0();
				}
				else if(frereJacques.charAt(i) == 'Z'){
					ani.playC1();
				}
				else if(frereJacques.charAt(i) == 'X'){
					ani.playD1();
				}
				else if(frereJacques.charAt(i) == '.'){
					ani.playE1();
				}
				else if(frereJacques.charAt(i) == 'V'){
					ani.playF1();
				}
				else if(frereJacques.charAt(i) == 'L'){
					ani.playG1();
				}
				else if(frereJacques.charAt(i) == 'N'){
					ani.playA1();
				}
				else if(frereJacques.charAt(i) == 'M'){
					ani.playB1();
				}
				else if(frereJacques.charAt(i) == '1'){
					ani.playCS0();
				}
				else if(frereJacques.charAt(i) == '2'){
					ani.playES0();
				}
				else if(frereJacques.charAt(i) == '3'){
					ani.playFS0();
				}
				else if(frereJacques.charAt(i) == '4'){
					ani.playGS0();
				}
				else if(frereJacques.charAt(i) == '5'){
					ani.playAS0();
				}
				else if(frereJacques.charAt(i) == '6'){
					ani.playCS();
				}
				else if(frereJacques.charAt(i) == '7'){
					ani.playES();
				}
				else if(frereJacques.charAt(i) == '8'){
					ani.playFS();
				}
				else if(frereJacques.charAt(i) == '9'){
					ani.playGS();
				}
				else if(frereJacques.charAt(i) == '0'){
					ani.playAS();
				}
				else if(frereJacques.charAt(i) == '['){
					ani.playCS1();
				}
				else if(frereJacques.charAt(i) == ']'){
					ani.playES1();
				}
				else if(frereJacques.charAt(i) == '/'){
					ani.playFS1();
				}
				else if(frereJacques.charAt(i) == '='){
					ani.playGS1();
				}
				else if(frereJacques.charAt(i) == ','){
					ani.playAS1();
				}
				else{
					ani.playSpace();
				}
				
				
			}
			if(Songs.getValue() == "Cheerleader"){
				
				Text t = new Text("Cheerleader");
				t.setFont(new Font("2Dumb", 30));
				t.setFill(Color.WHITE);
				TextFlow tf = new TextFlow(t);
				
				
				Animate ani = new Animate(cheerleader, rect, black, sidePiano, p, tf);
				
				//This huge if-else block gets the first letter of the song and call the class animate which animates
				//the rest of the song
				if(cheerleader.charAt(i) == 'C'){
					ani.playC();
				}
				else if(cheerleader.charAt(i) == 'D'){
					ani.playD();
				}
				else if(cheerleader.charAt(i) == 'E'){
					ani.playE();
				}
				else if(cheerleader.charAt(i) == 'F'){
					ani.playF();
				}
				else if(cheerleader.charAt(i) == 'G'){
					ani.playG();
				}
				else if(cheerleader.charAt(i) == 'A'){
					ani.playA();
				}
				else if(cheerleader.charAt(i) == 'B'){
					ani.playB();
				}
				else if(cheerleader.charAt(i) == 'Q'){
					ani.playC0();
				}
				else if(cheerleader.charAt(i) == 'W'){
					ani.playD0();
				}
				else if(cheerleader.charAt(i) == 'I'){
					ani.playE0();
				}
				else if(cheerleader.charAt(i) == 'R'){
					ani.playF0();
				}
				else if(cheerleader.charAt(i) == 'T'){
					ani.playG0();
				}
				else if(cheerleader.charAt(i) == 'Y'){
					ani.playA0();
				}
				else if(cheerleader.charAt(i) == 'U'){
					ani.playB0();
				}
				else if(cheerleader.charAt(i) == 'Z'){
					ani.playC1();
				}
				else if(cheerleader.charAt(i) == 'X'){
					ani.playD1();
				}
				else if(cheerleader.charAt(i) == '.'){
					ani.playE1();
				}
				else if(cheerleader.charAt(i) == 'V'){
					ani.playF1();
				}
				else if(cheerleader.charAt(i) == 'L'){
					ani.playG1();
				}
				else if(cheerleader.charAt(i) == 'N'){
					ani.playA1();
				}
				else if(cheerleader.charAt(i) == 'M'){
					ani.playB1();
				}
				else if(cheerleader.charAt(i) == '1'){
					ani.playCS0();
				}
				else if(cheerleader.charAt(i) == '2'){
					ani.playES0();
				}
				else if(cheerleader.charAt(i) == '3'){
					ani.playFS0();
				}
				else if(cheerleader.charAt(i) == '4'){
					ani.playGS0();
				}
				else if(cheerleader.charAt(i) == '5'){
					ani.playAS0();
				}
				else if(cheerleader.charAt(i) == '6'){
					ani.playCS();
				}
				else if(cheerleader.charAt(i) == '7'){
					ani.playES();
				}
				else if(cheerleader.charAt(i) == '8'){
					ani.playFS();
				}
				else if(cheerleader.charAt(i) == '9'){
					ani.playGS();
				}
				else if(cheerleader.charAt(i) == '0'){
					ani.playAS();
				}
				else if(cheerleader.charAt(i) == '['){
					ani.playCS1();
				}
				else if(cheerleader.charAt(i) == ']'){
					ani.playES1();
				}
				else if(cheerleader.charAt(i) == '/'){
					ani.playFS1();
				}
				else if(cheerleader.charAt(i) == '='){
					ani.playGS1();
				}
				else if(cheerleader.charAt(i) == ','){
					ani.playAS1();
				}
				else{
					ani.playSpace();
				}
				
				
			}
			if(Songs.getValue() == "When the Saints go Marching In"){
				Text t = new Text("When the Saints go Marching In");
				t.setFont(new Font("2Dumb", 30));
				t.setFill(Color.WHITE);
				TextFlow tf = new TextFlow(t);
				
				p.getChildren().add(tf);
				Animate ani = new Animate(whenTheSaintsGoMarching, rect, black, sidePiano, p, tf);
				
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
				else if(whenTheSaintsGoMarching.charAt(i) == 'Q'){
					ani.playC0();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'W'){
					ani.playD0();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'I'){
					ani.playE0();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'R'){
					ani.playF0();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'T'){
					ani.playG0();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'Y'){
					ani.playA0();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'U'){
					ani.playB0();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'Z'){
					ani.playC1();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'X'){
					ani.playD1();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '.'){
					ani.playE1();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'V'){
					ani.playF1();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'L'){
					ani.playG1();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'N'){
					ani.playA1();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == 'M'){
					ani.playB1();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '1'){
					ani.playCS0();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '2'){
					ani.playES0();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '3'){
					ani.playFS0();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '4'){
					ani.playGS0();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '5'){
					ani.playAS0();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '6'){
					ani.playCS();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '7'){
					ani.playES();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '8'){
					ani.playFS();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '9'){
					ani.playGS();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '0'){
					ani.playAS();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '['){
					ani.playCS1();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == ']'){
					ani.playES1();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '/'){
					ani.playFS1();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == '='){
					ani.playGS1();
				}
				else if(whenTheSaintsGoMarching.charAt(i) == ','){
					ani.playAS1();
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
				
				Animate ani = new Animate(drunkenSailor, rect, black, sidePiano, p, tf);
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
				else if(drunkenSailor.charAt(i) == 'Q'){
					ani.playC0();
				}
				else if(drunkenSailor.charAt(i) == 'W'){
					ani.playD0();
				}
				else if(drunkenSailor.charAt(i) == 'I'){
					ani.playE0();
				}
				else if(drunkenSailor.charAt(i) == 'R'){
					ani.playF0();
				}
				else if(drunkenSailor.charAt(i) == 'T'){
					ani.playG0();
				}
				else if(drunkenSailor.charAt(i) == 'Y'){
					ani.playA0();
				}
				else if(drunkenSailor.charAt(i) == 'U'){
					ani.playB0();
				}
				else if(drunkenSailor.charAt(i) == 'Z'){
					ani.playC1();
				}
				else if(drunkenSailor.charAt(i) == 'X'){
					ani.playD1();
				}
				else if(drunkenSailor.charAt(i) == '.'){
					ani.playE1();
				}
				else if(drunkenSailor.charAt(i) == 'V'){
					ani.playF1();
				}
				else if(drunkenSailor.charAt(i) == 'L'){
					ani.playG1();
				}
				else if(drunkenSailor.charAt(i) == 'N'){
					ani.playA1();
				}
				else if(drunkenSailor.charAt(i) == 'M'){
					ani.playB1();
				}
				else if(drunkenSailor.charAt(i) == '1'){
					ani.playCS0();
				}
				else if(drunkenSailor.charAt(i) == '2'){
					ani.playES0();
				}
				else if(drunkenSailor.charAt(i) == '3'){
					ani.playFS0();
				}
				else if(drunkenSailor.charAt(i) == '4'){
					ani.playGS0();
				}
				else if(drunkenSailor.charAt(i) == '5'){
					ani.playAS0();
				}
				else if(drunkenSailor.charAt(i) == '6'){
					ani.playCS();
				}
				else if(drunkenSailor.charAt(i) == '7'){
					ani.playES();
				}
				else if(drunkenSailor.charAt(i) == '8'){
					ani.playFS();
				}
				else if(drunkenSailor.charAt(i) == '9'){
					ani.playGS();
				}
				else if(drunkenSailor.charAt(i) == '0'){
					ani.playAS();
				}
				else if(drunkenSailor.charAt(i) == '['){
					ani.playCS1();
				}
				else if(drunkenSailor.charAt(i) == ']'){
					ani.playES1();
				}
				else if(drunkenSailor.charAt(i) == '/'){
					ani.playFS1();
				}
				else if(drunkenSailor.charAt(i) == '='){
					ani.playGS1();
				}
				else if(drunkenSailor.charAt(i) == ','){
					ani.playAS1();
				}
				else{
					ani.playSpace();
				}
			}
			if(Songs.getValue() == "Rudolph the Red Nose Reindeer"){
				Text t = new Text("Rudolph the Red Nose Reindeer");
				t.setFont(new Font("2Dumb", 30));
				t.setFill(Color.WHITE);
				TextFlow tf = new TextFlow(t);
				
				p.getChildren().add(tf);
				
				Animate ani = new Animate(rudolphTheRedNose, rect, black, sidePiano, p, tf);
				//This huge if-else block gets the first letter of the song and call the class animate which animates
				//the rest of the song
				if(rudolphTheRedNose.charAt(i) == 'C'){
					ani.playC();
				}
				else if(rudolphTheRedNose.charAt(i) == 'D'){
					ani.playD();
				}
				else if(rudolphTheRedNose.charAt(i) == 'E'){
					ani.playE();
				}
				else if(rudolphTheRedNose.charAt(i) == 'F'){
					ani.playF();
				}
				else if(rudolphTheRedNose.charAt(i) == 'G'){
					ani.playG();
				}
				else if(rudolphTheRedNose.charAt(i) == 'A'){
					ani.playA();
				}
				else if(rudolphTheRedNose.charAt(i) == 'B'){
					ani.playB();
				}
				else if(rudolphTheRedNose.charAt(i) == 'Q'){
					ani.playC0();
				}
				else if(rudolphTheRedNose.charAt(i) == 'W'){
					ani.playD0();
				}
				else if(rudolphTheRedNose.charAt(i) == 'I'){
					ani.playE0();
				}
				else if(rudolphTheRedNose.charAt(i) == 'R'){
					ani.playF0();
				}
				else if(rudolphTheRedNose.charAt(i) == 'T'){
					ani.playG0();
				}
				else if(rudolphTheRedNose.charAt(i) == 'Y'){
					ani.playA0();
				}
				else if(rudolphTheRedNose.charAt(i) == 'U'){
					ani.playB0();
				}
				else if(rudolphTheRedNose.charAt(i) == 'Z'){
					ani.playC1();
				}
				else if(rudolphTheRedNose.charAt(i) == 'X'){
					ani.playD1();
				}
				else if(rudolphTheRedNose.charAt(i) == '.'){
					ani.playE1();
				}
				else if(rudolphTheRedNose.charAt(i) == 'V'){
					ani.playF1();
				}
				else if(rudolphTheRedNose.charAt(i) == 'L'){
					ani.playG1();
				}
				else if(rudolphTheRedNose.charAt(i) == 'N'){
					ani.playA1();
				}
				else if(rudolphTheRedNose.charAt(i) == 'M'){
					ani.playB1();
				}
				else if(rudolphTheRedNose.charAt(i) == '1'){
					ani.playCS0();
				}
				else if(rudolphTheRedNose.charAt(i) == '2'){
					ani.playES0();
				}
				else if(rudolphTheRedNose.charAt(i) == '3'){
					ani.playFS0();
				}
				else if(rudolphTheRedNose.charAt(i) == '4'){
					ani.playGS0();
				}
				else if(rudolphTheRedNose.charAt(i) == '5'){
					ani.playAS0();
				}
				else if(rudolphTheRedNose.charAt(i) == '6'){
					ani.playCS();
				}
				else if(rudolphTheRedNose.charAt(i) == '7'){
					ani.playES();
				}
				else if(rudolphTheRedNose.charAt(i) == '8'){
					ani.playFS();
				}
				else if(rudolphTheRedNose.charAt(i) == '9'){
					ani.playGS();
				}
				else if(rudolphTheRedNose.charAt(i) == '0'){
					ani.playAS();
				}
				else if(rudolphTheRedNose.charAt(i) == '['){
					ani.playCS1();
				}
				else if(rudolphTheRedNose.charAt(i) == ']'){
					ani.playES1();
				}
				else if(rudolphTheRedNose.charAt(i) == '/'){
					ani.playFS1();
				}
				else if(rudolphTheRedNose.charAt(i) == '='){
					ani.playGS1();
				}
				else if(rudolphTheRedNose.charAt(i) == ','){
					ani.playAS1();
				}
				else{
					ani.playSpace();
				}
			}
			if(Songs.getValue() == "Do you want to build a snowman"){
				Text t = new Text("Do you want to build a snowman");
				t.setFont(new Font("2Dumb", 30));
				t.setFill(Color.WHITE);
				TextFlow tf = new TextFlow(t);
				
				Animate ani = new Animate(doYouWantToBuildASnowman, rect, black, sidePiano, p, tf);
				p.getChildren().add(tf);
				
				//This huge if-else block gets the first letter of the song and call the class animate which animates
				//the rest of the song
				if(doYouWantToBuildASnowman.charAt(i) == 'C'){
					ani.playC();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'D'){
					ani.playD();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'E'){
					ani.playE();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'F'){
					ani.playF();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'G'){
					ani.playG();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'A'){
					ani.playA();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'B'){
					ani.playB();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'Q'){
					ani.playC0();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'W'){
					ani.playD0();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'I'){
					ani.playE0();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'R'){
					ani.playF0();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'T'){
					ani.playG0();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'Y'){
					ani.playA0();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'U'){
					ani.playB0();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'Z'){
					ani.playC1();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'X'){
					ani.playD1();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '.'){
					ani.playE1();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'V'){
					ani.playF1();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'L'){
					ani.playG1();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'N'){
					ani.playA1();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == 'M'){
					ani.playB1();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '1'){
					ani.playCS0();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '2'){
					ani.playES0();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '3'){
					ani.playFS0();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '4'){
					ani.playGS0();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '5'){
					ani.playAS0();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '6'){
					ani.playCS();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '7'){
					ani.playES();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '8'){
					ani.playFS();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '9'){
					ani.playGS();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '0'){
					ani.playAS();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '['){
					ani.playCS1();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == ']'){
					ani.playES1();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '/'){
					ani.playFS1();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == '='){
					ani.playGS1();
				}
				else if(doYouWantToBuildASnowman.charAt(i) == ','){
					ani.playAS1();
				}
				else{
					ani.playSpace();
				}
			}
			if(Songs.getValue() == "Twinkle"){
				Text t = new Text("Twinkle");
				t.setFont(new Font("2Dumb", 30));
				t.setFill(Color.WHITE);
				TextFlow tf = new TextFlow(t);
				
				
				//Animate ani = new Animate(twinkle, rect, sidePiano);
				Animate ani = new Animate(callMeMaybe, rect, black, sidePiano, p, tf);
				p.getChildren().add(tf);
				//This huge if-else block gets the first letter of the song and call the class animate which animates
				//the rest of the song
				if(twinkle.charAt(i) == 'C'){
					ani.playC();
				}
				else if(twinkle.charAt(i) == 'D'){
					ani.playD();
				}
				else if(twinkle.charAt(i) == 'E'){
					ani.playE();
				}
				else if(twinkle.charAt(i) == 'F'){
					ani.playF();
				}
				else if(twinkle.charAt(i) == 'G'){
					ani.playG();
				}
				else if(twinkle.charAt(i) == 'A'){
					ani.playA();
				}
				else if(twinkle.charAt(i) == 'B'){
					ani.playB();
				}
				else if(twinkle.charAt(i) == 'Q'){
					ani.playC0();
				}
				else if(twinkle.charAt(i) == 'W'){
					ani.playD0();
				}
				else if(twinkle.charAt(i) == 'I'){
					ani.playE0();
				}
				else if(twinkle.charAt(i) == 'R'){
					ani.playF0();
				}
				else if(twinkle.charAt(i) == 'T'){
					ani.playG0();
				}
				else if(twinkle.charAt(i) == 'Y'){
					ani.playA0();
				}
				else if(twinkle.charAt(i) == 'U'){
					ani.playB0();
				}
				else if(twinkle.charAt(i) == 'Z'){
					ani.playC1();
				}
				else if(twinkle.charAt(i) == 'X'){
					ani.playD1();
				}
				else if(twinkle.charAt(i) == '.'){
					ani.playE1();
				}
				else if(twinkle.charAt(i) == 'V'){
					ani.playF1();
				}
				else if(twinkle.charAt(i) == 'L'){
					ani.playG1();
				}
				else if(twinkle.charAt(i) == 'N'){
					ani.playA1();
				}
				else if(twinkle.charAt(i) == 'M'){
					ani.playB1();
				}
				else if(twinkle.charAt(i) == '1'){
					ani.playCS0();
				}
				else if(twinkle.charAt(i) == '2'){
					ani.playES0();
				}
				else if(twinkle.charAt(i) == '3'){
					ani.playFS0();
				}
				else if(twinkle.charAt(i) == '4'){
					ani.playGS0();
				}
				else if(twinkle.charAt(i) == '5'){
					ani.playAS0();
				}
				else if(twinkle.charAt(i) == '6'){
					ani.playCS();
				}
				else if(twinkle.charAt(i) == '7'){
					ani.playES();
				}
				else if(twinkle.charAt(i) == '8'){
					ani.playFS();
				}
				else if(twinkle.charAt(i) == '9'){
					ani.playGS();
				}
				else if(twinkle.charAt(i) == '0'){
					ani.playAS();
				}
				else if(twinkle.charAt(i) == '['){
					ani.playCS1();
				}
				else if(twinkle.charAt(i) == ']'){
					ani.playES1();
				}
				else if(twinkle.charAt(i) == '/'){
					ani.playFS1();
				}
				else if(twinkle.charAt(i) == '='){
					ani.playGS1();
				}
				else if(twinkle.charAt(i) == ','){
					ani.playAS1();
				}
				else{
					ani.playSpace();
				}
					//i++;
			
			}
			
		});
		//adding all the boxes to the sreen
		p.getChildren().addAll(Settings, Home, Music, Songs);
		
		
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
					
					cS0 = new AudioClip("file:src/Sound/cl.wav");
					cS0.play();
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
					
					
					eS0 = new AudioClip("file:src/Sound/el.wav");
					eS0.play();
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
					
					fS0 = new AudioClip("file:src/Sound/fl.wav");
					fS0.play();
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
					
					gS0 = new AudioClip("file:src/Sound/gl.wav");
					gS0.play();
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
					
					aS0 = new AudioClip("file:src/Sound/bl.wav");
					aS0.play();
					e.consume();
			}
		});
		
	
		black[5].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[5].setFill(Color.BLACK);
				
				
				
			}
			
		});
	 
		black[7].setOnMousePressed(new EventHandler<MouseEvent>(){
			
			@Override
			public void handle(MouseEvent e) {
					black[7].setFill(Color.RED);
					
					cS1 = new AudioClip("file:src/Sound/piano_C_sharp.wav");
					cS1.play();
					e.consume();
					
				}
		});
		
	
		black[7].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[7].setFill(Color.BLACK);
				
			}
			
		});
		
		
		black[8].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					black[8].setFill(Color.RED);
					
					
					dS1 = new AudioClip("file:src/Sound/piano_D_sharp.wav");
					dS1.play();
					e.consume();
			}
		});
		
	
		black[8].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[8].setFill(Color.BLACK);
				
			}
			
		});
		
		
		black[10].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					black[10].setFill(Color.RED);
					
					fS1 = new AudioClip("file:src/Sound/piano_F_sharp.wav");
					fS1.play();
					e.consume();
			}
		});
		
	
		black[10].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[10].setFill(Color.BLACK);
				
			}
			
		});
		
		black[11].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					black[11].setFill(Color.RED);
					
					gS1 = new AudioClip("file:src/Sound/piano_G_sharp.wav");
					gS1.play();
					e.consume();
			}
		});
		
	
		black[11].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[11].setFill(Color.BLACK);
				
				
				
			}
			
		});
		
		black[12].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					black[12].setFill(Color.RED);
					
					aS1 = new AudioClip("file:src/Sound/piano_A_sharp.wav");
					aS1.play();
					e.consume();
			}
		});
		
	
		black[12].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[12].setFill(Color.BLACK);		
			}
			
		});
		
		black[14].setOnMousePressed(new EventHandler<MouseEvent>(){
			
			@Override
			public void handle(MouseEvent e) {
					black[14].setFill(Color.RED);
					
					cS2 = new AudioClip("file:src/Sound/68441__pinkyfinger__piano-c.wav");
					cS2.play();
					e.consume();
					
				}
		});
		
	
		black[14].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[14].setFill(Color.BLACK);
				
			}
			
		});
		
		
		black[15].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					black[15].setFill(Color.RED);
					
					
					dS2 = new AudioClip("file:src/Sound/68444__pinkyfinger__piano-eb.wav");
					dS2.play();
					e.consume();
			}
		});
		
	
		black[15].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[15].setFill(Color.BLACK);
				
			}
			
		});
		
		
		black[17].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					black[17].setFill(Color.RED);
					
					fS2 = new AudioClip("file:src/Sound/68446__pinkyfinger__piano-f.wav");
					fS2.play();
					e.consume();
			}
		});
		
	
		black[17].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[17].setFill(Color.BLACK);
				
			}
			
		});
		
		black[18].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					black[18].setFill(Color.RED);
					
					gS2 = new AudioClip("file:src/Sound/68448__pinkyfinger__piano-g.wav");
					gS2.play();
					e.consume();
			}
		});
		
	
		black[18].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[18].setFill(Color.BLACK);
				
				
				
			}
			
		});
		
		black[19].setOnMousePressed(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				
					black[19].setFill(Color.RED);
					
					aS2 = new AudioClip("file:src/Sound/68439__pinkyfinger__piano-bb.wav");
					aS2.play();
					e.consume();
			}
		});
		
	
		black[19].setOnMouseReleased(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				
				black[19].setFill(Color.BLACK);		
			}
			
		});
	}
	
	
	public static void main(String[] args){
		Application.launch();
	}
	
}


