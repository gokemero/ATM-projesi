import java.util.Scanner;
public class proje {
    public static void main(String[] args) {
        String ad, sifre;
        Scanner input = new Scanner(System.in);
        int hak = 3;
        int bakiye = 1500;
        int secim = 0;
        while (hak > 0) {
            System.out.print("Kullanıcı adını giriniz :");
            ad = input.nextLine();
            System.out.print("Şifrenizi giriniz :");
            sifre = input.nextLine();
            if (ad.equals("gökdeniz") && sifre.equals("123456")) {
                System.out.println("Kullanıcı adı ve şifre doğru");
                break;
            } else {
                hak--;
                System.out.println("Kullanıcı adı veya şifre hatalı\n Kalan hakkınız :" + hak);
                if (hak == 0) System.out.print("3 kere hatalı girdiniz o yüzden banka hesabınız bloke edildi");
            }
        }
        while (hak > 0 && secim != 4) {
            System.out.println("Yapacağınız işlemi seçiniz :\n 1-Para yatırma\n 2-Para çekme \n 3-Bakiye sorma \n 4- Çıkış");
            secim = input.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("Yatırılıcak miktarı giriniz :");
                    int a = input.nextInt();
                    bakiye += a;
                    System.out.println("Yatırma işlemi başarılı. Yeni bakiyeniz :" + bakiye);
                    break;
                case 2:
                    System.out.print("Çekilicek para miktarını giriniz :");
                    int b = input.nextInt();
                    bakiye -= b;
                    System.out.println("Para çekme işlemi başarılı. Yeni bakiye :" + bakiye);
                    break;
                case 3:
                    System.out.println("Bakiyeniz :" + bakiye);

            }
        }
        System.out.println("Çıkış yaptınız");
    }
}
