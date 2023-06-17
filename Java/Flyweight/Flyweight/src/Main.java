import Extrinsit.Character;
import Intrinsit.FontFactory;

public class Main {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character character1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character character2 = new Character('e', "blue", fontFactory.getFont("nanum:12"));
        Character character3 = new Character('l', "red", fontFactory.getFont("nanum:12"));
    }
}