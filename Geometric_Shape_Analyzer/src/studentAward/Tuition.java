package studentAward;

public class Tuition {
    public static void main(String args[]){
        Student[] university = new Student[5];
        university[0] = new FullTime(101, "Amanda", "Sanders", 3.69);
        university[1] = new FullTime(102, "Joan", "Villegas", 3.50);
        university[2] = new FullTime(103, "Tulisa", "Higgs", 2.01);
        university[3] = new PartTime(104, "Solomon", "Mccarty", 3.89);
        university[4] = new PartTime(105, "Donell", "Yang", 1.98);

        // Award the top students
        Sorting.selectionSort(university);

        int awarded_counter = 0;
        int student_counter = 0;
        Student[] awardedStudents = new Student[3];
        while(awarded_counter<3 & student_counter<university.length){
            if (university[student_counter].isFullTime()){
                awardedStudents[awarded_counter] = university[student_counter];
                awarded_counter += 1;
            }
            student_counter += 1;
        }

        ((FullTime)awardedStudents[0]).award(18000);
        ((FullTime)awardedStudents[1]).award(12000);
        ((FullTime)awardedStudents[2]).award(9000);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        for(Student student:university){
            System.out.println(student);
        }

    }
}