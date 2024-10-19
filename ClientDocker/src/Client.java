import java.rmi.Naming;
import java.util.Scanner;
import rmi.ServiceBanque;

public class Client {

    public static void main(String[] args) {
        // Use the RMI server's container name as the host
        String host = "my-rmi-server-container"; // Container name of the RMI server
        int port = 1099;  // RMI registry port

        try {
            // Lookup the service from the RMI registry using the host and port
            String lookupLocation = String.format("rmi://%s:%d/BK", host, port);
            ServiceBanque stub = (ServiceBanque) Naming.lookup(lookupLocation);

            Scanner sc = new Scanner(System.in);
            System.out.println("Give a number to convert");
            int nbr = sc.nextInt();

            // Invoke the remote method on the RMI server
            System.out.println("Conversion result: " + stub.conversion(nbr));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
