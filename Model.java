import java.util.*;

public class Model {
	public int total;
	public int current;
	public boolean sheep;
	
	public Model() {
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}
	public void increment() {
		current++;
	}
	public void decrement() {
		current--;
	}
	public void allSheets() {
		if( current== total) {
			sheep=true;
		}
		else {
			sheep=false;
			
		}
	}

	public boolean getSheep() {
		return sheep;
	}

	

	

	
}
