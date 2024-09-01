package nn.ru;

import nn.ru.entity.Group;
import nn.ru.entity.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class HibernateTest {
    @Test
    public void test_ItemGroup_ManyToOne() {

        // СОЗДАЕМ КОНФИГУРАЦИЮ И ДОБАВЛЯЕМ СУЩНОСТИ:
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(nn.ru.entity.Item.class);
        configuration.addAnnotatedClass(nn.ru.entity.Group.class);

        // СОЗДАЕМ ФАКБРИКУ СЕССИЙ, ОТКРЫВАЕМ СЕССИЮ И ОТКРЫВАЕМ ТРАНЗАКЦИЮ:
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // РАБОТА С ДАННЫМИ:
        Group group = new Group();
        Item item = new Item();
        Item item2 = new Item();
        Item item3 = new Item();


        item.setGroup(group);
        item2.setGroup(group);
        item3.setGroup(group);

        session.save(group);
        session.save(item);
        session.save(item2);
        session.save(item3);

        // ЗАКРЫВАЕМ СЕССИЮ и ФАКБРИКУ:
        session.getTransaction().commit();
        session.close();
        factory.close();

        //


    }
}
