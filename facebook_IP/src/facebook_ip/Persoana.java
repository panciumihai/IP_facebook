package facebook_ip;

public class Persoana {
    private String nume = "";
    private String prenume = "";
    private String email = "";
    private String parola = "";
    private String detalii = "";

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public String getParola() {
        return parola;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString()
    {
        String output = "Nume: " + getNume() + ", Prenume: " + getPrenume();
        return output;
    }   
}