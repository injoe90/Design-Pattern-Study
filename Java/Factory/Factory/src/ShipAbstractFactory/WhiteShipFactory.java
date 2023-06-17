package ShipAbstractFactory;

import Ship.*;
import ShipParts.*;

public class WhiteShipFactory extends DefaultShipFactory {
    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public ShipEx createShip() {
        ShipEx ship = new WhiteShipEx();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
