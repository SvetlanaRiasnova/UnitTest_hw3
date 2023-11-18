package seminars.third.hw;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
//Проверяем четное число, ожидаем true
    @org.junit.jupiter.api.Test
    void checkEvenNumber() {
        assertTrue(MainHW.evenOddNumber(14));
    }

//Проверяем нечетное число, ожидаем false
    @org.junit.jupiter.api.Test
    void checkOddNumber() {
        assertFalse(MainHW.evenOddNumber(15));
    }

//Проверяем число, входящее в заданный интервал, ожидаем true
    @org.junit.jupiter.api.Test
    void checkNumberInInterval() {
        assertTrue(MainHW.numberInInterval(40));
    }

//Проверяем число, не входящее в заданный интервал, ожидаем false
    @org.junit.jupiter.api.Test
    void checkNumberNotInInterval() {
        assertFalse(MainHW.numberInInterval(20));
    }


}