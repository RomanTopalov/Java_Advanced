package qew.qwe;

public class OficeWorker implements Work,Rest {

	@Override
	public void work() {
		System.out.println("ofice work" + Work.a);
	}

	@Override
	public void rest() {
		System.out.println("i`m rest in ofice");
	}
	

}
