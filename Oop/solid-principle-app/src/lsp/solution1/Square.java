package lsp.solution1;

public class Square extends Rectangle implements IPolygon {

	public Square(int side) {
		super(side, side);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		this.width = this.height = height;
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		this.height = this.width = width;
	}
}
