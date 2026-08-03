package com.example.smarthome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStationFrom0To8() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentStation(5);
        radio.next();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void nextStationFrom9To0() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStationFrom9To8() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentStation(9);
        radio.prev();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void prevStationFrom0To9() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void setStationValid() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentStation(3);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void setStationInvalidTooLow() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void setStationInvalidTooHigh() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void increaseVolumeFrom0To50() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeAtMax() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeFrom100To50() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeAtMin() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setVolumeValid() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentVolume(75);
        assertEquals(75, radio.getCurrentVolume());
    }

    @Test
    void setVolumeInvalidTooLow() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentVolume(-5);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setVolumeInvalidTooHigh() {
        Radio radio = new Radio(10); // Было: new Radio()
        radio.setCurrentVolume(105);
        assertEquals(0, radio.getCurrentVolume());
    }
}