import java.util.Scanner;

public class sntList {
    public static void main(String[] args) {
        GetListSnt listSnt = new GetListSnt();
        listSnt.nhapN();
        listSnt.SntBeHonN();
        listSnt.in();
    }

}


class Snt {
    //khai bao thuoc tinh
    int soNguyen;

    //khai bao phuong thuc
    public void nhapSoNguyen(int number) {
        soNguyen = number;
    }

    public boolean checkSnt() {
        if (soNguyen < 2) {
            return false;
        }
        for (int i = 2; i < soNguyen; i++) {
            if (soNguyen % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void in() {
        if (checkSnt()) System.out.println(soNguyen + " la so nguyen to");
        else System.out.println(soNguyen + "khong phai la so nguyen to");
    }
}

class GetListSnt {
    //khai bao thuoc tinh
    boolean hopLe = true;
    int n;
    Snt SoNguyenTo;
    ArrayListInt listSoNguyenTo = new ArrayListInt();

    //khai bao phuong thuc
    public void nhapN() {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap N : ");

        try {
            number = input.nextInt();
            n = number;
        } catch (Exception e) {
            System.out.println("du lieu khong hop le");
            hopLe = false;
        }

    }

    public void SntBeHonN() {
        // xet tinh hop le cua so nguyen n nhap vao
        if (!hopLe) return;

        // kiem tra sont  < n
        int j = 0;
        for (int i = 1; i < n; i++) {
            SoNguyenTo = new Snt();
            SoNguyenTo.nhapSoNguyen(i);
            if (SoNguyenTo.checkSnt()) {
                listSoNguyenTo.addLastElement(i);
                j++;
            }
            ;
        }
    }

    public void in() {
        System.out.println("Day so nguyen to be hon " + n + " la:\n");
        for (int i = 0; i < listSoNguyenTo.array_list.length; i++) {
            System.out.println(listSoNguyenTo.array_list[i] + "\n");
        }
    }
}

class ArrayListInt {
    //khai bao thuoc tinh
    int array_list[] = new int[0];

    // khai bao phuong thuc
    void in(int array[]) {
        array_list = array;
    }

    void addLastElement(int number) {
        int lengArrayOld = array_list.length;
        int lengArrayNew = lengArrayOld + 1;

        int arrayNew[] = new int[lengArrayNew];
        for (int i = 0; i < lengArrayOld; i++) {
            arrayNew[i] = array_list[i];
        }
        arrayNew[lengArrayNew - 1] = number;
        array_list = arrayNew;

    }


}


