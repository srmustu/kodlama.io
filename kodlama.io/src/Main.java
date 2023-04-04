import business.Category.CategoryManager;
import business.Category.ICategoryManager;
import business.Course.CourseManager;
import business.Course.ICourseManager;
import business.Instructor.InstructorManager;
import dataAccess.CategoryDao.HibernateDao;
import dataAccess.CourseDao.JdbcDao;
import entities.Course;
import entities.CourseCategory;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        Instructor instructor1 = new Instructor();
        instructor1.setName("Engin");
        instructor1.setCompetencyArea("Java,C#,C++,.Net");
        instructor1.setCompetencyLevel("Senior");
        instructor1.setLastName("Demiroğ");
        instructor1.setCertificates1("PMP");
        instructor1.setCertificates2("PHP");
        instructor1.setCertificates3("ITIL");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);

        System.out.println("****");
        
        CourseCategory courseCategory1 = new CourseCategory();
        courseCategory1.setCategoryName(".Net");
        courseCategory1.setCategoryLogo("java.png");

        ICategoryManager categoryManager = new CategoryManager(new HibernateDao());
        categoryManager.add(courseCategory1);

        Course course1 = new Course();
        course1.setCourseName("Java Camp");
        course1.setCourseCategory("Java");
        course1.setCoursePrice(99);
        course1.setCourseInstructorName("Engin Demiroğ");

        ICourseManager courseManager = new CourseManager(new JdbcDao());
        courseManager.add(course1);
    }
}