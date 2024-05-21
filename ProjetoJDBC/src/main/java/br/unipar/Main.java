package br.unipar;
import org.postgresql.util.PSQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static final String url = "jdbc:postgresql://localhost:5432/exemplo1";

    private static final String user = "postgres";

    private static final String password = "admin123";

    public static void main(String[] args) {



    }

    public static Connection connection() throws SQLException {
        //localhost -> Onde está o banco
        //5432 -> porta padrão do banco
        return DriverManager.getConnection(url, user, password);


    }

    public static void criarTabelaUsuario() {
        try {
            Connection conn = connection();

            Statement statement = conn.createStatement();
            String sql = " CREATE TABLE IF NOT EXITS usuarios ("
                    + " codigo SERIAL PRIMARY KEY, "
                    + " username VARCHAR (50) UNIQUE NOT NULL, "
                    + " password VARCHAR (300) UNIQUE NOT NULL, "
                    + "nome VARCHAR (50) UNIQUE NOT NULL, "
                    + "nascimento DATE )";

            statement.execute(sql);
            System.out.println("TABELA CRIADA");

        } catch (SQLException exception) {
            exception.printStackTrace();

        }

    }
}
