package g18.openResearch;

public enum Size {
	X(420),
	Y(420);
	private int size;
	Size(int size){
		this.size = size;
	}
	public int getSize() {
		return size;
	}

}
