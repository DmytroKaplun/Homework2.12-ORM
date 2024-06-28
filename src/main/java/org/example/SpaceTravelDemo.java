package org.example;

import org.example.dao.Dao;
import org.example.dao.SpaceTravelDao;
import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.service.SpaceTravelService;
import org.example.util.HibernateUtil;
import org.hibernate.SessionFactory;

public class SpaceTravelDemo {
    public static void main(String[] args) {
        HibernateUtil instance = HibernateUtil.getInstance();
        SessionFactory sessionFactory = instance.getSessionFactory();

        Dao<Planet, String> planetDao = new SpaceTravelDao<>(Planet.class, sessionFactory);
        SpaceTravelService<Planet, String> planetService = new SpaceTravelService<>(planetDao);

//        Planet planet = new Planet();
//        planet.setId("MER");
//        planet.setName("Mercury");
//        planetService.save(planet);
        System.out.println("planetService.findById(5L) = " + planetService.findById("VEN"));
//        planetService.delete(planetService.findById("MER"));


        Dao<Client, Long> clientDao = new SpaceTravelDao<>(Client.class, sessionFactory);
        SpaceTravelService<Client, Long> clientService = new SpaceTravelService<>(clientDao);
//        Client client = new Client();
//        client.setPassport("AB445566");
//        client.setName("Harry Potter");
//        clientService.save(client);

        Client byId = clientService.findById(11L);
//        System.out.println("clientService.findById(3L) = " + byId);
//        byId.setName("Harry");
//        clientService.update(byId);
//        clientService.delete(byId);
        clientService.findAll().forEach(System.out::println);

        HibernateUtil.getInstance().close();
    }
}