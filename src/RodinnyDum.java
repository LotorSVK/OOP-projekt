public class RodinnyDum {
    int pocetPoschodi;
    String material;
    float rozloha;
    int pocetOken;

    public void vypocetCenyDomu(int cenaZaMeter, String menoRodiny){
        System.out.println(menoRodiny + (rozloha * cenaZaMeter * pocetPoschodi));
    }

}
