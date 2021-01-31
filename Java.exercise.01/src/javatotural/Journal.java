package javatotural;

public class Journal extends Document{
    private String soPhatHanh;
    private String ngayPhatHanh;

    public Journal(String maTaiLieu, String tenNXB, int soBanPhatHanh, String soPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
        this.soPhatHanh = ngayPhatHanh;
    }



    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    @Override
    public String toString() {
        return "Journal{" +
                "Mã tài liệu='" + getMaTaiLieu() + '\'' +
                "Nhà xuất bản='" + getTenNXB() + '\'' +
                "số bản in='" + getSoBanPhatHanh() + '\'' +
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", ngayPhatHanh='" + ngayPhatHanh + '\'' +
                '}';
    }


}
