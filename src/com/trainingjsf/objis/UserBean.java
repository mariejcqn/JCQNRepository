/**
 * 
 */
package com.trainingjsf.objis;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 * @author rmalonga
 * 
 */

// Déclare le bean dans le context d el'application avec userbean comme alias
@ManagedBean(name = "userbean")
/**
 *permet de déclarer le bean en scope session
 */
@SessionScoped
public class UserBean {

	/**
	 * permet d'initialiser les propriétés du bean
	 */
	@ManagedProperty(value = "DUPOND")
	public String nom;
	@ManagedProperty(value = "NATHALIE")
	public String prenom = "MICHEL";
	@ManagedProperty(value = "12-07-76")
	public String datedenaissance;
	@ManagedProperty(value = "femme")
	public String genre;
	@ManagedProperty(value = "nat.dupond@tic.fr")
	public String email;
	public String niveaudeservice;

	/**
	 * Constructeur
	 */
	public UserBean() {

	}

	// getter et setter à mettre obligatoire

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDatedenaissance() {
		return datedenaissance;
	}

	public void setDatedenaissance(String datedenaissance) {
		this.datedenaissance = datedenaissance;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNiveaudeservice() {
		return niveaudeservice;
	}

	public void setNiveaudeservice(String niveaudeservice) {
		this.niveaudeservice = niveaudeservice;
	}

}
