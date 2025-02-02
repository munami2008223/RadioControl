package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void TestStationValidValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestStationMinimumValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestStationMoreThanTheMinimum() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestStationLessThanMaximum() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestStationMaximumValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestStationGreaterThanMaximumValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestStationLessThanMinimum() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestStationInvalidNegativeValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-34);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestStationInvalidPositiveValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(25);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextStationValidValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);
        radio.next();

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextStationMinimumValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextStationMoreThanTheMinimum() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextStationLessThanMaximum() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextStationMaximumValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevStationValidValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);
        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevStationMinimumValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevStationMoreThanTheMinimum() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevStationLessThanMaximum() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevStationMaximumValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestVolumeValidValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(25);

        int expected = 25;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestVolumeMinimumValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestVolumeMoreThanTheMinimum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestVolumeLessThanMaximum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestVolumeMaximumValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestVolumeGreaterThanMaximumValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestVolumeLessThanMinimum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestVolumeInvalidNegativeValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-34);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestVolumeInvalidPositiveValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(174);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextVolumeValidValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(25);
        radio.increaseVolume();

        int expected = 26;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextVolumeMinimumValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextVolumeMoreThanTheMinimum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextVolumeLessThanMaximum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextVolumeMaximumValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevVolumeValidValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(25);
        radio.reduceVolume();

        int expected = 24;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevVolumeMinimumValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevVolumeMoreThanTheMinimum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevVolumeLessThanMaximum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.reduceVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevVolumeMaximumValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
