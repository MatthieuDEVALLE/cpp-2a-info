package network;

import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

import core.Joueur;
import core.Marche;

public class Partie {
	private final Marche marche;
	private final List<Socket> liste_client;

	public Partie() {
		marche = new Marche();
		liste_client = new LinkedList<>();
	}

	public List<Socket> getListe_client() {
		return liste_client;
	}
	
	public Joueur ajouter_client(Socket s, String nom){
		liste_client.add(s);
		return marche.creer_joueur(nom);
	}

	public Marche getMarche() {
		return marche;
	}

	@Override
	public String toString() {
		return "Partie [marche=" + marche + ", liste_client=" + liste_client + "]";
	}
}