package model;

import java.util.Set;

public class Alarm {

    private int id;
    private String name;
    private int hour;
    private int minute;
    private Set<Integer> daysOfWeek;
    private boolean enabled;
    private String soundName;
    private int volume;
    private String category;
    private int snoozeMinutes;
    private int maxSnoozes;
    private int snoozesUsed;
    private boolean circadianEnabled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Set<Integer> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(Set<Integer> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getSoundName() {
        return soundName;
    }

    public void setSoundName(String soundName) {
        this.soundName = soundName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSnoozeMinutes() {
        return snoozeMinutes;
    }

    public void setSnoozeMinutes(int snoozeMinutes) {
        this.snoozeMinutes = snoozeMinutes;
    }

    public int getMaxSnoozes() {
        return maxSnoozes;
    }

    public void setMaxSnoozes(int maxSnoozes) {
        this.maxSnoozes = maxSnoozes;
    }

    public int getSnoozesUsed() {
        return snoozesUsed;
    }

    public void setSnoozesUsed(int snoozesUsed) {
        this.snoozesUsed = snoozesUsed;
    }

    public boolean isCircadianEnabled() {
        return circadianEnabled;
    }

    public void setCircadianEnabled(boolean circadianEnabled) {
        this.circadianEnabled = circadianEnabled;
    }

    public boolean isActive() {
        return enabled;
    }

    public void activate() {
        this.enabled = true;
    }

    public void deactivate() {
        this.enabled = false;
    }

    public boolean matchesTimeAndDay(int hour, int minute, int dayOfWeek) {
        return false;
    }

    public boolean canSnooze() {
        return false;
    }

    public void registerSnooze() {
    }

    public void resetSnooze() {
        this.snoozesUsed = 0;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hour=" + hour +
                ", minute=" + minute +
                ", daysOfWeek=" + daysOfWeek +
                ", enabled=" + enabled +
                ", soundName='" + soundName + '\'' +
                ", volume=" + volume +
                ", category='" + category + '\'' +
                ", snoozeMinutes=" + snoozeMinutes +
                ", maxSnoozes=" + maxSnoozes +
                ", snoozesUsed=" + snoozesUsed +
                ", circadianEnabled=" + circadianEnabled +
                '}';
    }
}
