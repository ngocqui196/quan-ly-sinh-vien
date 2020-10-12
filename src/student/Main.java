package student;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        StudentManager studentManager = new StudentManager();
        int studentId;

        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentManager.add();
                    break;
                case "2":
                    studentId = studentManager.inputId();
                    studentManager.edit(studentId);
                    break;
                case "3":
                    studentId = studentManager.inputId();
                    studentManager.delete(studentId);
                    break;
                case "4":
                    studentManager.sortStudentByGPA();
                    break;
                case "5":
                    studentManager.sortStudentByName();
                    break;
                case "6":
                    studentManager.show();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }

    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Thêm học sinh.");
        System.out.println("2. Sửa học sinh theo ID");
        System.out.println("3. Xoá học sinh theo id.");
        System.out.println("4. Sắp xếp học sinh theo gpa.");
        System.out.println("5. Sắp xếp học sinh theo tên.");
        System.out.println("6. Hiển thị danh sách các học sinh.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
