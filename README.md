# Hibernar - Arquitectura
------------------------------------------
https://www.tutorialspoint.com/hibernate/hibernate_architecture.htm

...
Hibernate utiliza varias API de Java existentes, como JDBC, Java Transaction API (JTA) y Java Naming and Directory Interface (JNDI). JDBC proporciona un nivel rudimentario de abstracción de funcionalidad común a las bases de datos relacionales, lo que permite que Hibernate admita casi cualquier base de datos con un controlador JDBC. JNDI y JTA permiten que Hibernate se integre con servidores de aplicaciones J2EE.
...

## Conexión mediante JDBC, Hibernate a base de datos MySQL.
------------------------------------------------------------------------------
https://stackoverflow.com/questions/3807503/what-is-the-purpose-of-two-config-files-for-hibernate/3808406#3808406

Si está utilizando la API patentada de Hibernate, necesitará hibernate.cfg.xml. Si está utilizando JPA, es decir, Hibernate EntityManager, necesitará persistence.xml.

Por lo tanto, generalmente no necesita ambos, ya que utiliza la API patentada de Hibernate o JPA.

Sin embargo, si estaba utilizando la API patentada de Hibernate y ya tiene hibernate.cfg.xml (y archivos de mapeo XML hbm.xml) pero desea comenzar a usar JPA, puede reutilizar los archivos de configuración existentes haciendo referencia a hibernate.cfg.xml en el persistence.xml en la propiedad hibernate.ejb.cfgfile y, por lo tanto, tendrá ambos archivos. Reutilizar archivos hbm.xml existentes es, en mi opinión, un escenario realista que podría justificar conservar ambos (incluso si probablemente migraría a anotaciones JPA a largo plazo).

***
Nota: Si utiliza 'Hibernate.cfg.xml' la conexión es mediante 'SessionFactory' o 
      si utiliza 'persistence.xml' la conexion es mediante 'EntityManagerFactory'
***
