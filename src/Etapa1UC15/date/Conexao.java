
package Etapa1UC15.date;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/loja_construcao",
                "root",
                "root"
            );
        } catch (Exception e) {
            System.out.println("Erro conexão: " + e);
            return null;
        }
    }
    
}

