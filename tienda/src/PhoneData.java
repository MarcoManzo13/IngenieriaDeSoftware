import java.util.ArrayList;

public class PhoneData implements Subject{
    private float version;
    private ArrayList observers;

    public PhoneData() {
        observers = new ArrayList(); 
    }
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i=0; i< observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(version);
        }
    }

    public void versionChanged() {
        notifyObservers();
    }

    public void setVersion(float version) { 
        this.version = version;        
        versionChanged();
    }

    public float getVersion() {
        return version;
    }
}
