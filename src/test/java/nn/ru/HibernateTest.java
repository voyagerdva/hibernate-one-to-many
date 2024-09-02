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
    public void test_ItemGroup_3items_in_1group() {

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
    }

    @Test
    public void test_ItemGroup_1_SI_SeG_SG_Ok() {

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

        session.save(item);
        item.setGroup(group);
        session.save(group);

        // ЗАКРЫВАЕМ СЕССИЮ и ФАКБРИКУ:
        session.getTransaction().commit();
        session.close();
        factory.close();
    }

    @Test
    public void test_ItemGroup_2_SI_SG_SeG_Ok() {

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

        session.save(item);
        session.save(group);
        item.setGroup(group);

        // ЗАКРЫВАЕМ СЕССИЮ и ФАКБРИКУ:
        session.getTransaction().commit();
        session.close();
        factory.close();
    }

    @Test
    public void test_ItemGroup_3_SeG_SI_SG_Ok() {

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

        item.setGroup(group);
        session.save(item);
        session.save(group);

        // ЗАКРЫВАЕМ СЕССИЮ и ФАКБРИКУ:
        session.getTransaction().commit();
        session.close();
        factory.close();
    }

    @Test
    public void test_ItemGroup_4_SeG_SG_SI_Ok() {

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

        item.setGroup(group);
        session.save(group);
        session.save(item);

        // ЗАКРЫВАЕМ СЕССИЮ и ФАКБРИКУ:
        session.getTransaction().commit();
        session.close();
        factory.close();
    }

    @Test
    public void test_ItemGroup_5_SG_SeG_SI_Ok() {

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

        session.save(group);
        item.setGroup(group);
        session.save(item);


        // ЗАКРЫВАЕМ СЕССИЮ и ФАКБРИКУ:
        session.getTransaction().commit();
        session.close();
        factory.close();
    }

    @Test
    public void test_ItemGroup_6_SG_SI_SeG_Ok() {

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

        session.save(group);
        session.save(item);
        item.setGroup(group);

        // ЗАКРЫВАЕМ СЕССИЮ и ФАКБРИКУ:
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
