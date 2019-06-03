package lsp.violation;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleSquare {

	@Test
	public void testShouldNotChangewidth_ifHeightChanged(Rectangle r) {
		int before=r.getWidth();
		r.setHeight(100);
		int after=r.getHeight();
		
		System.out.println(before);
		System.out.println(after);
	}

}
