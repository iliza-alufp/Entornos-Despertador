package util;

import java.util.HashSet;
import java.util.Set;
import model.Alarm;

public final class AlarmUtils {

    private AlarmUtils() {
    }

    public static int parseDayOfWeek(String input) {
        if (input == null) {
            return 0;
        }
        String normalized = input.trim().toLowerCase();
        switch (normalized) {
            case "lunes", "1" -> {
                return 1;
            }
            case "martes", "2" -> {
                return 2;
            }
            case "miercoles", "miércoles", "3" -> {
                return 3;
            }
            case "jueves", "4" -> {
                return 4;
            }
            case "viernes", "5" -> {
                return 5;
            }
            case "sabado", "sábado", "6" -> {
                return 6;
            }
            case "domingo", "7" -> {
                return 7;
            }
            default -> {
                return 0;
            }
        }
    }

    public static Set<Integer> parseDaysPattern(String input) {
        Set<Integer> days = new HashSet<>();
        if (input == null) {
            return days;
        }
        String normalized = input.trim().toLowerCase();
        switch (normalized) {
            case "laborables", "dias laborables", "días laborables" -> {
                days.add(1);
                days.add(2);
                days.add(3);
                days.add(4);
                days.add(5);
            }
            case "fin de semana", "fines de semana" -> {
                days.add(6);
                days.add(7);
            }
            case "todos", "todos los dias", "todos los días" -> {
                for (int day = 1; day <= 7; day++) {
                    days.add(day);
                }
            }
            default -> {
            }
        }
        return days;
    }

    public static String formatAlarm(Alarm alarm) {
        if (alarm == null) {
            return "";
        }
        return "Alarm{id=" + alarm.getId() + ", name='" + alarm.getName() + "', time=" + alarm.getHour() + ":" + alarm.getMinute() + ", enabled=" + alarm.isEnabled() + "}";
    }
}
