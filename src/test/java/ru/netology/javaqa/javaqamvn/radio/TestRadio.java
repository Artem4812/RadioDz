package ru.netology.javaqa.javaqamvn.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);

        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioStationIfMinus() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-4);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 5;
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSwitchForwardRadioStation() {
        Radio radio = new Radio();
        radio.nextRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchForwardRadioStation() {
        Radio radio = new Radio();
        radio.currentRadioStation = 9;
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchBackRadioStation() {
        Radio radio = new Radio();
        radio.currentRadioStation = 9;
        radio.prevRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToLastRadioStation() {
        Radio radio = new Radio();
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}

