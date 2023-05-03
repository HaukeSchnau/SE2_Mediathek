import org.junit.Test;

import static org.junit.Assert.*;

public class VideospielTest {

    private static final String KOMMENTAR = "Kommentar";

    private static final String TITEL = "Titel";

    private static final String SYSTEM = "System";

    private static final String VIDEOSPIEL_BEZEICHNUNG = "Videospiel";

    private Videospiel _videospiel1;

    private Videospiel _videospiel2;

    public VideospielTest() {
        _videospiel1 = getMedium();
        _videospiel2 = getMedium();
    }

    @Test
    public void testGetMedienBezeichnung() {
        String videospielBezeichnung = VIDEOSPIEL_BEZEICHNUNG;
        assertEquals(videospielBezeichnung, _videospiel1.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor() {
        assertEquals(TITEL, _videospiel1.getTitel());
        assertEquals(KOMMENTAR, _videospiel1.getKommentar());
        assertEquals(SYSTEM, _videospiel1.getSystem());
    }

    @Test
    /*
     * Von ein und dem selben Videospiel kann es mehrere Exemplare geben, die von
     * unterschiedlichen Personen ausgeliehen werden können.
     */
    public void testEquals() {
        assertFalse("Mehrere Exemplare des gleichen Videospiels sollten ungleich sein",
                _videospiel1.equals(_videospiel2));
        assertTrue("Dasselbe Exemplare des gleichen Videospiels sollte gleich sein",
                _videospiel1.equals(_videospiel2));
    }

    @Test
    public void testGetFormatiertenString() {
        String formatierterString = VIDEOSPIEL_BEZEICHNUNG + ":\n" + "    " + "Titel: " + TITEL + "\n" + "    "
                + "Kommentar: " + KOMMENTAR + "\n" + "    " + "System: " + SYSTEM + "\n";
        assertEquals(formatierterString, _videospiel1.getFormatiertenString());
    }

    private Videospiel getMedium() {
        return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }

}
