public class TypeC extends Thing {
    private boolean zigLeft = true;

    public TypeC() {
        row = 50;
        col = 60;
        lab = 'y';
    }

    public void maybeTurn() {
        if (zigLeft) {
            leftTurn();
        } else {
            rightTurn();
        }
        zigLeft = !zigLeft;
    }
}
