import Base2.Assistant;
import Base2.CollegePerson;
import Base2.Professor;
import Base2.Student;

public class Testing extends CollegePerson {
    public static void main(String[] args) {

        Student student = new Student("Mario", "Rossi", 3, 2022);
        Professor professor = new Professor("Luca", "Bianchi", 4, "Maths");
        Assistant assistant = new Assistant("Giuseppe", "Verdi", 7, true);

        student.goToCollege();
        student.studyAtHome();

        professor.goToCollege();
        professor.teachToOtherPeople();

        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();

    }


    }

