public class Tank {
    int positionx;
    int positiony;
    int turn;
    int fuel= 100;

    public  Tank () {}

    public  Tank (int positionx, int positiony ) {
        this.positionx = positionx;
        this.positiony = positiony;
    }
    public  Tank (int positionx, int positiony, int fuel){
        this.positionx = positionx;
        this.positiony = positiony;
        this.fuel =fuel;
    }
    public void goForward(int goForward) {
        if (fuel - goForward < 0 ) {
            goForward = fuel;
            fuel = 0;
        } else {
            fuel = fuel - goForward;
        }
        if (turn == 0) {
            positionx += goForward;
        } else if (turn == 1) {
            positiony += goForward;
        } else if (turn == 2) {
            positionx -= goForward;
        } else {
            positiony -= goForward;
        }
    }
    public void printPosition() {
        System.out.println("The Tank is at " + positionx + ", " + positiony + " now.");
    }
    public  void turnRight () {
        turn++;
        if (turn ==4 )
            turn = 0;
    }
    public void turnLeft () {
        turn--;
        if (turn == -1)
            turn = 3;
    }
    public void goBackward (int i) {
        goForward(- i);
    }
}
