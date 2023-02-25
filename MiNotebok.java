public class MiNotebok {
    String name;
    int ram;
    int hdd;
    String operatingSystem;
    String color;

    public MiNotebok(String vname, int vram, int vhdd, String voperatingSystem, String vcolor) {
        name = vname;
        ram = vram;
        hdd = vhdd;
        operatingSystem = voperatingSystem;
        color = vcolor;
    }

    public MiNotebok() {
        name = null;
        ram = 0;
        hdd = 0;
        operatingSystem = null;
        color = null;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return name + ": ОЗУ-" + ram + "ГБ, HDD-" + hdd + "ГБ, ОС-" + operatingSystem + ", Цвет-" + color + ";  ";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiNotebok)) {
            return false;
        }
        MiNotebok miNoteboks = (MiNotebok) obj;
        if (name.equals(miNoteboks.name) && ram == miNoteboks.ram && hdd == miNoteboks.hdd
                && color.equals(miNoteboks.color) && operatingSystem.equals(miNoteboks.operatingSystem)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equalsRam(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiNotebok)) {
            return false;
        }
        MiNotebok miNoteboks = (MiNotebok) obj;
        if (ram == miNoteboks.ram) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equalsHdd(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiNotebok)) {
            return false;
        }
        MiNotebok miNoteboks = (MiNotebok) obj;
        if (hdd == miNoteboks.hdd) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equalsName(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiNotebok)) {
            return false;
        }
        MiNotebok miNoteboks = (MiNotebok) obj;
        if (name.equals(miNoteboks.name)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equalsOperatingSystem(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiNotebok)) {
            return false;
        }
        MiNotebok miNoteboks = (MiNotebok) obj;
        if (operatingSystem.equals(miNoteboks.operatingSystem)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equalsColor(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiNotebok)) {
            return false;
        }
        MiNotebok miNoteboks = (MiNotebok) obj;
        if (color.equals(miNoteboks.color)) {
            return true;
        } else {
            return false;
        }
    }
}
