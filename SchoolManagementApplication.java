public class SchoolManagementApplication {
    public static void main(String[] args) {
        AttendanceSystem attendance = new AttendanceSystem();
        SchoolManagementApp attendanceApp = new AttendanceSystemAdapter(attendance);

        GradingSystem grades = new GradingSystem();
        SchoolManagementApp gradesApp = new GradingSystemAdapter(grades);

        LibrarySystem library = new LibrarySystem();
        SchoolManagementApp libraryApp = new LibrarySystemAdapter(library);

        //Outputs
        System.out.println(attendanceApp.integrateSystem());
        System.out.println(gradesApp.integrateSystem());
        System.out.println(libraryApp.integrateSystem());
    }
}