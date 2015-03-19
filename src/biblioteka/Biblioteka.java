package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	
	public void dodajKnjigu(Knjiga knjiga) {
		if (knjiga == null)
			throw new RuntimeException("Knjiga ne sme biti null");
		
		if (knjige.contains(knjiga))
			throw new RuntimeException("Knjiga vec postoji");
		
		knjige.add(knjiga);
	}

	public void obrisiKnjigu(Knjiga knjiga) {
		if (knjiga == null)
			throw new RuntimeException("Knjiga ne sme biti null");
		
		if (!knjige.contains(knjiga))
			throw new RuntimeException("Knjiga ne postoji");
		
		knjige.remove(knjiga);
	}

	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, long ISBN,
			String izdavac, Autor autor) {
		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();
		
		// ne moraju da se unesu svi podaci za pretragu ako ih ne znamo, mozemo i da ih ostavimo da budu null
		// ipak moramo bar jedan podatak da unesemo
		if (naslov == null && ISBN <= 0 && izdavac == null && autor == null)
			// imali smo opciju da vratimo sve knjige ili da bacimo izuzetak
			return knjige;

		if (ISBN > 0) {
			for (int i = 0; i < knjige.size(); i++) {
				if (knjige.get(i).getISBN() == ISBN)
					rezultat.add(knjige.get(i));
			}
		}
		return rezultat;
	}

}
