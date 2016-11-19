import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Scanner;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            Map map = new Map();
            URL mapURL = new URL("http://web.cs.sunyit.edu/~realemj/2016fall/Map01.txt");
            Scanner mapScanner = new Scanner(mapURL.openStream());
            map.load(mapScanner);
            MapPane mapPane = new MapPane(map);
            Pane displayPane = new Pane();
            displayPane.getChildren().add(mapPane);
            Player player = new Player(5,5);
            PlayerPane playerPane = new PlayerPane(player);
            displayPane.getChildren().add(mapPane);
            Scene scene = new Scene(displayPane);
            scene.setOnKeyPressed((e -> {
                int xCheck = player.getXProperty().intValue();
                int yCheck = player.getYProperty().intValue();
                switch(e.getCode()) {
                    case A:
                        xCheck--;
                        break;
                    case D:
                        xCheck++;
                        break;
                    case W:
                        yCheck--;
                        break;
                    case S:
                        yCheck++;
                        break;
                }
                if(map.canMoveTo(xCheck, yCheck)){
                    player.setPosition(xCheck, yCheck);
                }
            }));
            primaryStage.setTitle("Nethack");
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch(Exception ex){
            ex.printStackTrace();
            Platform.exit();
        }
    }

    public static void main(String[] args) {
	    launch(args);
    }


}
