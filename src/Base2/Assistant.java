package Base2;

import Base.LearningPerson;
import Base.TeachingPerson;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {

    public boolean isGoingToBeAphD;

    public Assistant(String name, String surname, int id, boolean willBeAPhd){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAphD = willBeAPhd;
    }

    @Override
    public void studyAtHome() {
        System.out.println("I am an assistant so I have to study at home");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I want to teach to other people. Will I be a phd? " + isGoingToBeAphD);
    }
}
