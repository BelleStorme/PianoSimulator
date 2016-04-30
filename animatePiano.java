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

public class animatePiano{
	private String songName;
	int i = 0;
	Rectangle[] rect;
	Polygon sidePiano;
	Rectangle[] black;
	TextFlow tf = new TextFlow();
	Pane pane;
	
	AudioClip b1;
	AudioClip d;
	AudioClip eM;
	AudioClip f;
	AudioClip g;
	AudioClip a;
	AudioClip b;
	AudioClip cN;
	
	/**
	 * This constructor gets what we need from the other class
	 * @param s This letters in the song
	 * @param r The white keys
	 * @param p	The side piano
	 * @param b The black keys
	 * @param pa The pane so we can add and remove things while the song is playing
	 * @param t The name of the song
	 */
	
	public animatePiano (String s, Rectangle[] r, Polygon p, Rectangle[] b, Pane pa, TextFlow t){
		
		songName = s;
		sidePiano = p;
		rect = r;
		black = b;
		tf = t;
		pane = pa;
	}
	
		public void playC(){
		
		 FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
		 ft.setCycleCount(1);
		 
		 cN = new AudioClip("file:src/Sound/piano_middle_C.wav");
		 ParallelTransition st = new ParallelTransition(rect[0], ft);
		 cN.play();
		 
		 st.play();
		 
		 if(i == songName.length()-1){
			 pane.getChildren().remove(tf);
		 }
		 
		 st.setOnFinished(e->{
			 rect[0].setFill(Color.WHITE);

				if(songName.charAt(i) == 'C'){
					playC();
				}
				else if(songName.charAt(i) == 'D'){
					playD();
				}
				else if(songName.charAt(i) == 'E'){
					playE();
				}
				else if(songName.charAt(i) == 'F'){
					playF();
				}
				else if(songName.charAt(i) == 'G'){
					playG();
				}
				else if(songName.charAt(i) == 'A'){
					playA();
				}
				else if(songName.charAt(i) == 'B'){
					playB();
				}
				else{
					playSpace();
				}
				if(i <songName.length()){
					i++;
				}
		 });
		 
		 
		}
		public void playD(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 d = new AudioClip("file:src/Sound/piano_D.wav");
			 ParallelTransition st = new ParallelTransition(rect[1], ft);
			 d.play();
			 
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[1].setFill(Color.WHITE);

					if(songName.charAt(i) == 'C'){
						playC();
					}
					else if(songName.charAt(i) == 'D'){
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						playB();
					}
					else{
						playSpace();
					}
					if(i <songName.length()){
						i++;
					}
			 });
		}
		public void playE(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 eM = new AudioClip("file:src/Sound/piano_E.wav");
			 ParallelTransition st = new ParallelTransition(rect[2], ft);
			 eM.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[2].setFill(Color.WHITE);

					if(songName.charAt(i) == 'C'){
						playC();
					}
					else if(songName.charAt(i) == 'D'){
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						playB();
					}
					else{
						playSpace();
					}
					if(i <songName.length()){
						i++;
					}
			 });
		}
		public void playF(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 f = new AudioClip("file:src/Sound/piano_F.wav");
			 ParallelTransition st = new ParallelTransition(rect[3], ft);
			 f.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[3].setFill(Color.WHITE);

					if(songName.charAt(i) == 'C'){
						playC();
					}
					else if(songName.charAt(i) == 'D'){
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						playB();
					}
					else{
						playSpace();
					}
					if(i <songName.length()){
						i++;
					}
			 });
		}
		public void playG(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 g = new AudioClip("file:src/Sound/piano_G.wav");
			 ParallelTransition st = new ParallelTransition(rect[4], ft);
			 g.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[4].setFill(Color.WHITE);

					if(songName.charAt(i) == 'C'){
						playC();
					}
					else if(songName.charAt(i) == 'D'){
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						playB();
					}
					else{
						playSpace();
					}
				
					if(i <songName.length()){
						i++;
					}
			 });
		}
		public void playA(){
			FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 a = new AudioClip("file:src/Sound/piano_A.wav");
			 ParallelTransition st = new ParallelTransition(rect[5], ft);
			 a.play();
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 rect[5].setFill(Color.WHITE);

					if(songName.charAt(i) == 'C'){
						playC();
					}
					else if(songName.charAt(i) == 'D'){
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						playB();
					}
					else{
						playSpace();
					}
					if(i <songName.length()){
						i++;
					}
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
						playC();
					}
					else if(songName.charAt(i) == 'D'){
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						playB();
					}
					else{
						playSpace();
					}
				if(i < songName.length()){
					i++;
				}
			 });
		}
	
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
						playC();
					}
					else if(songName.charAt(i) == 'D'){
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						playB();
					}
					else{
						playSpace();
					}
				if(i < songName.length()){
					i++;
				}
			 });
		}

		public void playCS(){
			 FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
			 ft.setCycleCount(1);
			 
			 cN = new AudioClip("file:src/Sound/C1.wav");
			 ParallelTransition st = new ParallelTransition(black[0], ft);
			 cN.play();
			 
			 st.play();
			 
			 if(i == songName.length()-1){
				 pane.getChildren().remove(tf);
			 }
			 
			 st.setOnFinished(e->{
				 black[0].setFill(Color.WHITE);

					if(songName.charAt(i) == 'C'){
						playC();
					}
					else if(songName.charAt(i) == 'D'){
						playD();
					}
					else if(songName.charAt(i) == 'E'){
						playE();
					}
					else if(songName.charAt(i) == 'F'){
						playF();
					}
					else if(songName.charAt(i) == 'G'){
						playG();
					}
					else if(songName.charAt(i) == 'A'){
						playA();
					}
					else if(songName.charAt(i) == 'B'){
						playB();
					}
					else{
						playSpace();
					}
					
					if(i <songName.length()){
						i++;
					}
			 });
			 
			 
			}
		public void playES(){
				FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
				 ft.setCycleCount(1);
				 
				 eM = new AudioClip("file:src/Sound/E1.wav");
				 ParallelTransition st = new ParallelTransition(black[2], ft);
				 eM.play();
				 st.play();
				 
				 if(i == songName.length()-1){
					 pane.getChildren().remove(tf);
				 }
				 
				 st.setOnFinished(e->{
					 black[2].setFill(Color.WHITE);

						if(songName.charAt(i) == 'C'){
							playC();
						}
						else if(songName.charAt(i) == 'D'){
							playD();
						}
						else if(songName.charAt(i) == 'E'){
							playE();
						}
						else if(songName.charAt(i) == 'F'){
							playF();
						}
						else if(songName.charAt(i) == 'G'){
							playG();
						}
						else if(songName.charAt(i) == 'A'){
							playA();
						}
						else if(songName.charAt(i) == 'B'){
							playB();
						}
						else{
							playSpace();
						}
						if(i <songName.length()){
							i++;
						}
				 });
			}
		public void playFS(){
				FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
				 ft.setCycleCount(1);
				 
				 f = new AudioClip("file:src/Sound/F1.wav");
				 ParallelTransition st = new ParallelTransition(black[3], ft);
				 f.play();
				 st.play();
				 
				 if(i == songName.length()-1){
					 pane.getChildren().remove(tf);
				 }
				 
				 st.setOnFinished(e->{
					 black[3].setFill(Color.WHITE);

						if(songName.charAt(i) == 'C'){
							playC();
						}
						else if(songName.charAt(i) == 'D'){
							playD();
						}
						else if(songName.charAt(i) == 'E'){
							playE();
						}
						else if(songName.charAt(i) == 'F'){
							playF();
						}
						else if(songName.charAt(i) == 'G'){
							playG();
						}
						else if(songName.charAt(i) == 'A'){
							playA();
						}
						else if(songName.charAt(i) == 'B'){
							playB();
						}
						else{
							playSpace();
						}
						if(i <songName.length()){
							i++;
						}
				 });
			}
		public void playGS(){
				FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
				 ft.setCycleCount(1);
				 
				 g = new AudioClip("file:src/Sound/G1.wav");
				 ParallelTransition st = new ParallelTransition(black[4], ft);
				 g.play();
				 st.play();
				 
				 if(i == songName.length()-1){
					 pane.getChildren().remove(tf);
				 }
				 
				 st.setOnFinished(e->{
					 black[4].setFill(Color.WHITE);

						if(songName.charAt(i) == 'C'){
							playC();
						}
						else if(songName.charAt(i) == 'D'){
							playD();
						}
						else if(songName.charAt(i) == 'E'){
							playE();
						}
						else if(songName.charAt(i) == 'F'){
							playF();
						}
						else if(songName.charAt(i) == 'G'){
							playG();
						}
						else if(songName.charAt(i) == 'A'){
							playA();
						}
						else if(songName.charAt(i) == 'B'){
							playB();
						}
						else{
							playSpace();
						}
					
						if(i <songName.length()){
							i++;
						}
				 });
			}
		public void playAS(){
				FillTransition ft = new FillTransition(Duration.millis(500), Color.WHITE, Color.RED);
				 ft.setCycleCount(1);
				 
				 a = new AudioClip("file:src/Sound/A1.wav");
				 ParallelTransition st = new ParallelTransition(black[5], ft);
				 a.play();
				 st.play();
				 
				 if(i == songName.length()-1){
					 pane.getChildren().remove(tf);
				 }
				 
				 st.setOnFinished(e->{
					 black[5].setFill(Color.WHITE);

						if(songName.charAt(i) == 'C'){
							playC();
						}
						else if(songName.charAt(i) == 'D'){
							playD();
						}
						else if(songName.charAt(i) == 'E'){
							playE();
						}
						else if(songName.charAt(i) == 'F'){
							playF();
						}
						else if(songName.charAt(i) == 'G'){
							playG();
						}
						else if(songName.charAt(i) == 'A'){
							playA();
						}
						else if(songName.charAt(i) == 'B'){
							playB();
						}
						else{
							playSpace();
						}
						if(i <songName.length()){
							i++;
						}
				 });
			}

	
	
	
}

