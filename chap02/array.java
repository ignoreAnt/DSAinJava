/**
 *  array.java
 *  Demonstrates Java arrays.
 **/

class ArrayApp{

	public static void main( String[] args ){
	
		long[] arr; 		// reference to array
		arr = new long[100]; 	// make array
		int nElems = 0;		// number of items
		int j; 			// loop counter
		long searchKey; 	// key of the item to search for

		arr[0] = 77;		// insert 10 items
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;

		nElems = 10;

		System.out.println( " Printing all the elements in the array : ");

		for(j = 0; j < nElems; j++){
			System.out.print( arr[j] + " ");
		}
		System.out.println("");

		searchKey = 66;		//find item with key 66
	
		System.out.println( " finding the element 66 in the array ... " );
		for( j=0; j < nElems; j++ ){
			if(arr[j] == searchKey){
				break;
			}

		}


		if( j == nElems ){
			System.out.println("Can't find " + searchKey );
		}else{
			System.out.println("Found " + searchKey );
		}

		// Delete an item with key 55

		System.out.println("Deleting the element 55 from the array ");
		searchKey = 55;
		for( j = 0; j < nElems; j++ ){
			if( arr[j] == searchKey ){
				break;
			}
		}

		for( int k = j; k < nElems - 1; k++ ){
			arr[ k ] = arr[k+1];
		}
		
		// decrement size

		nElems--;

		// display Item
		
		System.out.println("Displaying array after the deletion of 55 from array..");
		for ( j = 0; j < nElems; j++ ){
			System.out.print( arr[j] + " " );
		}
		System.out.println("");

	} // end main()
} // end class ArrayApp
