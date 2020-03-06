
public class LongestSequenceIntegerInArray {

	public static void main(String[] args) {
		 int arr[] = { 1, 4, 3, 4, -6,  
                  2, 3, 4, -8, 5, 6 }; 
		//getLongestSeq(arr ,arr.length);
		sequenceNumber(arr ,arr.length);

	}
	
	 // Prints longest sequence of  
    // positive integers in an array. 
    static void getLongestSeq(int a[], int n) 
    { 
        // Variables to keep track of maximum 
        // length and  starting point of  
        // maximum length. And same for current 
        // length. 
        int maxIdx = 0, maxLen = 0, currLen = 0, currIdx = 0; 
      
        for (int k = 0; k < n; k++)  
        { 
            if (a[k] > 0) 
            { 
                currLen++; 
      
                // New sequence, store 
                // beginning index. 
                if (currLen == 1)  
                    currIdx = k;          
            } 
            else
            { 
                if (currLen > maxLen)  
                { 
                    maxLen = currLen; 
                    maxIdx = currIdx; 
                } 
                currLen = 0; 
            } 
        } 
      
        if (maxLen > 0)  
        { 
            System.out.print( "Length " + maxLen) ;  
            System.out.print( ",starting index " + maxIdx ); 
        } 
        else
            System.out.println("No positive sequence detected.") ; 
          
        return; 
    } 
    
    /**
     * max positive number sequence in array
     * 
     */

    public static void sequenceNumber(int arr[],int n) {
		
    	int currentlength = 0, currentIndex = 0, maxLength = 0, maxIndex = 0;
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]>0){
    			currentlength++;
    			if(currentlength==1){
    				currentIndex=i;	
    			}
    		}
    		else {
    			if(currentlength > maxLength){
    				maxLength=currentlength;
    				maxIndex=currentIndex;
    		}
    		currentlength = 0;
    		
    		}
    		
    		
    		
    	}
    	if(maxLength>0){
			System.out.println(maxIndex);
			System.out.println(maxLength);
		}
		else
            System.out.println("No positive sequence detected.") ; 
          
        return;
    	
    	
	}
    
}
