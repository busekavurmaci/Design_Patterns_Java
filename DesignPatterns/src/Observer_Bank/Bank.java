package Observer_Bank;

import java.util.ArrayList;


public class Bank implements ISubject{
	
	private ArrayList<IObserver> branches;
	
	private String branch1;
	private String branch2;
	private String branch3;

	public Bank() {
		branches = new ArrayList<IObserver>();
	}
	
	@Override
	public void addSubscriber(Observer_Bank.IObserver newBranch) {
		branches.add((IObserver) newBranch);
		System.out.println("Branch added.");
	}

	@Override
	public void removeSubscriber(Observer_Bank.IObserver deleteBranch) {
		int brancheIndex = branches.indexOf(deleteBranch);
		System.out.println("\n** Branch "+(brancheIndex + 1)+ " deleted. **\n");
		
		branches.remove(brancheIndex);
	}

	@Override
	public void notifySubscribers() {
		
		for(IObserver observer: branches)
		{
			observer.update(branch1, branch2, branch3);
		}
		
	}
	
	// Setter Methods
		public void setBranch1(String branch1) {
			this.branch1 = branch1;
			notifySubscribers();
		}

		public void setBranch2(String branch2) {
			this.branch2 = branch2;
			notifySubscribers();
		}

		public void setBranch3(String branch3) {
			this.branch3 = branch3;
			notifySubscribers();
		}
	
}
