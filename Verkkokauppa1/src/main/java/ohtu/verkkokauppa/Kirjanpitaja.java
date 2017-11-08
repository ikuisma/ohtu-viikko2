package ohtu.verkkokauppa;

import java.util.ArrayList;

/**
 * Created by ikuisma on 08/11/2017.
 */
public interface Kirjanpitaja {
    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
