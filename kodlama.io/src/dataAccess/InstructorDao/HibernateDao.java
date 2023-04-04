package dataAccess.InstructorDao;

public class HibernateDao implements IInstructorDal{
    public void add(){
        System.out.println("Instructor added to database with Hibernate");
    }

    @Override
    public void remove(){
        System.out.println("Instructor deleted from database with Hibernate");
    }
}
