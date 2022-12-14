package Builder;

public class BuilderRunner {
    public static void main(String[] args) {
        Client client1 = new Client.Builder()
                .setFirstName("Nano")
                .setLastName("Volt")
                .setBalance(3050)
                .setBank("MonoBank")
                .build();

        System.out.println(client1);

        Client client2 = new Client.Builder()
                .setFirstName("Nano")
                .setLastName("Volt")
                .setBalance(1660)
                .build();

        System.out.println(client2);
    }
}
