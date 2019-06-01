import java.io.FileInputStream;
import java.ioIOException;
import java.util.Properties;
public class Login {
    public static Properties getProp() throws IOException {
    Properties prop = new Properties();
    FileInputStream file = new FileInputStream(
        "./properties/dados.properties");
    props.load(file);
    return props;
}
public static void main (String args[]) {
    String login;
    String host;
    String password;
    System.out.println("Teste de leitura de propriedaddes");

    Properties prop = getProp();
    login = prop.getProperty("prop.server.login");
    host = prop.getProperty("prop.server.host");
    password  = prop.getProperty("prop.server.password");

    System.out.println("Login = " + login);
    System.out.println("Host = " + host);
    System.out.println("Password = " + password);
    }
}