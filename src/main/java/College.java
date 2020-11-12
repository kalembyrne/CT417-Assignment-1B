import org.joda.time.DateTime;

import java.util.List;

public class College {
    public static void main(String args[]){
        Student student1 = new Student("John smith",18,"09/12/01");
        Student student2 = new Student("Jane smith",20,"01/11/00");
        Student student3 = new Student("James Byrne",22,"09/10/98");
        Student student4 = new Student("Joe Johnson",21,"20/07/99");

        Module software = new Module("software","CT417");
        Module machineLearning = new Module("Machine Learning","CT4101");
        Module digitalSystems = new Module("Digital systems","EE412");
        Module artificalIntelligence = new Module("Artifical Intelligence","CT426");

        DateTime startDate = new DateTime(2020,9,29,9,00);
        DateTime endDate = new DateTime(2021,5,29,9,00);

        Course computerEngineering = new Course("ECE4",startDate,endDate);
        Course computerScience= new Course("CSIT4",startDate,endDate);

        computerEngineering.addStudents(student1);
        computerEngineering.addStudents(student2);

        computerScience.addStudents(student3);
        computerScience.addStudents(student4);

        software.registerStudent(student1);
        software.registerStudent(student2);
        software.registerStudent(student3);
        software.registerStudent(student4);

        machineLearning.registerStudent(student1);
        machineLearning.registerStudent(student2);
        machineLearning.registerStudent(student3);
        machineLearning.registerStudent(student4);

        digitalSystems.registerStudent(student1);
        digitalSystems.registerStudent(student2);

        artificalIntelligence.registerStudent(student3);
        artificalIntelligence.registerStudent(student4);

        computerEngineering.addModule(software);
        computerEngineering.addModule(machineLearning);
        computerEngineering.addModule(digitalSystems);

        computerScience.addModule(software);
        computerScience.addModule(machineLearning);
        computerScience.addModule(artificalIntelligence);

        courseInfo(computerEngineering);
        courseInfo(computerScience);

    }

    private  static void courseInfo(Course course){
        System.out.println(course.getName() + ":\n  course modules:");
        for(Module m: course.getModules()){
            System.out.println("    "+m.getName());
        }
        System.out.println("      course  Students:");
        for(Student s: course.getStudents()){
            System.out.println("       "+s.getName() +" -> Username: "+ s.getUsername()+"\n          "+s.getName()+"'s modules: ");
            for(Module m: s.getModulesRegistered()){
                System.out.println("             "+m.getName());
            }
        }
    }
}
