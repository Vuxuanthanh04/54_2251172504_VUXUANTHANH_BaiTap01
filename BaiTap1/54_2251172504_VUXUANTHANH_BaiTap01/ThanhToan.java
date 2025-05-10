public class ThanhToan {
    protected String phuongThuc;
    protected double soTien;

    public ThanhToan(String phuongThuc, double soTien) {
        this.phuongThuc = phuongThuc;
        this.soTien = soTien;
    }

    public void hienThi() {
        System.out.println("Phương thức: " + phuongThuc);
        System.out.println("Số tiền: " + soTien);
    }
}
