package game.prototype;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;

public class GameScreen extends JComponent {
	// 멤버 변수
	private Unit player1, player2;
	
	// 생성자
	public GameScreen() {
//		super();
		player1 = new Unit(Color.BLUE, 400, 200);
		player2 = new Unit(Color.RED, 50, 200);
		
		this.setFocusable(true);
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				super.keyTyped(e);
				int key = e.getKeyCode();
				switch(key) {
				//p1
				case KeyEvent.VK_RIGHT:
					player1.isMovingRight = true;
					break;
				case KeyEvent.VK_LEFT:
					player1.isMovingLeft = true;
					break;
					
				//p2
				case KeyEvent.VK_A:
					player2.isMovingRight = true;
					break;
				case KeyEvent.VK_D:
					player2.isMovingLeft = true;
					break;
				}
			}

			@Override
			public void keyPressed(KeyEvent e) { //유닛 이동해제 
				// TODO Auto-generated method stub
				super.keyPressed(e);
				
				int key = e.getKeyCode();
				switch(key) {
				//p1
				case KeyEvent.VK_RIGHT:
					player1.isMovingRight = false;
					break;
				case KeyEvent.VK_LEFT:
					player1.isMovingLeft = false;
					break;
					
				//p2
				case KeyEvent.VK_A:
					player2.isMovingRight = false;
					break;
				case KeyEvent.VK_D:
					player2.isMovingLeft = false;
					break;
				}
				
				moveUnits();
			}
			
		});			
	};
	
	
	


	// 메소드
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		g.fillRect(0, 0, 100, 100);
//		g.setColor(Color.BLUE);
//		g.fillRect(400, 2000, 50, 50);		
		player1.draw(g);
		
//		g.setColor(Color.RED);
//		g.fillRect(30, 200 50, 50);
		player2.draw(g);
	}

	public void moveUnits() {
		player1.move();
		player2.move();
		
		this.repaint();
	}	
}
