package com.company;

// Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
// Определить дополнительно методы в классе, создающем массив объектов.
// Задать критерий выбора данных и вывести эти данные на консоль.
// В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
//
// 1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
//  Создать массив объектов. Вывести:
// a) список студентов заданного факультета;
// b) списки студентов для каждого факультета и курса;
// c) список студентов, родившихся после заданного года;
// d) список учебной группы.


import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;


import java.lang.reflect.Array;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Student[] student = new Student[20];
        ArrayList<Student> student = new ArrayList<Student>();

        student.add(new Student("Egor", "Kotok", 1996, 05, 10,1,1,1));
        student.add(new Student("Andrey", "Andreev", 1995, 05, 10,1,2,1));
        student.add(new Student("Alexandr", "Alexandrov", 1994, 05, 10,2,2,1));
        student.add(new Student("Maxim", "Maximov", 1995, 05, 10,2,3,1));
        student.add(new Student("Vladimir", "Vladimirovich", 1994, 05, 10,3,4,1));
        student.add(new Student("Kirill", "Kirillov", 1995, 05, 10,3,4,1));


        while(1 == 1){
            PrintMenu();
            String menu = in.nextLine();
            switch (menu){
                case "1":
                    GetStudentsOfFaculty(student, in);
                    break;
                case "2":
                    GetListOfStudentsForEveryFacultyAndCourse(student);
                    break;
                case "3":
                    GetListOfStudentsWithBirthAfterDate(student, in);
                    break;
                case "4":
                    GetStudentsOfGroup(student, in);
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.err.println("Wrong command\n");
            }
        }

    }


    public static void PrintMenu() {
        System.out.println("Menu:");
        System.out.println("1 - Get students of faculty:");
        System.out.println("2 - List of students for every faculty and course");
        System.out.println("3 - List of students with birth after date");
        System.out.println("4 - Get students of group");
        System.out.println("5 - Exit");
    }

    public static void GetStudentsOfFaculty(ArrayList<Student> student, Scanner in){
        System.out.println("Enter number of faculty (1 - The Faculty of Computer-Aided Design / " +
                "2 - The Faculty of Computer Systems and Networks / 3 - The Faculty of Radioengineering and Electronics - ): ");
        boolean isFound = false;
        while (!isFound){
            try{
                int numberOfFaculty = in.nextInt();
                if (numberOfFaculty >= 0 && numberOfFaculty <= Faculty.values().length){
                    for (int i = 0; i < student.size(); i++){
                        if (student.get(i).getFaculty().ordinal() + 1 == numberOfFaculty){
                            System.out.println(student.get(i).toString());
                        }
                    }
                    isFound = true;
                    in.nextLine();
                }
                else
                    throw new WrongNumberArgsException("Wrong number");
            }
            catch (InputMismatchException exp){
                System.err.println("Wrong symbol!");
                in.nextLine();
            }
            catch (WrongNumberArgsException exp){
                System.err.println("Wrong number! Try again:");
                in.nextLine();
            }
        }

    }

    public static void GetListOfStudentsForEveryFacultyAndCourse(ArrayList<Student> student){
        for(int i = 0; i < Faculty.values().length; i++){
            for (int j = 1; j <= 5; j++){
                for (int k = 0; k < student.size(); k++){
                    if(student.get(k).getFaculty().ordinal() == i && student.get(k).getCourse() == j){
                        System.out.println(student.get(k).getFaculty().ordinal() + " " + student.get(k).getCourse());
                    }

                }
            }
        }
    }

    public static void GetListOfStudentsWithBirthAfterDate(ArrayList<Student> student, Scanner in) {
        System.out.println("Enter date(year / month / day): ");
        boolean isFound = false;
        while (!isFound){
            try {
                int year = in.nextInt();
                int month = in.nextInt();
                int day = in.nextInt();
                LocalDate date = LocalDate.of(year, month, day);
                System.out.println("List of students which birth after " + date + ": ");
                for (int i = 0; i < 6; i++){
                    if (student.get(i).getBirthday().isAfter(date)){
                        System.out.println(student.get(i).toString());
                    }
                }
                isFound = true;
                in.nextLine();
            }
            catch (InputMismatchException exp){
                System.err.println("Wrong symbol!");
                in.nextLine();
            }
            catch (DateTimeException exp){
                System.err.println("Wrong date");
                in.nextLine();
            }

        }
    }

    public static void GetStudentsOfGroup(ArrayList<Student> student, Scanner in) {
        System.out.println("Enter group: ");
        boolean correctGroup = false;
        while (!correctGroup){
            try {
                String group = in.nextLine();
                if (group.length() != 3) throw new InputMismatchException();
                else for(int i = 0; i < student.size(); i++){
                    if (student.get(i).getGroup().equals(group)){
                        System.out.println(student.get(i).toString());
                    }
                }
                correctGroup = true;
                in.nextLine();
            }
            catch (InputMismatchException exp){
                System.err.println("Wrong group length!");
                in.nextLine();
            }
        }
    }

}

