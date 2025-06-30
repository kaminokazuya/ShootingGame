package デフォルト;

public class CurveEnemy extends Enemy {
	public CurveEnemy(double x, double y, double vx, double vy) {
		super(x,y,vx,vy);
		life=3+GameWorld.stage-1;
	}
	public void move() {
		super.move();
		if (x<GameWorld.player.x) {
			x+=GameWorld.stage;
		}
		if (x>GameWorld.player.x) {
			x-=GameWorld.stage;
		}
	}
	public void draw(MyFrame f) {
		f.setColor(50, 50, 50);
		f.fillOval(x,y,30,30);
		f.setColor(250, 250, 250);
		f.fillOval(x+5,y,20,30);
	}
}
