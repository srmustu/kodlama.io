package business.Instructor;

import business.Instructor.IInstructorManager;
import dataAccess.InstructorDao.HibernateDao;
import dataAccess.InstructorDao.IInstructorDal;
import dataAccess.logDao.DataBaseLog;
import dataAccess.logDao.EmailLog;
import dataAccess.logDao.ILog;
import dataAccess.logDao.SmsLog;
import entities.Instructor;


public class InstructorManager implements IInstructorManager {

    ILog[] logs = new ILog[]{new DataBaseLog(),new EmailLog(),new SmsLog()};
    @Override
    public void add(Instructor instructor) {
        if (!instructor.getCertificates1().isEmpty()){
           IInstructorDal instructorDal = new HibernateDao();
           instructorDal.add();
        } else {
            System.out.println("Please, enter certificate");
        }

        for (ILog log:logs) {
            log.logging();
        }
    }

    @Override
    public void remove(Instructor instructor) {
        IInstructorDal instructorDal = new HibernateDao();
        instructorDal.remove();
    }
}
