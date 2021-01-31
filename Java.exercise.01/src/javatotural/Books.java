package javatotural;

public class Books extends Document {

    private String tenTacGia;
    private int soTrang;

    public Books(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Books{" +
                "Mã tài liệu='" + getMaTaiLieu() + '\'' +
                "Nhà xuất bản='" + getTenNXB() + '\'' +
                "số bản in='" + getSoBanPhatHanh() + '\'' +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}
