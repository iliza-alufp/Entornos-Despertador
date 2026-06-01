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
        List<Alarm> dueAlarms = new ArrayList<>();
        if (vacationMode) {
            return dueAlarms;
        }
        for (Alarm alarm : alarms) {
            if (alarm != null && alarm.isActive() && alarm.matchesTimeAndDay(hour, minute, dayOfWeek)) {
                dueAlarms.add(alarm);
            }
        }
        return dueAlarms;
    }

    public void setVacationMode(boolean enabled) {
        this.vacationMode = enabled;
    }

    public boolean isVacationMode() {
        return vacationMode;
    }

    public List<String> detectConflicts() {
        List<String> conflicts = new ArrayList<>();
        for (int i = 0; i < alarms.size(); i++) {
            Alarm first = alarms.get(i);
            if (first == null || first.getDaysOfWeek() == null) {
                continue;
            }
            for (int j = i + 1; j < alarms.size(); j++) {
                Alarm second = alarms.get(j);
                if (second == null || second.getDaysOfWeek() == null) {
                    continue;
                }
                if (first.getHour() == second.getHour() && first.getMinute() == second.getMinute()) {
                    for (Integer day : first.getDaysOfWeek()) {
                        if (day != null && second.getDaysOfWeek().contains(day)) {
                            conflicts.add("Conflicto entre alarma " + first.getId() + " y alarma " + second.getId() + " en hora " + first.getHour() + ":" + first.getMinute() + " día " + day);
                            break;
                        }
                    }
                }
            }
        }
        return conflicts;
    }

    public void registerAlarmStop(Alarm alarm, boolean onTime) {
    }

    public void registerSnooze(Alarm alarm) {
        if (alarm == null) {
            return;
        }
        if (alarm.getSnoozesUsed() >= alarm.getMaxSnoozes()) {
            return;
        }
        alarm.setSnoozesUsed(alarm.getSnoozesUsed() + 1);
        totalSnoozes++;
    }

    public String getSleepStatistics() {
        return "Estadísticas de sueño:\n" +
                "- Total de repetidas: " + totalSnoozes + "\n" +
                "- Paradas a tiempo: " + onTimeStops + "\n" +
                "- Paradas tardías: " + lateStops;
    }
}
