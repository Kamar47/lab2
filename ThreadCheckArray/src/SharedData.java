import java.util.ArrayList;

/** Shared object that stores the data used by the threads.
  It contains the input array, the result array, a flag that
  indicates whether a solution was found, and the target number b.*/
public class SharedData 
{
	private ArrayList<Integer> array;/**The input array stored as an ArrayList of integers.*/
	private boolean [] winArray; /**Boolean array that stores the result for each index.*/
	private boolean flag;/** Indicates whether at least one valid solution was found.*/
	private final int b;/**The target number to be checked in the array.*/
	
	/**Creates a SharedData object with the given array and target number.
	 * @param array the input array
	 * @param b the target number*/
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}
    /**Returns the boolean result array.*/
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	/**Sets the boolean result array.
	* @param winArray the result array to set*/
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
    /**Returns the input array.*/
	public ArrayList<Integer> getArray() 
	{
		return array;
	}
    /**Returns the target number.*/
	public int getB() 
	{
		return b;
	}
	/**Returns whether a solution was found.*/
	public boolean getFlag() 
	{
		return flag;
	}
	/**Sets the solution flag.
	* @param flag the flag value to set */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}