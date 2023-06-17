/*import Ship.*;
import ShipFactory.BlackShipFactory;
import ShipFactory.ShipFactory;*/
import Ship.ShipEx;
import ShipAbstractFactory.*;
import ShipParts.WhiteShipPartsFactory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        /*Ship whieship = new WhiteShipFactory().orderShip("WhiteShip", "whiteship@mail.com");
        System.out.println(whieship);

        Ship blackship = new BlackShipFactory().orderShip("BlackShip", "blackship@mail.com");
        System.out.println(blackship);*/

        /*client.print(new WhiteShipFactory(), "WhiteShip", "whiteship@mail.com");
        client.print(new BlackShipFactory(), "BlackShip", "blackship@mail.com");*/

        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        ShipEx ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }

    /*private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }*/
}
