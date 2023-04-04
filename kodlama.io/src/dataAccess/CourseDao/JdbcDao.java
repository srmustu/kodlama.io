package dataAccess.CourseDao;

public class JdbcDao implements ICourseDal{
    @Override
    public void add() {
        System.out.println("Course added to database with JDBC");
    }

    @Override
    public void remove() {
        System.out.println("Course deleted from database with JDBC");
    }
}
