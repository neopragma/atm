package discrete.io;

public interface DioHandler {

	static final int OPER = 0;
	static final int TRAY1 = 1;
	static final int TRAY2 = 2;
	static final int TRAY3 = 3;
	static final int TRAY4 = 4;
	static final int TRAY5 = 5;
	static final int EMPTY = 6;
	static final int FAULT = 7;
	
	public abstract int get(int line, long timeout);
	public abstract void put(int line);
	
}
