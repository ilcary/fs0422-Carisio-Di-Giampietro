package Esercizio_m1w2d1;

public class StudentVoteException extends Exception{
	
	private int errVote;
	
	public StudentVoteException(String message, int eV) {
		super(message);
		this.errVote = eV;
	}

	public int getErrVote() {
		return errVote;
	}

}
