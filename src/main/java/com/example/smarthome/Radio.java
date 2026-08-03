package com.example.smarthome;

import lombok.Getter;

@Getter
public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int maxStations; // final: нельзя менять после создания

    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;

    // Единственный конструктор с логикой валидации
    public Radio(int maxStations) {
        if (maxStations <= 0) {
            this.maxStations = 10;
        } else {
            this.maxStations = maxStations;
        }
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    public void next() {
        if (currentStation == maxStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = maxStations - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentStation(int station) {
        if (station < 0 || station >= maxStations) {
            return;
        }
        this.currentStation = station;
    }

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
            return;
        }
        this.currentVolume = volume;
    }
}