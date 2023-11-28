package game.prototype;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GamePrototype extends JFrame {
	//멤버변수
	
	//생성자
		GamePrototype() {
			super("2인용 게임");	
			
			buildGUI();
			
			this.setSize(500, 500);
			this.setResizable(false);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		}
		
	//메인 메소드
		private void buildGUI() {
			GameScreen makeScreen = new GameScreen();
			this.add(makeScreen);
		}
		
		public static void main(String[] args) {
			new GamePrototype();
		}
}
