package dataAccess.CategoryDao;

public class HibernateDao implements ICategoryDal{
    @Override
    public void add() {
        System.out.println("Category added to database with Hibernate");
    }
    public void remove(){
        System.out.println("Category deleted from database with Hibernate");
    }
}
