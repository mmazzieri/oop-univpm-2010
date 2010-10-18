package it.univpm.progogg.patterns.state;

public abstract class State {
	protected Context c;
	
	protected State(Context c) {
		this.c = c;
	}
	
	public abstract void handle();
	public abstract void registra();
}

class OnState extends State {

	protected OnState(Context c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registra() {
		// TODO Auto-generated method stub
		
	}
	
}