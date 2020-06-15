package netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    Radioman radio = new Radioman();

    @Test
    void turnNextRadioStation() {
        // проверка валидных значений
        radio.setCurrentRadioStation(5);
        radio.turnNextRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnNextIfCurrentIsCloseToLastStation() {
        //проверка граничных значений
        radio.setCurrentRadioStation(9);
        radio.turnNextRadioStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnNextIfCurrentIsLastStation() {
        // проверка выхода за границу валидных значений
        radio.setCurrentRadioStation(10);
        radio.turnNextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnPreviousRadioStation() {
        // проверка валидных значений
        radio.setCurrentRadioStation(6);
        radio.turnPreviousRadioStation();
        int expected = (5);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnPrevIfCurrentIsCloseToLast() {
        // проверка граничных значений
        radio.setCurrentRadioStation(1);
        radio.turnPreviousRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnPrevIfCurrentIsLast() {
        // проверка выхода за границу валидных значений
        radio.setCurrentRadioStation(0);
        radio.turnPreviousRadioStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnUpVolume() {
        // проверка валидных значений
        radio.setCurrentVolume(55);
        radio.turnUpVolume();
        int expected = 56;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void turnUpVolumeIsMax() {
        // проверка выхода за границу валидных значений
        radio.setCurrentVolume(100);
        radio.turnUpVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void turnDownVolume() {
        // проверка валидных значений
        radio.setCurrentVolume(4);
        radio.turnDownVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void turnDownVolumeIsMin() {
        // проверка выхода за границу валидных значений
        radio.setCurrentVolume(0);
        radio.turnDownVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationValidValues() {
        // проверка валидных значений
        radio.chooseCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationIsOutOfValue() {
        // проверка невалидных значений
        radio.chooseCurrentRadioStation(15);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void ifRadioStationIsNextToBoarderFigures() {
        // проверка граничных значений
        radio.chooseCurrentRadioStation(10);
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void ifRadioStationIsLowThanZero() {
        // проверка отрицательных значений
        radio.chooseCurrentRadioStation(-5);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
}