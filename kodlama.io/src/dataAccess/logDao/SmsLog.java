package dataAccess.logDao;

public class SmsLog implements ILog{
    @Override
    public void logging() {
        System.out.println("Logged to Sms");
    }
}
