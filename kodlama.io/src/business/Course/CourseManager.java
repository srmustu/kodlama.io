package business.Course;
import dataAccess.CourseDao.ICourseDal;
import entities.Course;

public class CourseManager implements ICourseManager{
    ICourseDal iCourseDal;
    public CourseManager(ICourseDal iCourseDal){
        this.iCourseDal = iCourseDal;
    }

    @Override
    public void add(Course course) {
        if (course.getCoursePrice() <= 0) {
            System.out.println("Price must be greater than 0");
            return;
        }

        String[] courseNames = {"Java Camp"};
        String sToAdd = course.getCourseName();
        boolean found = false;
        for (int i = 0; i < courseNames.length; i++) {
            if (courseNames[i] == sToAdd) {
                found = true;
                System.out.println("There cannot be a course with the same name, enter another course name");
                break;
            }
        }
        if (!found) {
            String[] newcourseNames = new String[courseNames.length + 1];
            for (int i = 0; i < courseNames.length; i++) {
                newcourseNames[i] = courseNames[i];
            }
            newcourseNames[newcourseNames.length - 1] = sToAdd;
            courseNames = newcourseNames;
            iCourseDal.add();
        }

    }

    @Override
    public void remove(Course course) {

    }
}
