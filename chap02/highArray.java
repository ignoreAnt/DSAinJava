/**
 *	highArray.java
 *	Demonstrate array class with high-level interface.
 **/

class HighArray{

	private long[] array;		// ref to array
	private int nElements;		// number of data items

	public HighArray(int max){
		array = new long[max];
		nElements = 0;
	}

	public boolean find (long searchKey){
		int j;
		
		for( j =0; j < nElements; j++ ){
			if ( array[j] == searchKey ){
				break;
			}	
		}

		if( j == nElements ){
			return false;
		}else{
			return true;
		}
	} // end find()

	public void insert( long value ){
		array[nElements] = value;
		nElements++;
	}

	public boolean delete(long value){
		int j;
		for( j = 0; j < nElements; j++ ){
			if( value == array[j] ){
				break;
			}
		}
	
		if ( j == nElements ){
			System.out.println("Element not found!");
			return false;
		}else{
			
			for( int k = j ; k < nElements; k++ ){
				array[k] = array[k+1];
			}
	
			nElements--;
			System.out.println("Deleted Value : " + value);
			return true;
		}

	} // end delete()

	public void display(){

		for( int j = 0; j < nElements; j++ ){
			System.out.print( array[j] + " ");
		}
	
		System.out.println("");
	} // end display()
}// end class HighArray


class HighArrayApp{

	public static void main( String[] args ){

		int maxSize = 100; 		// array size
		HighArray arr;			// reference to array
		arr = new HighArray(maxSize);

		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);

		arr.display();

		int searchKey = 35;
	
		if ( arr.find(searchKey)){
			System.out.println( "Found " + searchKey);
		}else{
			System.out.println( "Can't find " + searchKey);
		}

		arr.delete(00);
		arr.delete(55);
		arr.delete(99);

		arr.display();

	} // end main()
} // end class HighArrayApp
