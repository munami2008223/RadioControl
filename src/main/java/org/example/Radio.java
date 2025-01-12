package org.example;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation;

    public Radio() {
        this.maxRadioStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxRadioStation = stationsCount - 1;
    }


    public void next() {
        if (currentRadioStation != maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }

        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        {
            this.currentVolume = currentVolume;
        }
    }
}