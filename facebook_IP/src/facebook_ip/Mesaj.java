/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook_ip;

/**
 *
 * @author Mihai
 */
public class Mesaj {
	private String continut;
	Utilizator expeditor = new Utilizator();
	Utilizator destinatar = new Utilizator();
	
	@Override
	public String toString() {
		return continut;
	}
	public Utilizator getExpeditor() {
		return expeditor;
	}
	public void setExpeditor(Utilizator expeditor) {
		this.expeditor = expeditor;
	}
	public Utilizator getDestinatar() {
		return destinatar;
	}
	public void setDestinatar(Utilizator destinatar) {
		this.destinatar = destinatar;
	}
	public String getContinut() {
		return continut;
	}
	public void setContinut(String continut) {
		this.continut = continut;
	}
	
        public String trimitereMesaj(String continut) {
		return continut.toString();
	}
	
	public String primireMesaj(String continut) {
		return continut.toString();
	}
	
}