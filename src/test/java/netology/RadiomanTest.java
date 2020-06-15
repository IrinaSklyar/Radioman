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
        radio.setCurrentRadioStation(8);
        radio.turnNextRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnNextIfCurrentIsLastStation() {
        // проверка выхода за границу валидных значений
        radio.setLastRadioStation(9);
        radio.setFirstRadioStation(0);
        radio.setCurrentRadioStation(9);
        radio.turnNextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnPreviousRadioStation() {
        // проверка валидных значений
        radio.setLastRadioStation(9);
        radio.setFirstRadioStation(0);
        radio.setCurrentRadioStation(7);
        radio.turnPreviousRadioStation();
        int expected = (6);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnPrevIfCurrentIsCloseToLast() {
        // проверка граничных значений
        radio.setLastRadioStation(9);
        radio.setFirstRadioStation(0);
        radio.setCurrentRadioStation(1);
        radio.turnPreviousRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnPrevIfCurrentIsLast() {
        // проверка выхода за границу валидных значений
        radio.setLastRadioStation(9);
        radio.setFirstRadioStation(0);
        radio.setCurrentRadioStation(0);
        radio.turnPreviousRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void turnUpVolume() {
        // проверка валидных значений
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.turnUpVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void turnUpVolumeIsMax() {
        // проверка выхода за границу валидных значений
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.turnUpVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void turnDownVolume() {
        // проверка валидных значений
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
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
        radio.setLastRadioStation(9);
        radio.setFirstRadioStation(0);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationIsOutOfValue() {
        // проверка невалидных значений
        radio.chooseCurrentRadioStation(-5);
        radio.setLastRadioStation(9);
        radio.setFirstRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
}


