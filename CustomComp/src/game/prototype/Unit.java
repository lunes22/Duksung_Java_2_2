package game.prototype;

import java.awt.Color;
import java.awt.Graphics;

public class Unit {
	//멤버변수
	private static final int UNIT_SIZE = 50; //도형 크기
	public static final int MOVE_DISRANCE = 10; //좌/우이동 중 여부
	private Color color; //색상
	private int x, y; //표시위치
	
	boolean isMovingLeft = false;
	boolean isMovingRight = false;	
	
	//생성자	
	public Unit(Color color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	//메소드
	public void move() {
		if(isMovingRight && x < 450) {
			x+=MOVE_DISRANCE;
		}
		if(isMovingLeft && x > 0) {
			x-=MOVE_DISRANCE;
		}

	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, UNIT_SIZE, UNIT_SIZE);
		
	}
	
}