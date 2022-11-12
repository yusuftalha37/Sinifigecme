import java.util.Scanner;
public class kaldıgectı {
    public static void main(String[] args) {
        int mat,biyoliji,turkce,fizik,kimya;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        mat = input.nextInt();

        System.out.print("Biyoloji notunuz :");
        biyoliji = input.nextInt();

        System.out.print("Türkçe notunuz :");
        turkce = input.nextInt();

        System.out.print("Fizik notunuz :");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz :");
        kimya = input.nextInt();

        double atack=(mat+biyoliji+turkce+fizik+kimya)/5;
         if (atack <= 50){
         System.out.print("Sınıfta kaldınız");
         System.out.print("ORTALAMANIZ"+ atack);
         }else{
             System.out.print("Sınıfı geçtiniz"+ atack);
         }




    }
}
