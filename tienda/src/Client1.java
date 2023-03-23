public class Client1 implements Observer, DisplayElement{
    private float currentVersion = 10f;
    private float latestVersion;
    private PhoneData PhoneData;
    public Client1 (PhoneData PhoneData){
        this.PhoneData = PhoneData;
        PhoneData.registerObserver(this);
    }

    @Override
    public void display() {
        if (currentVersion > latestVersion){
            System.out.println(("Client 1: There is a new version." + currentVersion));
        } 
    }

    @Override
    public void update(float v) {
        latestVersion = currentVersion;
        currentVersion = v;
        display();
    }
}
