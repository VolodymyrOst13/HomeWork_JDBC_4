package task6;

import hibernate.HibernateException;
import hibernate.SessionFactory;
import hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
    private static SessionFactory factory;

    static {
        try {
            factory = new AnnotationConfiguration()
                    .configure("/com/task_06/hibernate.cfg.xml")
                    .buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}
