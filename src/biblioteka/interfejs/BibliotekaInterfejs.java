package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaInterfejs {

	public void dodajKnjigu(Knjiga knjiga); //najbolje da ubacujemo ceo objekat da ne moramo da menjamo strukturu
	
	public void obrisiKnjigu(Knjiga knjiga);
	
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, long ISBN, String izdavac, Autor autor);
	//ako znamo samo neke podatke, ako nesto ne znamo ostavimo prazno i pretrazujemo po onome sto znamo
	
}
