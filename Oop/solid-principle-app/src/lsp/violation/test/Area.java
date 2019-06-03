package lsp.violation.test;

import lsp.violation.Rectangle;
import lsp.violation.Square;

public class Area {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(50, 5);
		Square square = new Square(50);
		
		testShouldNotChangewidth_ifHeightChanged(new Rectangle(50, 5));
		testShouldNotChangewidth_ifHeightChanged(new Square(50));
		
		
		
	}
	public static void testShouldNotChangewidth_ifHeightChanged(Rectangle r) {
		int before=r.getWidth();
		r.setHeight(100);
		int after=r.getWidth();
		
		System.out.println(before);
		System.out.println(after);
	}
}
