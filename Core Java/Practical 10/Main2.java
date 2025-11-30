interface Student {
    void Display_Grade();
    void Attendance();
}

class PG_Students implements Student {
    public void Display_Grade() {
        System.out.println("PG Student Grade: A");
    }
    public void Attendance() {
        System.out.println("PG Student Attendance: 85%");
    }
}

class UG_Students implements Student {
    public void Display_Grade() {
        System.out.println("UG Student Grade: B+");
    }
    public void Attendance() {
        System.out.println("UG Student Attendance: 90%");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student pg = new PG_Students();
        Student ug = new UG_Students();

        pg.Display_Grade();
        pg.Attendance();

        ug.Display_Grade();
        ug.Attendance();
    }
}
