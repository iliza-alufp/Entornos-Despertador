package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import model.Alarm;

public class AlarmService {

    private List<Alarm> alarms;
    private boolean vacationMode;
    private int totalSnoozes;
    private int onTimeStops;
    private int lateStops;

    public AlarmService() {
        this.alarms = new ArrayList<>();
    }

    public Alarm createAlarm(String name, int hour, int minute, Set<Integer> days, String soundName, int volume, String category) {
        return null;
    }

    public boolean deleteAlarm(int id) {
        return false;
    }

    public boolean enableAlarm(int id) {
        return false;
    }

    public boolean disableAlarm(int id) {
        return false;
    }

    public boolean updateTime(int id, int hour, int minute) {
        return false;
    }

    public boolean updateName(int id, String name) {
        return false;
    }

    public boolean updateDays(int id, Set<Integer> days) {
        return false;
    }

    public boolean updateSound(int id, String soundName, int volume) {
        return false;
    }

    public boolean updateCategory(int id, String category) {
        return false;
    }

    public List<Alarm> getActiveAlarms() {
        return new ArrayList<>();
    }

    public List<Alarm> getNextAlarms() {
        return new ArrayList<>();
    }

    public List<Alarm> getDueAlarms(int hour, int minute, int dayOfWeek) {
        return new ArrayList<>();
    }

    public void setVacationMode(boolean enabled) {
        this.vacationMode = enabled;
    }

    public boolean isVacationMode() {
        return vacationMode;
    }

    public List<String> detectConflicts() {
        return new ArrayList<>();
    }

    public void registerAlarmStop(Alarm alarm, boolean onTime) {
    }

    public void registerSnooze(Alarm alarm) {
    }

    public String getSleepStatistics() {
        return "";
    }
}
