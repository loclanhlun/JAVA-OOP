package javatotural;

public class NewsPaper  extends  Document{

    private String ngayPhatHanh;
    public NewsPaper(String maTaiLieu, String tenNXB, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }



    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "NewsPaper{" +
                "Mã tài liệu='" + getMaTaiLieu() + '\'' +
                "Nhà xuất bản='" + getTenNXB() + '\'' +
                "số bản in='" + getSoBanPhatHanh() + '\'' +
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                '}';
    }

}
