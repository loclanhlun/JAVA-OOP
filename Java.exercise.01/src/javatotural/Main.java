package javatotural;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerDocument managerDocument = new ManagerDocument();
        while (true){
            System.out.println("Nhấn 1: Thêm mới tài liệu");
            System.out.println("Nhấn 2: Xóa tài liệu");
            System.out.println("Nhấn 3: Hiển thị tài liệu");
            System.out.println("Nhấn 4: Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo");
            System.out.println("Nhấn 5: Thoát khỏi chương trình");
            String line = sc.nextLine();
            switch (line){
                case "1":
                    System.out.println("Nhấn a: Thêm sách");
                    System.out.println("Nhấn b: Thêm báo");
                    System.out.println("Nhấn c: Thêm tạp chí");
                    String line1 = sc.nextLine();
                    switch (line1){
                        case "a": {
                            System.out.println("Nhập mã: ");
                            String maTaiLieu = sc.nextLine();
                            System.out.println("Nhập tên nhà xuất bản: ");
                            String tenNXB = sc.nextLine();
                            System.out.println("Nhập số lượng bản in: ");
                            int soBanPhatHanh = sc.nextInt();
                            System.out.println("Nhập tên tác giả: ");
                            sc.nextLine();

                            String tenTacGia = sc.nextLine();
                            System.out.println("Nhập số trang: ");
                            int soTrang = sc.nextInt();
                            // thể hiện tính đa hình
                            Document books = new Books(maTaiLieu, tenNXB, soBanPhatHanh, tenTacGia, soTrang);
                            managerDocument.addDocument(books);
                            System.out.println(books.toString());
                            sc.nextLine();
                            break;
                        }
                        case "b":{

                            System.out.println("Nhập mã: ");
                            String maTaiLieu = sc.nextLine();
                            System.out.println("Nhập tên nhà xuất bản: ");
                            String tenNXB = sc.nextLine();
                            System.out.println("Nhập số lượng bản in: ");
                            int soBanPhatHanh = sc.nextInt();
                            System.out.println("Nhập ngày phát hành: ");
                            sc.nextLine();
                            String ngayPhatHanh = sc.nextLine();
                            // thể hiện tính đa hình
                            Document newsPaper = new NewsPaper(maTaiLieu,tenNXB,soBanPhatHanh,ngayPhatHanh);
                            managerDocument.addDocument(newsPaper);
                            System.out.println(newsPaper.toString());
                            sc.nextLine();
                            break;
                        }


                        case "c":{
                            System.out.println("Nhập mã: ");
                            String maTaiLieu = sc.nextLine();
                            System.out.println("Nhập tên nhà xuất bản: ");
                            String tenNXB = sc.nextLine();
                            System.out.println("Nhập số lượng bản in: ");
                            int soBanPhatHanh = sc.nextInt();
                            System.out.println("Nhập số phát hành");
                            sc.nextLine();
                            String soPhatHanh = sc.nextLine();
                            System.out.println("Nhập ngày phát hành: ");
                            String ngayPhatHanh = sc.nextLine();
                            Document journals = new Journal(maTaiLieu,tenNXB,soBanPhatHanh,soPhatHanh,ngayPhatHanh);
                            managerDocument.addDocument(journals);
                            System.out.println(journals.toString());
                            sc.nextLine();
                            break;
                        }

                    }
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    break;
            }
        }
    }
}
