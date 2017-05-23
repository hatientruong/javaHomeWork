package bai2;

public class Employee extends Person {
	private int tienluongCoban;
	private int heSoLuongcoBan;
	public int getTienluongCoban() {
		return tienluongCoban;
	}
	public void setTienluongCoban(int tienluongCoban) {
		this.tienluongCoban = tienluongCoban;
	}
	public int getHeSoLuongcoBan() {
		return heSoLuongcoBan;
	}
	public void setHeSoLuongcoBan(int heSoLuongcoBan) {
		this.heSoLuongcoBan = heSoLuongcoBan;
	}
	public Employee(String ten, int tuoi, String gioitinh, int tienluongCoban, int heSoLuongcoBan) {
		super(ten, tuoi, gioitinh);
		this.tienluongCoban = tienluongCoban;
		this.heSoLuongcoBan = heSoLuongcoBan;
	}
	public Employee(String ten, int tuoi, String gioitinh) {
		super(ten, tuoi, gioitinh);
	}
	public Employee(){
		super();
	}
	
	
	public int tinhluong() {
		return heSoLuongcoBan*tienluongCoban;
	}

}
