package bai2;

public class Manager extends Employee {
	private int luongtrachNhiem;

	public int getLuongtrachNhiem() {
		return luongtrachNhiem;
	}

	public void setLuongtrachNhiem(int luongtrachNhiem) {
		this.luongtrachNhiem = luongtrachNhiem;
	}

	public Manager(String ten, int tuoi, String gioitinh, int luongtrachNhiem) {
		super(ten, tuoi, gioitinh);
		this.luongtrachNhiem = luongtrachNhiem;
	}

	public Manager(String ten, int tuoi, String gioitinh) {
		super(ten, tuoi, gioitinh);
	}
	
	public void tinhluong2() {
		int tinhtienLuong2;
		tinhtienLuong2 = tinhluong()+luongtrachNhiem;

	}
	
	
	

}
