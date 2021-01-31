public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Huỳnh Bảo Lộc");
        student.setAge(22);
        student.setAddress("Tuy Hòa");

        System.out.println("Name: " + student.getName() + ","
                        + " Age: " + student.getAge() + ","
                        + " Address: " + student.getAddress());
    }
}
