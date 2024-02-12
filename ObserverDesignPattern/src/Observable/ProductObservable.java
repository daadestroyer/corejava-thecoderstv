package Observable;

import Observer.UserObserver;

public interface ProductObservable {
	public void subscribe(UserObserver userObserver);

	public void unsubscribe(UserObserver userObserver);

	public void notifyAllObserver();

	public void setStockCount(int stockCount);

	public int getStockCount();
}
