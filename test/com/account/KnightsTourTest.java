package com.account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightsTourTest {
    KnightsTour knight;

    @BeforeEach
    void setUp() {
        knight = new KnightsTour();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void knightTest(){
        int[] horizontal = {2,2,1,-2,1,1,2,-1};
        int[] vertical ={1,-1,2,1,2,-2,1,2};
        knight.moveKnight(horizontal,vertical);
        knight.boardArray();
    }
}