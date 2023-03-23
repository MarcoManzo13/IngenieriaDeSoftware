public class Client2 implements Observer, DisplayElement{
    private float currentVersion = 10f;
    private float latestVersion;
    private PhoneData PhoneData;
    public Client2 (PhoneData PhoneData){
        this.PhoneData = PhoneData;
        PhoneData.registerObserver(this);
    }

    @Override
    public void display() {
        if (currentVersion > latestVersion){
            System.out.println(("Client 2: There is a new version." + currentVersion));
        } 
    }

    @Override
    public void update(float v) {
        latestVersion = currentVersion;
        currentVersion = v;
        display();
    }
}
