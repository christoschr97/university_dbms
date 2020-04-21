package sample;

import java.util.Date;

public class StudyRoom extends Hall{

    private boolean isOpen;
    private int openHour;
    private int closeHour;

    public StudyRoom(int seats, String location, String name) {
        super(seats, location, name);
        isOpen = true;
        openHour = 9;
        closeHour = 21;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getOpenHour() {
        return openHour;
    }

    public void setOpenHour(int openHour) {
        this.openHour = openHour;
    }

    public int getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(int closeHour) {
        this.closeHour = closeHour;
    }
}
