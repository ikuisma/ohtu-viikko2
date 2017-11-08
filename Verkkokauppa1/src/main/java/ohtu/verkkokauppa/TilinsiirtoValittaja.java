package ohtu.verkkokauppa;

/**
 * Created by ikuisma on 08/11/2017.
 */
public interface TilinsiirtoValittaja {

    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);

}
