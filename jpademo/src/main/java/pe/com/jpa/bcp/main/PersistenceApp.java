package pe.com.jpa.bcp.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jdk.swing.interop.SwingInterOpUtils;
import lombok.extern.slf4j.Slf4j;
import pe.com.jpa.bcp.entidades.Cliente;
import pe.com.jpa.bcp.entidades.Domicilio;


public class PersistenceApp {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("PersistenceAppPU");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

//            Cliente objCliente = Cliente.builder().nombre("florencia").apellido("salcedo").dni(12345678).build();
//            Domicilio objDomicilio = Domicilio.builder().nombreCalle("san juan").numero(2030).build();
//            objCliente.setDomicilio(objDomicilio);
//            objDomicilio.setCliente(objCliente);
//            em.persist(objCliente);

//            Domicilio  dom=  em.find(Domicilio.class,1L);
//            Cliente cliente = em.find(Cliente.class, 1L);
//            System.out.println("cliente de domicilio :" + dom.getCliente().getDni());
//            System.out.println("Domicilio del cliente :" + cliente.getDomicilio().getNombreCalle());

            em.flush();
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();

        }
        em.close();
        emf.close();
    }
}
