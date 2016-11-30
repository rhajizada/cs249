import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/*
ghp9 PlayerPane class inherits pane class
Written by Rufat Hajizada for cs249
Language: java 
*/
public class PlayerPane extends Pane {
    Player playerState;

    PlayerPane(Player player) throws Exception {
        playerState = player;
        Image playerImage = new Image("http://web.cs.sunyit.edu/~realemj/2016fall/char.png");
        ImageView playerImageViewer = new ImageView(playerImage);
        playerImageViewer.setFitWidth(MapPane.TILE_WIDTH);
        playerImageViewer.setFitHeight(MapPane.TILE_HEIGHT);
        getChildren().add(playerImageViewer);
        this.translateXProperty().bind(playerState.getXProperty().multiply(MapPane.TILE_WIDTH));
        this.translateYProperty().bind(playerState.getYProperty().multiply(MapPane.TILE_HEIGHT));

    }
    public void playerSetter(int y, int x){
        playerState.setPosition(y, x);
        this.translateXProperty().bind(playerState.getXProperty().multiply(MapPane.TILE_WIDTH));
        this.translateYProperty().bind(playerState.getYProperty().multiply(MapPane.TILE_HEIGHT));
    }
}
