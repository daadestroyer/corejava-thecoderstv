

class PartnerSelection extends Thread{
	@Override
	public void run() {
		System.out.println("Partner Selected");
	}
}

class VenueFixing extends Thread{
	private PartnerSelection partnerSelection;
	public VenueFixing(PartnerSelection partnerSelection) {
		this.partnerSelection = partnerSelection;
	}

	@Override
	public void run() {
		try {
			partnerSelection.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("VenueFixing Selected");
	}
}

class CardsPrinting extends Thread{
	
	private VenueFixing venueFixing;
	public CardsPrinting(VenueFixing venueFixing) {
		 this.venueFixing = venueFixing;
	}

	@Override
	public void run() {
		try {
			venueFixing.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Cards Printing Done");
	}
}

class CardsDistribution extends Thread{
	
	private CardsPrinting cardsPrinting;
	
	public CardsDistribution(CardsPrinting cardsPrinting){
		this.cardsPrinting = cardsPrinting;
	}
	@Override
	public void run() {
		try {
			cardsPrinting.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Cards Distribtion Done");
	}
}

public class App11 {
	public static void main(String[] args) throws InterruptedException {
		PartnerSelection partnerSelection = new PartnerSelection();
		VenueFixing venueFixing = new VenueFixing(partnerSelection);
		CardsPrinting cardsPrinting = new CardsPrinting(venueFixing);
		CardsDistribution cardsDistribution = new CardsDistribution(cardsPrinting);
		
	
		cardsDistribution.start();
		cardsPrinting.start();
		venueFixing.start();
		partnerSelection.start();
		
		// part selecte
		// venu
		// card p
		// cards d
		
		
	}
}
