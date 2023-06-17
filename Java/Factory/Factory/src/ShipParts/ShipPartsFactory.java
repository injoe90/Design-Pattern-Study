package ShipParts;

/*
* 추상 팩토리
* */
public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}
