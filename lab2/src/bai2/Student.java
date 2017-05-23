package bai2;

public class Student extends Person {
	
	private int maSV;

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public Student(String ten, int tuoi, String gioitinh, int maSV) {
		super(ten, tuoi, gioitinh);
		this.maSV = maSV;
	}

	public Student(String ten, int tuoi, String gioitinh) {
		super(ten, tuoi, gioitinh);
	}
	public Student(){
	super ();
	}
	
	

}
