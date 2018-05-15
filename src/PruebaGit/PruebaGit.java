package PruebaGit;

public class PruebaGit {

    public static void main(String args[]){

        Cake StrawberryCake= Factory.getCake(Sabor.STRAWBERRY);
        Cake ChocolateCake= Factory.getCake(Sabor.CHOCOLATE);

        StrawberryCake.sayType();
        ChocolateCake.sayType();



     }
}
