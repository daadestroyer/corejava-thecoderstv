package Observable;

import java.sql.Date;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import Observer.UserObserver;

public class IphoneObservableImpl implements ProductObservable {

	int stockCount = 0;

	List<UserObserver> listOfUserObservers = new ArrayList<>();

	@Override
	public void subscribe(UserObserver userObserver) {
		this.listOfUserObservers.add(userObserver);
	}

	@Override
	public void unsubscribe(UserObserver userObserver) {
		this.listOfUserObservers.remove(userObserver);
	}

	@Override
	public void notifyAllObserver() {
		System.out.println(LocalTime.now());
		for (UserObserver userObserver : listOfUserObservers) {
			userObserver.update();
		}

	}

	@Override
	public void setStockCount(int stockCount) {
		if (this.stockCount == 0) {
			notifyAllObserver();
		}
		this.stockCount += stockCount;

	}

	@Override
	public int getStockCount() {
		return this.stockCount;

	}

}
