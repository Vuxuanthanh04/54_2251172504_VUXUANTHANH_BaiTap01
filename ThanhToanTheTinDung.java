public class ThanhToanTheTinDung extends ThanhToan implements IThanhToan {
    public ThanhToanTheTinDung(double soTien) {
        super("Thẻ tín dụng", soTien);
    }

    @Override
    public void thanhToan(double soTien) {
        System.out.println("Đã thanh toán " + soTien + " bằng THẺ TÍN DỤNG.");
    }

    @Override
    public void hienThi() {
        super.hienThi();
        thanhToan(soTien);
    }
}
