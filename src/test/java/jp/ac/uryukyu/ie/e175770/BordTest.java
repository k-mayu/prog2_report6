package jp.ac.uryukyu.ie.e175770;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BordTest {

    @Test
    void judge() {
        /**
         *配列に何も入っていないときnullを返す
         */
        Bord bord = new Bord();
        assertEquals(null,bord.judge());
    }
}