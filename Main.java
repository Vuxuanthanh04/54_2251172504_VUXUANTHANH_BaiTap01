import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền cần thanh toán: ");
        double soTien = scanner.nextDouble();
        scanner.nextLine(); // clear buffer

        System.out.print("Chọn phương thức thanh toán (tienmat/the): ");
        String luaChon = scanner.nextLine();

        ThanhToan tt;

        if (luaChon.equalsIgnoreCase("tienmat")) {
            tt = new ThanhToanTienMat(soTien);
        } else {
            tt = new ThanhToanTheTinDung(soTien);
        }

        System.out.println("\n--- Thông tin thanh toán ---");
        tt.hienThi();

        scanner.close();
    }
}
