package lsp.solution.test;

import lsp.solution1.Rectangle;
import lsp.solution1.RectangleSquare;
import lsp.solution1.Square;

public class RectangleSquareTest {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(50, 5);
		Square square = new Square(50);

		System.out.println(rectangle.getArea());
		System.out.println(square.getArea());
		
		RectangleSquare rectangleSquare=new RectangleSquare();
		rectangleSquare.testShouldNotChangewidth_ifHeightChanged(square);
	}
}
