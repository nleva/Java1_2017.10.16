package ru.spec.java1.lecFinal;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class UserTest {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		// screen();
//		mouse();
		JFrame frame = new JFrame("my app");
		frame.setBounds(300, 300, 500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Window w = new Window(null);
		w.setBounds(200, 200, 500, 500);
		w.setVisible(true);
		w.setAlwaysOnTop(true);
		Thread.sleep(1000);
		w.getGraphics().drawImage(
				ImageIO.read(new File("c:/java/screen.png")), 0, 0, null);
		
		
		
	}

	private static void mouse() throws AWTException, InterruptedException {
		Robot r = new Robot();
//		r.mouseMove(0, 0);
		// r.mo
		// r.keyPress(KeyEvent.VK_Z);
		// r.keyRelease(KeyEvent.VK_Z);//zzz 

		int dx = 0, dy = 0;
		for (int i = 0; i < 500; i++) {
			Point p = MouseInfo.getPointerInfo().getLocation();
			dx=(int)(Math.random()*7) - 3;
			dy=(int)(Math.random()*7) - 3;
			r.mouseMove(p.x + dx, p.y + dy);
			Color pixelColor = r.getPixelColor(p.x, p.y);
			System.out.println(pixelColor);
			Thread.sleep(20);
		}
	}

	private static void screen() throws AWTException, IOException {
		Robot r = new Robot();
		BufferedImage img = r.createScreenCapture(new Rectangle(0, 0, 500, 500));

		int height = img.getHeight();
		int width = img.getWidth();

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				int rgb = img.getRGB(x, y);
				img.setRGB(x, y, ~rgb);
			}
		}
		ImageIO.write(img, "png", new File("c:/java/screen.png"));
	}

}
