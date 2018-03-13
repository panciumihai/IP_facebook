package Lab4.src;

import java.util.ArrayList;

public class Utilizator
    private int numarPrieteni;
    ArrayList <Persoana> prieteni = new ArrayList<Persoana>();
    Pagina pagina = new Pagina();

    public void adaugarePrieteni(Prieten prieten)
    {
        prieteni.add(prieten);
    }

    public void modificareDate()
    {
    }
}
