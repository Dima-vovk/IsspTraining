package ua;

public class Client {
private int number;
private double cash;
private String name;

public int getNumber() {
	return number;
}
public double getCash() {
	return cash;
}
public String getName() {
	return name;
}
public void setNumber(int nu) {
	number = nu;
}
public void setCash(double ca) {
	cash = ca;
}
public void setName(String na) {
	name = na;
}

public Client(int nu, double ca, String na) {
	setNumber(nu);
	setCash(ca);
	setName(na);
}
@Override
	public String toString() {
		return "[number = " + number + " cash = " + cash + " name = " + name + " ]";  
	}
}
