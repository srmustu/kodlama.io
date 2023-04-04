package dataAccess.logDao;

public class EmailLog implements ILog{
    @Override
    public void logging() {
        System.out.println("Logged to email");
    }
}
