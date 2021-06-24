package Observer_Bank;

public interface ISubject {

	public void addSubscriber(IObserver o);
    public void removeSubscriber(IObserver o);
    public void notifySubscribers();
}
