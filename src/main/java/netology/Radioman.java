package netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radioman {
    private int currentRadioStation;
    private int firstRadioStation = 0;
    private int lastRadioStation = 10;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public void turnNextRadioStation() {
        if (currentRadioStation == lastRadioStation) {
            currentRadioStation = firstRadioStation;
        } else {
            currentRadioStation++;
        }
    }

    public void turnPreviousRadioStation() {
        if (currentRadioStation == firstRadioStation) {
            currentRadioStation = lastRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void turnUpVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void turnDownVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    public void chooseCurrentRadioStation(int newStation) {
        if (newStation > lastRadioStation) {
            return;
        }
        if (newStation < firstRadioStation) {
            return;
        }
        this.currentRadioStation = newStation;
    }
}