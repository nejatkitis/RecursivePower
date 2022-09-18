import java.util.Scanner;

public class Curse {
    static int power(int a,int b){
      if (b>0) {
          int r = 1;
          for (int i = 1; i <= b; i++) {
              r *= a;
          }
          return r;
      } else
          return 1;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Üslü Sayı Programı");
        System.out.print("Lütlen ilk sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        b = input.nextInt();
        System.out.println(power(a,b));
    }
}
