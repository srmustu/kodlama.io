package dataAccess.CategoryDao;

public class JdbcDao implements ICategoryDal{
    @Override
    public void add() {
        System.out.println("Category added to database with JDBC");
    }
    public void remove(){
        System.out.println("Category deleted from database with JDBC");
    }
}
