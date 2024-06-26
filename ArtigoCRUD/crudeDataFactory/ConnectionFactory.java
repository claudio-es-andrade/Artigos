package crudeDataFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // Nome do Usuário do Banco de Dados MYSQL
    private static final String USERNAME = "root";

    // Senha do Usuário
    private static final String PASSWORD = "rootpaasword";

    //Caminho do Banco de Dados, porta, nome do banco de dados
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";

    // Conexão com o Banco de Dados

    public static Connection createConnectionToMySQL() throws SQLException, ClassNotFoundException {

        //Faz com que a classe seja carregada pela JVM
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Cria a conexão com o banco de dados
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // Recuperar uma conexão com o banco de dados
        Connection con = createConnectionToMySQL();
        // Testar se a conexão é nula
        if(con != null){
            System.out.println("Conexão obtida com sucesso!");
            con.close();
        }

    }

}
