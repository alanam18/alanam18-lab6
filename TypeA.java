public class TypeA extends Thing {
    public TypeA() {
        row = 45;
        col = 50;
        lab = 'r';
    }
    public void maybeTurn() {
        int a = rand.nextInt(3);
        if (a == 1) rightTurn();
        if (a == 2) leftTurn();
    }
}
