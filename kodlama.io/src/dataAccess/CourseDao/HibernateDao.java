package dataAccess.CourseDao;

public class HibernateDao implements ICourseDal{
    @Override
    public void add() {
        System.out.println("Course added to database with Hibernate");
    }

    @Override
    public void remove() {
        System.out.println("Course deleted from database with Hibernate");
    }
}
