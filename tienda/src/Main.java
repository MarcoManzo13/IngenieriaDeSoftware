public class Main {
    public static void main(String[] args) {
        PhoneData PhoneData = new PhoneData();
        Client1 client1 = new Client1(PhoneData);
        Client2 client2 = new Client2(PhoneData);
        Client3 client3 = new Client3(PhoneData);

        PhoneData.setVersion(8f);
        PhoneData.setVersion(11f);
        PhoneData.setVersion(12f);
    }
}