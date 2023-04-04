package dataAccess.InstructorDao;

public class JdbcDao implements IInstructorDal {
    public void add (){
        System.out.println("Added to database with trainer JDBC");
    }

    @Override
    public void remove() {
        System.out.println("Trainer deleted from database with JDBC");
    }
}
