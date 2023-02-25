import java.util.*;

/**
 * Main
 */
public class Final_project {

    static ArrayList<MiNotebok> miNoteboks = new ArrayList<>();

    public static void main(String[] args) {
        // Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
        // методы. Реализовать в java.
        // Создать множество ноутбуков.
        // Написать метод, который будет запрашивать у пользователя критерий (или
        // критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
        // Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
        // соответствующую необходимому критерию:
        // 1 - ОЗУ
        // 2 - Объем ЖД
        // 3 - Операционная система
        // 4 - Цвет …
        // Далее нужно запросить минимальные значения для указанных критериев -
        // сохранить параметры фильтрации можно также в Map.
        // Отфильтровать ноутбуки из первоначального множества и вывести проходящие по
        // условиям.

        name(miNoteboks);
        start();

    }

    public static ArrayList<MiNotebok> name(ArrayList<MiNotebok> miNoteboks) {
        MiNotebok miNotebok = new MiNotebok("ASUS-080110", 8, 1024, "Windows 10", "Красный");
        MiNotebok miNotebok1 = new MiNotebok("ASUS-160210", 16, 2048, "Windows 10", "Графит");
        MiNotebok miNotebok2 = new MiNotebok("ASUS-320211", 32, 2048, "Windows 11", "Синий");
        MiNotebok miNotebok3 = new MiNotebok("ASUS-3201L", 32, 1024, "Linux", "Черный");
        MiNotebok miNotebok4 = new MiNotebok("Samsung-160111", 16, 1024, "Windows 11", "Красный");
        MiNotebok miNotebok5 = new MiNotebok("Samsung-1601L", 16, 1024, "Linux", "Графит");
        MiNotebok miNotebok6 = new MiNotebok("Samsung-320111", 32, 1024, "Windows 11", "Синий");
        MiNotebok miNotebok7 = new MiNotebok("Samsung-3202L", 32, 2048, "Linux", "Графит");
        MiNotebok miNotebok8 = new MiNotebok("DELL-Gavno", 16, 1024, "Windows 10", "Коричневый");
        MiNotebok miNotebok9 = new MiNotebok("Unchartevice 6540", 16, 256, "Astra Linux", "Металл");

        ((Collection<MiNotebok>) miNoteboks).add(miNotebok);
        ((Collection<MiNotebok>) miNoteboks).add(miNotebok1);
        ((Collection<MiNotebok>) miNoteboks).add(miNotebok2);
        ((Collection<MiNotebok>) miNoteboks).add(miNotebok3);
        ((Collection<MiNotebok>) miNoteboks).add(miNotebok4);
        ((Collection<MiNotebok>) miNoteboks).add(miNotebok5);
        ((Collection<MiNotebok>) miNoteboks).add(miNotebok6);
        ((Collection<MiNotebok>) miNoteboks).add(miNotebok7);
        ((Collection<MiNotebok>) miNoteboks).add(miNotebok8);
        ((Collection<MiNotebok>) miNoteboks).add(miNotebok9);

        return miNoteboks;
    }

    static void start() {
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        try (Scanner scanner = new Scanner(System.in)) {
            String task = scanner.nextLine();
            switch (task) {
                case "1":
                    task1();
                    break;
                case "2":
                    task2();
                    break;
                case "3":
                    task3();
                    break;
                case "4":
                    task4();
                    break;
                default:
                    start();
                    break;
            }
        }
    }

    static void task1() {
        System.out.println("Введите цифру, соответствующую минимальному ОЗУ: 8, 16, 32");
        try (Scanner scanner = new Scanner(System.in)) {
            String task = scanner.nextLine();
            switch (task) {
                case "8":
                    filterRam(8);
                    filterRam(16);
                    filterRam(32);
                    break;
                case "16":
                    filterRam(16);
                    filterRam(32);
                    break;
                case "32":
                    filterRam(32);
                    break;
                default:
                    task1();
                    break;
            }
        }
    }

    static void task2() {
        System.out.println("Введите цифру, соответствующую минимальному ЖД: 256, 1024, 2048");
        try (Scanner scanner = new Scanner(System.in)) {
            String task = scanner.nextLine();
            switch (task) {
                case "256":
                    filterHdd(256);
                    filterHdd(1024);
                    filterHdd(2048);
                    break;
                case "1024":
                    filterHdd(1024);
                    filterHdd(2048);
                    break;
                case "2048":
                    filterHdd(2048);
                    break;
                default:
                    task2();
                    break;
            }
        }
    }

    static void task3() {
        System.out.println("Введите цифру, соответствующую необходимой ОС:");
        System.out.println("1 - Windows 10");
        System.out.println("2 - Windows 11");
        System.out.println("3 - Linux");
        System.out.println("4 - Astra Linux");
        try (Scanner scanner = new Scanner(System.in)) {
            String task = scanner.nextLine();
            switch (task) {
                case "1":
                    task = "Windows 10";
                    filterOperatingSystem(task);
                    break;
                case "2":
                    task = "Windows 11";
                    filterOperatingSystem(task);
                    break;
                case "3":
                    task = "Linux";
                    filterOperatingSystem(task);
                    break;
                case "4":
                    task = "Astra Linux";
                    filterOperatingSystem(task);
                    break;
                default:
                    task3();
                    break;
            }
        }
    }

    static void task4() {
        System.out.println("Введите цифру, соответствующую необходимому цвету:");
        System.out.println("1 - Красный");
        System.out.println("2 - Синий");
        System.out.println("3 - Графит");
        System.out.println("4 - Коричневый");
        System.out.println("5 - Металл");
        try (Scanner scanner = new Scanner(System.in)) {
            String task = scanner.nextLine();
            switch (task) {
                case "1":
                    task = "Красный";
                    filterColor(task);
                    break;
                case "2":
                    task = "Синий";
                    filterColor(task);
                    break;
                case "3":
                    task = "Графит";
                    filterColor(task);
                    break;
                case "4":
                    task = "Коричневый";
                    filterColor(task);
                    break;
                case "5":
                    task = "Металл";
                    filterColor(task);
                    break;
                default:
                    task4();
                    break;
            }
        }

    }

    static ArrayList<MiNotebok> filterRam(int a) {
        ArrayList<MiNotebok> miNotebok = new ArrayList<>();
        MiNotebok miNotebokRam = new MiNotebok(null, a, 0, null, null);
        for (MiNotebok miNoteboks : miNoteboks) {
            if (miNoteboks.equalsRam(miNotebokRam)) {
                miNotebok.add(miNoteboks);
            }
        }
        System.out.println(miNotebok);
        return miNotebok;
    }

    static ArrayList<MiNotebok> filterHdd(int a) {
        ArrayList<MiNotebok> miNotebok = new ArrayList<>();
        MiNotebok miNotebokHdd = new MiNotebok(null, 0, a, null, null);
        for (MiNotebok miNoteboks : miNoteboks) {
            if (miNoteboks.equalsHdd(miNotebokHdd)) {
                miNotebok.add(miNoteboks);
            }
        }
        System.out.println(miNotebok);
        return miNotebok;
    }

    static ArrayList<MiNotebok> filterOperatingSystem(String s) {
        ArrayList<MiNotebok> miNotebok = new ArrayList<>();
        MiNotebok miNotebokOperatingSystem = new MiNotebok(null, 0, 0, s, null);
        for (MiNotebok miNoteboks : miNoteboks) {
            if (miNoteboks.equalsOperatingSystem(miNotebokOperatingSystem)) {
                miNotebok.add(miNoteboks);
            }
        }
        System.out.println(miNotebok);
        return miNotebok;
    }

    static ArrayList<MiNotebok> filterColor(String s) {
        ArrayList<MiNotebok> miNotebok = new ArrayList<>();
        MiNotebok miNotebokColor = new MiNotebok(null, 0, 0, null, s);
        for (MiNotebok miNoteboks : miNoteboks) {
            if (miNoteboks.equalsColor(miNotebokColor)) {
                miNotebok.add(miNoteboks);
            }
        }
        System.out.println(miNotebok);
        return miNotebok;
    }
}
