package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;

import java.util.ArrayList;
import java.util.Scanner;

public class Info5001UniversityExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Department department = new Department("Information Systems");
        CourseCatalog coursecatalog = department.getCourseCatalog();

        // Add courses to the catalog
        Course course = coursecatalog.newCourse("App Eng", "INFO 5100", 4);
        coursecatalog.newCourse("Web Development", "INFO 6105", 4);
        coursecatalog.newCourse("UI/UX", "INFO 6305", 4);
        coursecatalog.newCourse("Cloud Development", "INFO 7105", 4);
        coursecatalog.newCourse("Linux Administration", "INFO 8105", 4);

        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");
        CourseOffer courseoffer = courseschedule.newCourseOffer("INFO 5100");
        if (courseoffer == null) return;
        courseoffer.generatSeats(10);

        PersonDirectory pd = department.getPersonDirectory();
        Person person = pd.newPerson("01");

        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        CourseLoad courseload = student.newCourseLoad("Fall2020");

        courseload.newSeatAssignment(courseoffer); // Register student in class

        FacultyDirectory fd = department.getFacultydirectory();
        Person p1 = pd.newPerson("Amuthan");
        Person p2 = pd.newPerson("KalBugrara");
        Person p3 = pd.newPerson("VishalChawla");
        Person p4 = pd.newPerson("Nik Brown");
        fd.newFacultyProfile(p1);
        fd.newFacultyProfile(p2);
        fd.newFacultyProfile(p3);
        fd.newFacultyProfile(p4);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Manage Add Course and browse course Catalog");
            System.out.println("2. Manage the new semester schedule by adding courses and assigning teachers");
            System.out.println("3. Register Student for a Course");
            System.out.println("4. Display enrolled courses");
            System.out.println("5. Exit");
            System.out.println("6. Generate Student Report");
            System.out.print("Please select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Press 1 for add course and press 2 for browse course");
                    int option1 = scanner.nextInt();
                    switch (option1) {
                        case 1:
                            addCourse(coursecatalog, scanner);
                            break;
                        case 2:
                            browseCourse(coursecatalog);
                            break;
                        default:
                            System.out.println("Invalid option selected.");
                            break;
                    }
                    break;

                case 2:
                    CourseSchedule cs = addCourseSchedule(department, coursecatalog);
                    courseschedule = cs;
                    break;

                case 3:
                    System.out.println("Student registration");
                    registerStudentForCourse(scanner, department, courseschedule);
                    break;

                case 4:
                    System.out.println("Display enrolled courses");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                case 6:
                    System.out.println("Generating Student Report...");

                    // Generating student report
                    generateStudentReport(department);
                    break;

                default:
                    System.out.println("Invalid option selected.");
            }
        }
    }

    public static void browseCourse(CourseCatalog coursecatalog) {
        ArrayList<Course> courseList = coursecatalog.getCourseList();
        System.out.println("Available Courses:");
        for (Course course : courseList) {
            System.out.println(course.getCOurseNumber() + "  " + course.getCourseName() +
                    " (" + course.getCredits() + " credits)");
        }
    }

    public static void addCourse(CourseCatalog coursecatalog, Scanner scanner) {
        System.out.println("You selected: Add Courses");
        System.out.println("Enter the course name:");
        String cname = scanner.next();
        System.out.println("Enter the course credits:");
        int credits = scanner.nextInt();
        System.out.println("Enter the course number:");
        String cnumber = scanner.next();

        // Create a new course object and add it to the course catalog
        Course newCourse = coursecatalog.newCourse(cname, cnumber, credits);
        System.out.println("Course Added");
    }

    private static CourseSchedule addCourseSchedule(Department dept, CourseCatalog coursecatalog) {
        System.out.println("New Course Schedule");
        System.out.println("For which semester do you want to add course schedule?");
        Scanner scanner1 = new Scanner(System.in);
        String semName = scanner1.nextLine();
        CourseSchedule courseSchedule = dept.newCourseSchedule(semName);

        do {
            System.out.println("Choose for which course you want to add a course offer for " + semName);
            browseCourse(coursecatalog);

            int courseIndex = Integer.parseInt(scanner1.next()) - 1;
            Course courseSelected = coursecatalog.getCourseList().get(courseIndex);

            CourseOffer courseOffer = courseSchedule.newCourseOffer(courseSelected.getCOurseNumber());
            if (courseOffer == null) {
                System.out.println("Wrong option selected");
                continue;
            }

            System.out.println("Select an option to assign the professor for this course offer");
            ArrayList<FacultyProfile> teacherList = dept.getFacultydirectory().getTeacherlist();
            for (int i = 0; i < teacherList.size(); i++) {
                System.out.println((i + 1) + ". " + teacherList.get(i).getPerson().getPersonId());
            }
            System.out.println(teacherList.size() + 1 + ". Invite/create new teacher?");
            String teacherInput = (new Scanner(System.in)).nextLine();

            FacultyProfile faculty;
            courseOffer.generatSeats(20);

            if (Integer.parseInt(teacherInput) - 1 == teacherList.size()) {
                System.out.println("Enter name of new faculty");
                String facultyName = (new Scanner(System.in)).nextLine();
                Person newFaculty = dept.getPersonDirectory().newPerson(facultyName);
                dept.getFacultydirectory().newFacultyProfile(newFaculty);
                System.out.println("\nThe faculty created: " + newFaculty);
                System.out.println("Select an option to assign the professor for this course offer");
                for (int i = 0; i < teacherList.size(); i++) {
                    System.out.println((i + 1) + "." + teacherList.get(i).getPerson().getPersonId());
                }
                teacherInput = (new Scanner(System.in)).nextLine();
            }

            faculty = dept.getFacultydirectory().getTeacherlist().get(Integer.parseInt(teacherInput) - 1);
            courseOffer.AssignAsTeacher(faculty);

            System.out.println("For the " + courseOffer.getCourseName() + " course, faculty " +
                    courseOffer.getFacultyProfile().getPerson() + " is assigned successfully.");
            System.out.println("Do you want to add schedule for more courses? \n1. Yes \n2. No?");
            String isAddMoreOffer = (new Scanner(System.in)).nextLine();
            if (isAddMoreOffer.equals("2")) {
                break;
            }
        } while (true);

        return courseSchedule;
    }

    private static void registerStudentForCourse(Scanner scanner, Department department, CourseSchedule courseSchedule) {
        System.out.print("Enter student ID: ");
        String studentId = scanner.next();

        System.out.print("Enter semester (e.g., 'Fall2020'): ");
        String semester = scanner.next();

        ArrayList<CourseOffer> courseList = courseSchedule.getSchedule();
        for (CourseOffer cour : courseList) {
            System.out.println(cour.getCourseName() + "  " +
                    cour.getFacultyProfile().getPerson().getPersonId() + courseSchedule.getSemester() + cour.getCourseNumber());
        }

        System.out.print("Enter course name (e.g., 'UIUX'): ");
        String courseCode = scanner.next();

        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student = sd.findStudent(studentId);

        if (student != null) {
            CourseLoad cl = student.newCourseLoad(semester);
            for (CourseOffer cour : courseList) {
                if (cour.getCourseName().equals(courseCode)) {
                    cl.newSeatAssignment(cour);
                    System.out.println("Course Registered Successfully!");
                    return;
                }
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    // New method to generate the student report

       public static void generateStudentReport(Department department) {
           String[][] students = {
            {"Aarav Patel", "123456789", "Fall2020", "INFO 5100", "KalBugrara", "4", "3.8", "INFO 6105", "VishalChawla", "3", "3.9"},
            {"Priya Sharma", "987654321", "Fall2020", "INFO 6305", "Amuthan", "4", "3.7", "INFO 7105", "Nik Brown", "4", "3.6"},
            {"Ravi Kumar", "456789123", "Spring2021", "INFO 5100", "VishalChawla", "4", "3.6", "INFO 8105", "KalBugrara", "3", "3.8"},
            {"Ananya Gupta", "678123456", "Fall2020", "INFO 6105", "VishalChawla", "3", "3.9", "INFO 6305", "Amuthan", "4", "3.7"},
            {"Arjun Rao", "234567890", "Spring2021", "INFO 7105", "Nik Brown", "3", "3.8", "INFO 8105", "KalBugrara", "4", "3.6"},
            {"Isha Verma", "345678901", "Fall2020", "INFO 5100", "VishalChawla", "4", "4.0", "INFO 6105", "VishalChawla", "3", "3.9"},
            {"Aishwarya Nair", "567890123", "Spring2021", "INFO 6305", "Amuthan", "3", "3.9", "INFO 7105", "Nik Brown", "4", "3.8"}
        };

        // Loop through each student to generate the report
        for (String[] student : students) {
            String studentName = student[0];
            String studentId = student[1];
            String semester = student[2];
            String courseCode1 = student[3];
            String professor1 = student[4];
            int credits1 = Integer.parseInt(student[5]);
            double grade1 = Double.parseDouble(student[6]);
            String courseCode2 = student[7];
            String professor2 = student[8];
            int credits2 = Integer.parseInt(student[9]);
            double grade2 = Double.parseDouble(student[10]);

            // Calculate CGPA (for simplicity, assuming two courses here)
            double cgpa = (grade1 + grade2) / 2.0;  // Average of two grades for CGPA

            // Printing the student report
            System.out.println("=================== STUDENT REPORT ===================");
            System.out.println("\nStudent Name: " + studentName);
            System.out.println("Student ID: " + studentId);
            System.out.println("\nSemester: " + semester);
            System.out.println("------------------------------------------------");
            System.out.println("Course       Professor      Credits    Grade");
            System.out.println("------------------------------------------------");
            System.out.println(courseCode1 + "    " + professor1 + "    " + credits1 + "        " + grade1);
            System.out.println(courseCode2 + "    " + professor2 + "    " + credits2 + "        " + grade2);
            System.out.println("\nSummary:");
            System.out.println("Total Credits Completed: " + (credits1 + credits2));
            System.out.println("CGPA: " + String.format("%.2f", cgpa) + " / 4.00");
            System.out.println("================================================");
        }
              
        }
        
       
           
                   
    }

  
