package Classes;

public abstract class Identifier {

	protected static int istances;
	protected long id;

	protected Identifier() {
		id = istances;
		istances++;
	}

	public long getId() {
		return id;
	}

}
