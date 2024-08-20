package org.example;

public class PlayerCharacter {
    static int x = 0;
    static int y = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void move(String movement) {
        if (movement.equals("W")) {
            y = y + 1;
        } else if (movement.equals("S")) {
            y = y - 1;
        } else if (movement.equals("A")) {
            x = x - 1;
        } else if (movement.equals("D")) {
            x = x + 1;
        }
    }
}
