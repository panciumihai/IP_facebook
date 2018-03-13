package facebook_ip;


import java.util.ArrayList;

public class Utilizator extends Persoana{
    private int numarPrieteni;
    ArrayList <Utilizator> prieteni = new ArrayList<Utilizator>();
    Pagina pagina = new Pagina();

    public void adaugarePrieteni(Utilizator prieten)
    {
        prieteni.add(prieten);
    }

    public void modificareDate()
    {
    }
}
