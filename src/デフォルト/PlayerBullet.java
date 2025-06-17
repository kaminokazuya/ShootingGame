package デフォルト;

public class PlayerBullet extends Character {
	public void draw(MyFrame f) {
		f.setColor(50, 50, 50);
		f.fillRect(x+10, y, 10, 30);
	}
	public PlayerBullet(double x, double y, double vx, double vy) {
		super(x,y,vx,vy);
	}
}
