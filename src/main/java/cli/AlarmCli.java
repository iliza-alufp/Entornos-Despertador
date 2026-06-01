package cli;

import java.util.Scanner;
import service.AlarmService;

public class AlarmCli {

    private AlarmService alarmService;
    private Scanner scanner;

    public AlarmCli(AlarmService alarmService, Scanner scanner) {
        this.alarmService = alarmService;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            showMenu();
            String option = scanner.nextLine();
            if ("0".equals(option)) {
                break;
            }
            switch (option) {
                case "1" -> createAlarmMenu();
                case "2" -> deleteAlarmMenu();
                case "3" -> listAlarmsMenu();
                case "4" -> simulateTimeMenu();
                case "5" -> toggleVacationModeMenu();
                case "6" -> showSleepStatsMenu();
                case "7" -> showConflictsMenu();
                default -> {
                }
            }
        }
    }

    private void showMenu() {
        System.out.println("=== Sistema de Alarmas ===");
        System.out.println("1. Crear alarma");
        System.out.println("2. Eliminar alarma");
        System.out.println("3. Listar alarmas");
        System.out.println("4. Simular hora");
        System.out.println("5. Alternar modo vacaciones");
        System.out.println("6. Mostrar estadísticas de sueño");
        System.out.println("7. Mostrar conflictos");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void createAlarmMenu() {
        System.out.println("Función crear alarma");
    }

    private void deleteAlarmMenu() {
        System.out.println("Función eliminar alarma");
    }

    private void listAlarmsMenu() {
        System.out.println("Función listar alarmas");
    }

    private void simulateTimeMenu() {
        System.out.println("Función simular hora");
    }

    private void toggleVacationModeMenu() {
        System.out.println("Función alternar modo vacaciones");
    }

    private void showSleepStatsMenu() {
        System.out.println("Función mostrar estadísticas de sueño");
    }

    private void showConflictsMenu() {
        System.out.println("Función mostrar conflictos");
    }

    public static void main(String[] args) {
        AlarmService alarmService = new AlarmService();
        Scanner scanner = new Scanner(System.in);
        AlarmCli cli = new AlarmCli(alarmService, scanner);
        cli.start();
    }
}
