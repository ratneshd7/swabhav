package lsp.solution1;



public class RectangleSquare {

	public void testShouldNotChangewidth_ifHeightChanged(Rectangle r) {
		int before=r.getWidth();
		r.setHeight(100);
		int after=r.getHeight();
		
		System.out.println(before);
		System.out.println(after);
	}

}
