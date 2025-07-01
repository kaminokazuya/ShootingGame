package デフォルト;

public class SlantingEnemy extends Enemy {
	public SlantingEnemy(double x, double y, double vx, double vy) {
		super(x,y,vx,vy);
		life=2+GameWorld.stage-1;
	}
	public void move() {
		super.move();
		if(x<0) {
			vx=vx*(-1);
		}
		if(x>350) {
			vx=vx*(-1);
		}
	}
	public void draw(MyFrame f) {
		f.setColor(50, 50, 50);
		f.fillRect(x, y, 10, 30);
		f.setColor(50, 50, 50);
		f.fillRect(x+20, y, 10, 30);
		f.setColor(250, 0, 0);
		f.fillOval(x+10, y+10, 10, 10);
	}
}
