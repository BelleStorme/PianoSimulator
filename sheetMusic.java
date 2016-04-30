
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * This class gets sheet music so the user can read it if applicable.
 * @author Helene Casanova
 * @version 1.0
 * @since 2016-04-13
 */

public class sheetMusic extends Application{

	Pane p = new Pane();
	BorderPane pane = new BorderPane();
	Scene scene = new Scene(pane, 1000, 500);
	ScrollBar sb = new ScrollBar();
	
	/**
	 * The start method calls the void methods so we can add them
	 * to the screen. It also sets the icons and title.
	 * @param stage setting stage
	 * @throws Exception
	 * @return nothing
	 */
	
	@Override
	public void start(Stage stage) throws Exception {
		
		p.setStyle("-fx-background-color: black");
		
		pane.setCenter(p);
		
		sb.setPrefHeight(scene.getHeight());
		sb.setOrientation(Orientation.VERTICAL);
		
		pane.setRight(sb);
		
		musicSheets();
		
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Sheet Music");
		
		stage.getIcons().add(new Image("file:src/PianoIcon.jpg"));
		stage.show();
	}

	/**
	 * This method gets the images of the music and adds
	 * them to the pane.
	 * @param nothing
	 * @return void
	 */
	
	public void musicSheets(){
		Rectangle r1 = new Rectangle(400, 400);
		Rectangle r2 = new Rectangle(400, 400);
		r1.setStroke(Color.WHITE);
		r2.setStroke(Color.WHITE);
		r2.setTranslateX(500);
		
		
		Rectangle r3 = new Rectangle(400, 400);
		Rectangle r4 = new Rectangle(400, 400);
		r3.setStroke(Color.WHITE);
		r4.setStroke(Color.WHITE);
		r3.setTranslateY(500);
		r4.setTranslateX(500);
		r4.setTranslateY(500);
		
		Rectangle r5 = new Rectangle(400, 400);
		Rectangle r6 = new Rectangle(400, 400);
		r5.setStroke(Color.WHITE);
		r6.setStroke(Color.WHITE);
		r5.setTranslateY(1000);
		r6.setTranslateX(500);
		r6.setTranslateY(1000);
		
		Image img = new Image("file:src/happy.jpg");
		r1.setFill(new ImagePattern(img));
		
		Image img1 = new Image("file:src/drunken_sailor.png");
		r2.setFill(new ImagePattern(img1));
		
		Image img3 = new Image("file:src/doyou.jpg");
		r3.setFill(new ImagePattern(img3));
		
		Image img4 = new Image("file:src/Twinkle.jpg");
		r4.setFill(new ImagePattern(img4));
		
		Image img5 = new Image("file:src/when.jpg");
		r5.setFill(new ImagePattern(img5));
		
		Image img6 = new Image("file:src/Frere.jpg");
		r6.setFill(new ImagePattern(img6));
		
		sb.valueProperty().addListener(ov ->
		
		r1.setY(-(sb.getValue() * p.getHeight() /
				sb.getMax())*2)
		);
		sb.valueProperty().addListener(ov ->
			r2.setY(-(sb.getValue() * p.getHeight() /
					sb.getMax())*2)
		);
		
		sb.valueProperty().addListener(ov ->
		r3.setY(-(sb.getValue() * p.getHeight() /
				sb.getMax())*2)
		);
	
		sb.valueProperty().addListener(ov ->
		r4.setY(-(sb.getValue() * p.getHeight() /
			sb.getMax())*2)
		);
		
		sb.valueProperty().addListener(ov ->
		
		r5.setY(-(sb.getValue() * p.getHeight() /
				sb.getMax())*2)
		);
		sb.valueProperty().addListener(ov ->
		r6.setY(-(sb.getValue() * p.getHeight() /
					sb.getMax())*2)
		);
		
		
		p.getChildren().addAll( r1, r2, r3, r4, r5, r6);
	}
	
	public static void main(String[] args){
		Application.launch();
	}
}
