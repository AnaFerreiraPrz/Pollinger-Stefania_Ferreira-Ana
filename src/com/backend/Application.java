package com.backend;

import com.backend.dao.impl.OdontologoDaoH2;

import java.sql.Connection;
import java.sql.DriverManager;

public class Application {
    public static void main(String[] args)
    {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/ParcialBE;INIT=RUNSCRIPT FROM 'create_schema.sql'", "sa", "");

            Odontologo a = new Odontologo(1, "Juan", "Perez");

            OdontologoDaoH2 odontologoDao1 = new OdontologoDaoH2();

            odontologoDao1.guardar(a);

            Odontologo b = new Odontologo(1, "Ramona", "Jimenez");

            OdontologoDaoH2 odontologoDao2 = new OdontologoDaoH2();

            odontologoDao2.guardar(b);

            Odontologo c = new Odontologo(1, "Laura", "Ramirez");

            OdontologoDaoH2 odontologoDao3 = new OdontologoDaoH2();

            odontologoDao3.guardar(c);


        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }

    }
}