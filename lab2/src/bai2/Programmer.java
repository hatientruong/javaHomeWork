package bai2;

public class Programmer extends Student {
	private int SonamKinhngiem;
	private String cacNgonnguthanhThao;
	
	
	public int getSonamKinhngiem() {
		return SonamKinhngiem;
	}
	public void setSonamKinhngiem(int sonamKinhngiem) {
		SonamKinhngiem = sonamKinhngiem;
	}
	public String getCacNgonnguthanhThao() {
		return cacNgonnguthanhThao;
	}
	public void setCacNgonnguthanhThao(String cacNgonnguthanhThao) {
		this.cacNgonnguthanhThao = cacNgonnguthanhThao;
	}
	public Programmer(String ten, int tuoi, String gioitinh, int maSV, int sonamKinhngiem, String cacNgonnguthanhThao) {
		super(ten, tuoi, gioitinh, maSV);
		SonamKinhngiem = sonamKinhngiem;
		this.cacNgonnguthanhThao = cacNgonnguthanhThao;
	}
	public Programmer() {
		super();
	}
	
	
	public void KhaNang() {
		System.out.print("Hello World ");

	}
	
	

}
