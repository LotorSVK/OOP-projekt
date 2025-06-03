import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Random nahCislo = new Random();

        RodinnyDum dumNovaku = new RodinnyDum();
        dumNovaku.pocetPoschodi = 4;
        dumNovaku.rozloha = 457f;
        dumNovaku.material = "mramor";
        dumNovaku.vypocetCenyDomu();


        RodinnyDum dumZajacov = new RodinnyDum();
        dumZajacov.pocetPoschodi = 3;
        dumZajacov.rozloha = 6468f;
        dumZajacov.vypocetCenyDomu();

    }
}