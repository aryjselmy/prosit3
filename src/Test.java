import java.util.Scanner;
public class Test {
   //static int nbrCages = 20;
   //static String zooName = "my zoo";
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nombre de cage : ");
        int nbrCages = sc.nextInt();
        if(nbrCages < 1 || nbrCages > 100){
            System.out.println("Le nombre de cage est incorrecte");
        }else {
        System.out.println("Donner le nom du zoo : ");
        String zooName = sc.next();
        if(zooName.length() < 1){
            System.out.println("Le nom de zoo est incorrecte");
        }else {
            System.out.println(zooName + " comporte " + nbrCages + " cages");
        }}
        //
}}
