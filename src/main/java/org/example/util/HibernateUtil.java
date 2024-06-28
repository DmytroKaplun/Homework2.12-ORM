package org.example.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Getter;
import org.example.entity.Client;
import org.example.entity.Planet;
import org.flywaydb.core.Flyway;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Getter
public class HibernateUtil {
    private final SessionFactory sessionFactory;
    private static final HikariDataSource dataSource;

    static {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("org.h2.Driver");
        hikariConfig.setJdbcUrl("jdbc:h2:/Users/dmytrokaplun/h2/Space_travel");
        hikariConfig.setUsername("Dmytro Kaplun");
        hikariConfig.setMaximumPoolSize(10);
        hikariConfig.setConnectionTimeout(30000);

        dataSource = new HikariDataSource(hikariConfig);

        Flyway flyway = Flyway.configure()
                .dataSource(dataSource)
                .locations("db/migrations")
                .load();
        flyway.migrate();
    }

    public HibernateUtil() {
        sessionFactory = new Configuration()
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Planet.class)
                .buildSessionFactory();
    }

    private static final class InstanceHolder {
        private static final HibernateUtil instance = new HibernateUtil();
    }

    public  static HibernateUtil getInstance() {
        return InstanceHolder.instance;
    }

    public void close() {
        sessionFactory.close();
    }
}
