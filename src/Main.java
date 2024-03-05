import java.util.Scanner;

public class Main {
    //Polindrom Methotu
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    //Kullanıcı Girişi ve Polindrom Sonuç Çıktısı
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Polindrom Kontrolü için bir Kelime Giriniz: ");
        String str = input.nextLine();
        //System.out.println(isPalindrome(str));
        if (isPalindrome(str) == true){
            System.out.println("Girilen Kelime Polindromdur");
        }else{
            System.out.println("Girilen Kelime Polindrom Değildir");
        }
    }
}