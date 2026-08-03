package com.example.smarthome;

public class Radio {
    private int currentStation;
    private int currentVolume;

    // Константы для границ
    private static final int MIN_STATION = 0;
    private static final int MAX_STATION = 9;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;

    public Radio() {
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    // --- Работа с радиостанциями ---

    public void next() {
        if (currentStation == MAX_STATION) {
            currentStation = MIN_STATION;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == MIN_STATION) {
            currentStation = MAX_STATION;
        } else {
            currentStation--;
        }
    }

    public void setCurrentStation(int station) {
        if (station < MIN_STATION || station > MAX_STATION) {
            return; // игнорируем недопустимое значение
        }
        this.currentStation = station;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    // --- Работа с громкостью ---

    public void increaseVolume() {
        if (currentVolume < MAX_VOLUME) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > MIN_VOLUME) {
            currentVolume--;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            return; // игнорируем недопустимое значение
        }
        this.currentVolume = volume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}