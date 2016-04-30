import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextFlow;
import javafx.util.Duration;

/**
 * This class gives the piano animation so it play
 * a song on its own.
 * @author Helene Casanova
 * @version 1.0
 * @since 2016-04-13
 */

public class Animate{
	
	private String songName;
	int i = 0;
	Rectangle[] rect;
	Polygon sidePiano;
	Rectangle[] black;
	Pane pane = new Pane();
	TextFlow tf = new TextFlow();
	
	AudioClip b1;
	AudioClip d;
	AudioClip eM;
	AudioClip f;
	AudioClip g;
	AudioClip a;
	AudioClip b;
	AudioClip cN;
	
	/**
	 * This constructor gets all the values we need from the other class
	 * to animate the piano.
	 * @param s The String containing the letters the song
	 * @param r The white keys
	 * @param b The black Keys
	 * @param p The sidePiano
	 * @param pa The pane to add and delete text off of the screen
	 * @param t The name of the song
	 */
	public Animate (String s, Rectangle[] r, Rectangle[] b, Polygon p, Pane pa, TextFlow t){
		
		songName = s;
		sidePiano = p;
		rect = r;
		black = b;
		pane = pa;
		tf = t;
	}
	
	//First seven notes
	public void playC0(){
		//using fill transition to fill the rectangle
		 FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
		 ft.setCycleCount(1);
		 //set the cycle count to 1
		 //getting the audio clip
		 cN = new AudioClip("file:src/Sound/C1.wav");
		 ParallelTransition st = new ParallelTransition(rect[0], ft);
		 //using the parallel transition to play sound and color at the same time
		 cN.play();
		 //start the animation
		 st.play();
		
		 if(i == songName.length()-1){
			 pane.getChildren().remove(tf);
		 }
		 
		 //using set on finished to get to the next sound and then updating i to get to the next letter
		 st.setOnFinished(e->{
			 rect[0].setFill(Color.WHITE);

			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
		 
		 
		}
	public void playD0(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 d = new AudioClip("file:src/Sound/D1.wav");
			 ParallelTransition st = new ParallelTransition(rect[1], ft);
			 d.play();
			 
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[1].setFill(Color.WHITE);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playE0(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 eM = new AudioClip("file:src/Sound/E1.wav");
			 ParallelTransition st = new ParallelTransition(rect[2], ft);
			 eM.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[2].setFill(Color.WHITE);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playF0(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 f = new AudioClip("file:src/Sound/F1.wav");
			 ParallelTransition st = new ParallelTransition(rect[3], ft);
			 f.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[3].setFill(Color.WHITE);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playG0(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 g = new AudioClip("file:src/Sound/G1.wav");
			 ParallelTransition st = new ParallelTransition(rect[4], ft);
			 g.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[4].setFill(Color.WHITE);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playA0(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 a = new AudioClip("file:src/Sound/A1.wav");
			 ParallelTransition st = new ParallelTransition(rect[5], ft);
			 a.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[5].setFill(Color.WHITE);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playB0(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 b1 = new AudioClip("file:src/Sound/B1.wav");
			 ParallelTransition st = new ParallelTransition(rect[6], ft);
			 b1.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[6].setFill(Color.WHITE);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	
	//middle octave	
	public void playC(){
		
	 FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
	 ft.setCycleCount(1);
	 
	 cN = new AudioClip("file:src/Sound/piano_middle_C.wav");
	 ParallelTransition st = new ParallelTransition(rect[7], ft);
	 cN.play();
	 
	 st.play();
	 
	 if(i == songName.length()-1){
		 pane.getChildren().remove(tf);
	 }
	 
	 st.setOnFinished(e->{
		 rect[7].setFill(Color.WHITE);
		 if(songName.charAt(i) == 'C'){
			 i++;	
			 playC();
				
			}
			else if(songName.charAt(i) == 'D'){
				i++;
				playD();
			}
			else if(songName.charAt(i) == 'E'){
				i++;
				playE();
			}
			else if(songName.charAt(i) == 'F'){
				i++;
				playF();
			}
			else if(songName.charAt(i) == 'G'){
				i++;
				playG();
			}
			else if(songName.charAt(i) == 'A'){
				i++;
				playA();
			}
			else if(songName.charAt(i) == 'B'){
				i++;
				playB();
			}else if(songName.charAt(i) == 'Q'){
				i++;
				playC0();
			}
			else if(songName.charAt(i) == 'W'){
				i++;
				playD0();
			}
			else if(songName.charAt(i) == 'I'){
				i++;
				playE0();
			}
			else if(songName.charAt(i) == 'R'){i++;
				playF0();
			}
			else if(songName.charAt(i) == 'T'){i++;
				playG0();
			}
			else if(songName.charAt(i) == 'Y'){i++;
				playA0();
			}
			else if(songName.charAt(i) == 'U'){i++;
				playB0();
			}
			else if(songName.charAt(i) == 'Z'){i++;
				playC1();
			}
			else if(songName.charAt(i) == 'X'){i++;
				playD1();
			}
			else if(songName.charAt(i) == '.'){i++;
				playE1();
			}
			else if(songName.charAt(i) == 'V'){i++;
				playF1();
			}
			else if(songName.charAt(i) == 'L'){i++;
				playG1();
			}
			else if(songName.charAt(i) == 'N'){i++;
				playA1();
			}
			else if(songName.charAt(i) == 'M'){i++;
				playB1();
			}
			else if(songName.charAt(i) == '1'){i++;
				playCS0();
			}
			else if(songName.charAt(i) == '2'){i++;
				playES0();
			}
			else if(songName.charAt(i) == '3'){i++;
				playFS0();
			}
			else if(songName.charAt(i) == '4'){i++;
				playGS0();
			}
			else if(songName.charAt(i) == '5'){i++;
				playAS0();
			}
			else if(songName.charAt(i) == '6'){i++;
				playCS();
			}
			else if(songName.charAt(i) == '7'){i++;
				playES();
			}
			else if(songName.charAt(i) == '8'){i++;
				playFS();
			}
			else if(songName.charAt(i) == '9'){i++;
				playGS();
			}
			else if(songName.charAt(i) == '0'){i++;
				playAS();
			}
			else if(songName.charAt(i) == '['){i++;
				playCS1();
			}
			else if(songName.charAt(i) == ']'){i++;
				playES1();
			}
			else if(songName.charAt(i) == '/'){i++;
				playFS1();
			}
			else if(songName.charAt(i) == '='){i++;
				playGS1();
			}
			else if(songName.charAt(i) == ','){i++;
				playAS1();
			}
			else{i++;
				playSpace();
			}
			/*if(i <songName.length()){
				i++;
			}*/
	 });
	 
	 
	}
	public void playD(){
		FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
		 ft.setCycleCount(1);
		 
		 d = new AudioClip("file:src/Sound/piano_D.wav");
		 ParallelTransition st = new ParallelTransition(rect[8], ft);
		 d.play();
		 
		 st.play();
		 
		 if(i == songName.length()-1){
			 pane.getChildren().remove(tf);
		 }
		 
		 st.setOnFinished(e->{
			 rect[8].setFill(Color.WHITE);

			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
	}
	public void playE(){
		FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
		 ft.setCycleCount(1);
		 
		 eM = new AudioClip("file:src/Sound/piano_E.wav");
		 ParallelTransition st = new ParallelTransition(rect[9], ft);
		 eM.play();
		 st.play();
		 
		 if(i == songName.length()-1){
			 pane.getChildren().remove(tf);
		 }
		 
		 st.setOnFinished(e->{
			 rect[9].setFill(Color.WHITE);
			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
	}
	public void playF(){
		FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
		 ft.setCycleCount(1);
		 
		 f = new AudioClip("file:src/Sound/piano_F.wav");
		 ParallelTransition st = new ParallelTransition(rect[10], ft);
		 f.play();
		 st.play();
		 
		 if(i == songName.length()-1){
			 pane.getChildren().remove(tf);
		 }
		 
		 st.setOnFinished(e->{
			 rect[10].setFill(Color.WHITE);

			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
	}
	public void playG(){
		FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
		 ft.setCycleCount(1);
		 
		 g = new AudioClip("file:src/Sound/piano_G.wav");
		 ParallelTransition st = new ParallelTransition(rect[11], ft);
		 g.play();
		 st.play();
		 
		 if(i == songName.length()-1){
			 pane.getChildren().remove(tf);
		 }
		 
		 st.setOnFinished(e->{
			 rect[11].setFill(Color.WHITE);

			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
	}
	public void playA(){
		FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
		 ft.setCycleCount(1);
		 
		 a = new AudioClip("file:src/Sound/piano_A.wav");
		 ParallelTransition st = new ParallelTransition(rect[12], ft);
		 a.play();
		 st.play();
		 
		 if(i == songName.length()-1){
			 pane.getChildren().remove(tf);
		 }
		 
		 st.setOnFinished(e->{
			 rect[12].setFill(Color.WHITE);

			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
	}
	public void playB(){
		FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
		 ft.setCycleCount(1);
		 
		 b1 = new AudioClip("file:src/Sound/piano_B.wav");
		 ParallelTransition st = new ParallelTransition(rect[6], ft);
		 b1.play();
		 st.play();
		 
		 if(i == songName.length()-1){
			 pane.getChildren().remove(tf);
		 }
		 
		 st.setOnFinished(e->{
			 rect[6].setFill(Color.WHITE);
			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
			
		 });
	}
	
	//for a half or whole note
	public void playSpace(){
		FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.WHITE);
		 ft.setCycleCount(1);
		 ParallelTransition st = new ParallelTransition(sidePiano, ft);
		
		 st.play();
		 
		 if(i == songName.length()-1){
			 pane.getChildren().remove(tf);
		 }
		 
		 st.setOnFinished(e->{
			 
			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
	}
	
	//highest octave
	
	public void playC1(){
		
		 FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
		 ft.setCycleCount(1);
		 
		 cN = new AudioClip("file:src/Sound/68440__pinkyfinger__piano-c.wav");
		 ParallelTransition st = new ParallelTransition(rect[14], ft);
		 cN.play();
		 
		 st.play();
		 
		 if(i == songName.length()-1){
			 pane.getChildren().remove(tf);
		 }
		 
		 st.setOnFinished(e->{
			 rect[14].setFill(Color.WHITE);

			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
		 
		 
		}
	public void playD1(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 d = new AudioClip("file:src/Sound/68442__pinkyfinger__piano-d.wav");
			 ParallelTransition st = new ParallelTransition(rect[15], ft);
			 d.play();
			 
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[15].setFill(Color.WHITE);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playE1(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 eM = new AudioClip("file:src/Sound/68443__pinkyfinger__piano-e.wav");
			 ParallelTransition st = new ParallelTransition(rect[16], ft);
			 eM.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[16].setFill(Color.WHITE);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playF1(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 f = new AudioClip("file:src/Sound/68445__pinkyfinger__piano-f.wav");
			 ParallelTransition st = new ParallelTransition(rect[17], ft);
			 f.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[17].setFill(Color.WHITE);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playG1(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 g = new AudioClip("file:src/Sound/68448__pinkyfinger__piano-g.wav");
			 ParallelTransition st = new ParallelTransition(rect[18], ft);
			 g.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[18].setFill(Color.WHITE);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playA1(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 a = new AudioClip("file:src/Sound/A_High.wav");
			 ParallelTransition st = new ParallelTransition(rect[19], ft);
			 a.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[19].setFill(Color.WHITE);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playB1(){
		FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
		 ft.setCycleCount(1);
		 
		 b1 = new AudioClip("file:src/Sound/B_High.wav");
		 ParallelTransition st = new ParallelTransition(rect[20], ft);
		 b1.play();
		 st.play();
		 
		 if(i == songName.length()-1){
			 pane.getChildren().remove(tf);
		 }
		 
		 st.setOnFinished(e->{
			 rect[20].setFill(Color.WHITE);

			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
	}
	public void playCLast(){
		FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
		 ft.setCycleCount(1);
		 
		 b1 = new AudioClip("file:src/Sound/C_Last.wav");
		 ParallelTransition st = new ParallelTransition(rect[21], ft);
		 b1.play();
		 st.play();
		 
		 if(i == songName.length()-1){
			 pane.getChildren().remove(tf);
		 }
		 
		 st.setOnFinished(e->{
			 rect[21].setFill(Color.WHITE);

			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
	}

	
	//Black Keys first Octave
	public void playCS0(){
		 FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
		 ft.setCycleCount(1);
		 
		 cN = new AudioClip("file:src/Sound/C1.wav");
		 ParallelTransition st = new ParallelTransition(black[0], ft);
		 cN.play();
		 
		 st.play();
		 st.setOnFinished(e->{
			 black[0].setFill(Color.BLACK);

			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
		 
		 
		}
	public void playES0(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
			 ft.setCycleCount(1);
			 
			 eM = new AudioClip("file:src/Sound/E1.wav");
			 ParallelTransition st = new ParallelTransition(black[1], ft);
			 eM.play();
			 st.play();
			 st.setOnFinished(e->{
				 black[1].setFill(Color.BLACK);
				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playFS0(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
			 ft.setCycleCount(1);
			 
			 f = new AudioClip("file:src/Sound/F1.wav");
			 ParallelTransition st = new ParallelTransition(black[3], ft);
			 f.play();
			 st.play();
			 st.setOnFinished(e->{
				 black[3].setFill(Color.BLACK);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playGS0(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
			 ft.setCycleCount(1);
			 
			 g = new AudioClip("file:src/Sound/G1.wav");
			 ParallelTransition st = new ParallelTransition(black[4], ft);
			 g.play();
			 st.play();
			 st.setOnFinished(e->{
				 black[4].setFill(Color.BLACK);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playAS0(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
			 ft.setCycleCount(1);
			 
			 a = new AudioClip("file:src/Sound/A1.wav");
			 ParallelTransition st = new ParallelTransition(black[5], ft);
			 a.play();
			 st.play();
			 st.setOnFinished(e->{
				 black[5].setFill(Color.BLACK);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
					
	//Black Keys second Octave
	public void playCS(){
		 FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
		 ft.setCycleCount(1);
		 
		 cN = new AudioClip("file:src/Sound/piano_C_sharp.wav");
		 ParallelTransition st = new ParallelTransition(black[7], ft);
		 cN.play();
		 
		 st.play();
		 st.setOnFinished(e->{
			 black[7].setFill(Color.BLACK);

			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
		 
		 
		}
	public void playES(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
			 ft.setCycleCount(1);
			 
			 eM = new AudioClip("file:src/Sound/piano_D_sharp.wav");
			 ParallelTransition st = new ParallelTransition(black[8], ft);
			 eM.play();
			 st.play();
			 st.setOnFinished(e->{
				 black[8].setFill(Color.BLACK);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playFS(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
			 ft.setCycleCount(1);
			 
			 f = new AudioClip("file:src/Sound/piano_F_sharp.wav");
			 ParallelTransition st = new ParallelTransition(black[9], ft);
			 f.play();
			 st.play();
			 st.setOnFinished(e->{
				 black[9].setFill(Color.BLACK);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playGS(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
			 ft.setCycleCount(1);
			 
			 g = new AudioClip("file:src/Sound/piano_G_sharp.wav");
			 ParallelTransition st = new ParallelTransition(black[10], ft);
			 g.play();
			 st.play();
			 st.setOnFinished(e->{
				 black[10].setFill(Color.BLACK);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playAS(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
			 ft.setCycleCount(1);
			 
			 a = new AudioClip("file:src/Sound/piano_A_sharp.wav");
			 ParallelTransition st = new ParallelTransition(black[11], ft);
			 a.play();
			 st.play();
			 st.setOnFinished(e->{
				 black[11].setFill(Color.BLACK);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}

	//Black Keys third octave
	public void playCS1(){
		 FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
		 ft.setCycleCount(1);
		 
		 cN = new AudioClip("file:src/Sound/C1.wav");
		 ParallelTransition st = new ParallelTransition(black[0], ft);
		 cN.play();
		 
		 st.play();
		 st.setOnFinished(e->{
			 black[0].setFill(Color.BLACK);

			 if(songName.charAt(i) == 'C'){
				 i++;	
				 playC();
					
				}
				else if(songName.charAt(i) == 'D'){
					i++;
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					i++;
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					i++;
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					i++;
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					i++;
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					i++;
					playB();
				}else if(songName.charAt(i) == 'Q'){
					i++;
					playC0();
				}
				else if(songName.charAt(i) == 'W'){
					i++;
					playD0();
				}
				else if(songName.charAt(i) == 'I'){
					i++;
					playE0();
				}
				else if(songName.charAt(i) == 'R'){i++;
					playF0();
				}
				else if(songName.charAt(i) == 'T'){i++;
					playG0();
				}
				else if(songName.charAt(i) == 'Y'){i++;
					playA0();
				}
				else if(songName.charAt(i) == 'U'){i++;
					playB0();
				}
				else if(songName.charAt(i) == 'Z'){i++;
					playC1();
				}
				else if(songName.charAt(i) == 'X'){i++;
					playD1();
				}
				else if(songName.charAt(i) == '.'){i++;
					playE1();
				}
				else if(songName.charAt(i) == 'V'){i++;
					playF1();
				}
				else if(songName.charAt(i) == 'L'){i++;
					playG1();
				}
				else if(songName.charAt(i) == 'N'){i++;
					playA1();
				}
				else if(songName.charAt(i) == 'M'){i++;
					playB1();
				}
				else if(songName.charAt(i) == '1'){i++;
					playCS0();
				}
				else if(songName.charAt(i) == '2'){i++;
					playES0();
				}
				else if(songName.charAt(i) == '3'){i++;
					playFS0();
				}
				else if(songName.charAt(i) == '4'){i++;
					playGS0();
				}
				else if(songName.charAt(i) == '5'){i++;
					playAS0();
				}
				else if(songName.charAt(i) == '6'){i++;
					playCS();
				}
				else if(songName.charAt(i) == '7'){i++;
					playES();
				}
				else if(songName.charAt(i) == '8'){i++;
					playFS();
				}
				else if(songName.charAt(i) == '9'){i++;
					playGS();
				}
				else if(songName.charAt(i) == '0'){i++;
					playAS();
				}
				else if(songName.charAt(i) == '['){i++;
					playCS1();
				}
				else if(songName.charAt(i) == ']'){i++;
					playES1();
				}
				else if(songName.charAt(i) == '/'){i++;
					playFS1();
				}
				else if(songName.charAt(i) == '='){i++;
					playGS1();
				}
				else if(songName.charAt(i) == ','){i++;
					playAS1();
				}
				else{i++;
					playSpace();
				}
				/*if(i <songName.length()){
					i++;
				}*/
		 });
		 
		 
		}
	public void playES1(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
			 ft.setCycleCount(1);
			 
			 eM = new AudioClip("file:src/Sound/E1.wav");
			 ParallelTransition st = new ParallelTransition(black[2], ft);
			 eM.play();
			 st.play();
			 st.setOnFinished(e->{
				 black[2].setFill(Color.BLACK);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playFS1(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
			 ft.setCycleCount(1);
			 
			 f = new AudioClip("file:src/Sound/F1.wav");
			 ParallelTransition st = new ParallelTransition(black[3], ft);
			 f.play();
			 st.play();
			 st.setOnFinished(e->{
				 black[3].setFill(Color.BLACK);
				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playGS1(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
			 ft.setCycleCount(1);
			 
			 g = new AudioClip("file:src/Sound/G1.wav");
			 ParallelTransition st = new ParallelTransition(black[4], ft);
			 g.play();
			 st.play();
			 st.setOnFinished(e->{
				 black[4].setFill(Color.BLACK);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
	public void playAS1(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.BLACK, Color.RED);
			 ft.setCycleCount(1);
			 
			 a = new AudioClip("file:src/Sound/A1.wav");
			 ParallelTransition st = new ParallelTransition(black[5], ft);
			 a.play();
			 st.play();
			 st.setOnFinished(e->{
				 black[5].setFill(Color.BLACK);

				 if(songName.charAt(i) == 'C'){
					 i++;	
					 playC();
						
					}
					else if(songName.charAt(i) == 'D'){
						i++;
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						i++;
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						i++;
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						i++;
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						i++;
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						i++;
						playB();
					}else if(songName.charAt(i) == 'Q'){
						i++;
						playC0();
					}
					else if(songName.charAt(i) == 'W'){
						i++;
						playD0();
					}
					else if(songName.charAt(i) == 'I'){
						i++;
						playE0();
					}
					else if(songName.charAt(i) == 'R'){i++;
						playF0();
					}
					else if(songName.charAt(i) == 'T'){i++;
						playG0();
					}
					else if(songName.charAt(i) == 'Y'){i++;
						playA0();
					}
					else if(songName.charAt(i) == 'U'){i++;
						playB0();
					}
					else if(songName.charAt(i) == 'Z'){i++;
						playC1();
					}
					else if(songName.charAt(i) == 'X'){i++;
						playD1();
					}
					else if(songName.charAt(i) == '.'){i++;
						playE1();
					}
					else if(songName.charAt(i) == 'V'){i++;
						playF1();
					}
					else if(songName.charAt(i) == 'L'){i++;
						playG1();
					}
					else if(songName.charAt(i) == 'N'){i++;
						playA1();
					}
					else if(songName.charAt(i) == 'M'){i++;
						playB1();
					}
					else if(songName.charAt(i) == '1'){i++;
						playCS0();
					}
					else if(songName.charAt(i) == '2'){i++;
						playES0();
					}
					else if(songName.charAt(i) == '3'){i++;
						playFS0();
					}
					else if(songName.charAt(i) == '4'){i++;
						playGS0();
					}
					else if(songName.charAt(i) == '5'){i++;
						playAS0();
					}
					else if(songName.charAt(i) == '6'){i++;
						playCS();
					}
					else if(songName.charAt(i) == '7'){i++;
						playES();
					}
					else if(songName.charAt(i) == '8'){i++;
						playFS();
					}
					else if(songName.charAt(i) == '9'){i++;
						playGS();
					}
					else if(songName.charAt(i) == '0'){i++;
						playAS();
					}
					else if(songName.charAt(i) == '['){i++;
						playCS1();
					}
					else if(songName.charAt(i) == ']'){i++;
						playES1();
					}
					else if(songName.charAt(i) == '/'){i++;
						playFS1();
					}
					else if(songName.charAt(i) == '='){i++;
						playGS1();
					}
					else if(songName.charAt(i) == ','){i++;
						playAS1();
					}
					else{i++;
						playSpace();
					}
					/*if(i <songName.length()){
						i++;
					}*/
			 });
		}
					
}




