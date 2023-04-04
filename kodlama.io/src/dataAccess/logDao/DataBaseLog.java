package dataAccess.logDao;

public class DataBaseLog implements ILog{
    @Override
    public void logging() {
        System.out.println("Logged to database");
    }
}
