package ShipAbstractFactory;

import Ship.*;

public abstract class DefaultShipFactory implements ShipFactory{
    public abstract ShipEx createShip();
}
