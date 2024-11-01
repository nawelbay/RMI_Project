import rmi.ServiceBanqImpl;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {

        // Set the hostname to the Docker container's name or IP address.
        System.setProperty("java.rmi.server.hostname", "my-rmi-server-container");

        int port = 1099;  // RMI registry port

        try {
            // Create the RMI registry on the specified port
            LocateRegistry.createRegistry(port);

            // Instantiate your service implementation
            ServiceBanqImpl od = new ServiceBanqImpl();
            System.out.println("Server: " + od.toString());

            // Retrieve the hostname from the system property
            String hostname = System.getProperty("java.rmi.server.hostname");

            // Bind the service to the RMI registry using the hostname and port
            String bindLocation = String.format("rmi://%s:%d/BK", hostname, port);
            Naming.rebind(bindLocation, od);

            System.out.println("Service bound at " + bindLocation);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
