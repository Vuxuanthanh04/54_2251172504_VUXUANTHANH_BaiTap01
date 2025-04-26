public class ThanhToanTienMat extends ThanhToan implements IThanhToan {
    public ThanhToanTienMat(double soTien) {
        super("Tiền mặt", soTien);
    }

    @Override
    public void thanhToan(double soTien) {
        System.out.println("Đã thanh toán " + soTien + " bằng TIỀN MẶT.");
    }

    @Override
    public void hienThi() {
        super.hienThi();
        thanhToan(soTien);
    }
}
