public class TypeB extends Thing {
    public TypeB() {
        row = 55;
        col = 50;
        lab = 'b';
    }

   
    public void maybeTurn() {
        int b = DotChaser.rand.nextInt(3);
        timeSinceLast++;
        if (timeSinceLast == 10) {
            timeSinceLast = 0;
            if (b == 1) rightTurn();
            if (b == 2) leftTurn();
        }
    }
}
