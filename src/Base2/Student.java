package Base2;

import Base.LearningPerson;

public class Student extends CollegePerson implements LearningPerson {

    public int academicYear;

    public Student(String name, String surname, int id, int year){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academicYear = year;

    }

    @Override
    public void studyAtHome() {
        System.out.println("I am a student and I study at home");
    }
}
