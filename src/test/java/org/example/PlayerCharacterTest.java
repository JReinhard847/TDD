package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void getXShouldStartAs0() {
        //GIVEN
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        //WHEN
        int x = PlayerCharacter.getX();
        //THEN
        assertEquals(0, x);
    }

    @Test
    void getYShouldStartAs0() {
        //GIVEN
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        //WHEN
        int x = PlayerCharacter.getY();
        //THEN
        assertEquals(0, x);
    }

    @Test
    void wShouldMoveUp() {
        //GIVEN
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        String movement = "W";
        //WHEN
        PlayerCharacter.move(movement);
        int resultY = PlayerCharacter.getY();
        //THEN
        assertEquals(1, resultY);
    }

    @Test
    void sShouldMoveDown() {
        //GIVEN
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        String movement = "S";
        //WHEN
        PlayerCharacter.move(movement);
        int resultY = PlayerCharacter.getY();
        //THEN
        assertEquals(-1, resultY);
    }

    @Test
    void aShouldMoveLeft() {
        //GIVEN
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        String movement = "A";
        //WHEN
        PlayerCharacter.move(movement);
        int resultX = PlayerCharacter.getX();
        //THEN
        assertEquals(-1, resultX);
    }

    @Test
    void dShouldMoveRight() {
        //GIVEN
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        String movement = "D";
        //WHEN
        PlayerCharacter.move(movement);
        int resultX = PlayerCharacter.getX();
        //THEN
        assertEquals(1, resultX);
    }

}