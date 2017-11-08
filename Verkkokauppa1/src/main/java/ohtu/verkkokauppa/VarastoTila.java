package ohtu.verkkokauppa;

/**
 * Created by ikuisma on 08/11/2017.
 */
public interface VarastoTila {

    Tuote haeTuote(int id);

    int saldo(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);
}
