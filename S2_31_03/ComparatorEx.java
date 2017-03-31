package oops.S2_31_03;
import java.util.*;  
import java.util.Comparator;

public class ComparatorEx implements Comparable<ComparatorEx>{

	private String fruitName;
	private String fruitDesc;
	private int quantity;

	public ComparatorEx(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int compareTo(ComparatorEx compareFruit) {

		int compareQuantity = ((ComparatorEx) compareFruit).getQuantity();

		//ascending order
		return this.quantity - compareQuantity;

		//descending order
		//return compareQuantity - this.quantity;

	}

	public static Comparator<ComparatorEx> FruitNameComparator
                          = new Comparator<ComparatorEx>() {

	    public int compare(ComparatorEx fruit1, ComparatorEx fruit2) {

	      String fruitName1 = fruit1.getFruitName().toUpperCase();
	      String fruitName2 = fruit2.getFruitName().toUpperCase();

	      //ascending order
	      return fruitName1.compareTo(fruitName2);

	      //descending order
	      //return fruitName2.compareTo(fruitName1);
	    }

	};
}