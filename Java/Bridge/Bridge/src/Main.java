import Champion.*;
import Skin.KDA;
import Skin.PoolParty;

public class Main {
    public static void main(String[] args) {
        Champion kdaAri = new Ari(new KDA());
        kdaAri.skillQ();
        kdaAri.skillW();

        Champion poolPartyAri = new Ari(new PoolParty());
        poolPartyAri.skillE();
        poolPartyAri.skillR();
    }
}