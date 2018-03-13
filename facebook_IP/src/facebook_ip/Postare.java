/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook_ip;
import java.util.Vector;

/**
 *
 * @author Mihai
 */
public class Postare {
    int numarAprecieri;
    int numarComentarii;
    int numarDistribuiri;
    Vector<Comentariu> comentarii;
    
    String continut; 
    
    public Postare()
    {
        numarAprecieri=0;
        numarComentarii=0;
        numarDistribuiri=0;
    
        continut=""; 
        comentarii= new Vector<>();
    }
    
    
    public void apriecierePostare()
    {
        ++numarAprecieri;
    }
    
    public void adaugaComentariu(Comentariu c)
    {
        ++numarComentarii;
        comentarii.add(c);
    }
}
