package ua.com.qalight;

import java.util.logging.Logger;

import javafx.scene.shape.Circle;
import ua.com.qalight.square.Square;

public class AppRunner {
	

	public static int main1(int radius, int area) {

		logger.info("(Once Circle with radius" + radius + "has area" + area);
		return (int) (radius * radius * Math.PI);
	}

	private static Logger logger = java.util.logging.Logger.getLogger(AppRunner.class.getName());

	public static void main1(String[] args) {
		Square square = new Square(10);
		logger.info("Square with side" + square.getSide() + "has area" + square.getArea());

	}

}
