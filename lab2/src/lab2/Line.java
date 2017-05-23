package lab2;

public class Line extends shape{
	private int length;
	public Line (int lenght){
		this.length = lenght;
	}
	public int getLenght() {
		return length;
	}
	public void setLenght(int lenght) {
		this.length = lenght;
	}

	@Override
	public void draw() {
		for (int i = 0; i < length; i++) {
			System.out.print("-");
			
		}
		
	}
}
