package PruebaGit;

public class Factory {

    public static Cake getCake(Sabor sabor){

        switch (sabor){
            case STRAWBERRY:
                return new StrawBerryCake();
            case CHOCOLATE:
                return new ChocolateCake();

        }return null;
    }
}
