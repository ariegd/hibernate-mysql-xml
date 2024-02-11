package org.hibernate.tutorial.hbm;

import org.hibernate.tutorial.hbm.service.ManageEmployee;

public class App {

   public static void main(String[] args) {
      ManageEmployee manage = new ManageEmployee();
      manage.start();
      System.exit(0);
   }
}
