class Marathon 
{
	// Find the index with the smallest number
	static int getSmallestIndex(int[] array)
	{
		// Initialize the minimum value to be the biggest integer value
		int min_val = Integer.MAX_VALUE;
		// Set the minimum index to be -1
		int min_index = -1;
		
		// Loop through and find the smallest value and the index to it
		for (int i=0; i<array.length; i++)
		{
			if (array[i] <= min_val)
			{
				min_val = array[i];
				min_index = i;
			}
		}
		
		return min_index;
	}
	
    public static void main (String[] arguments) 
    {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        
        // Part 1
        // Find the fastest runner
        
        // Function finds the index with the smallest value
        int fastest_index = getSmallestIndex(times);
        
        // Print out the fastest runner
        System.out.println("The fastest runner is " + names[fastest_index] + " with time " + times[fastest_index] + ".");
    }
} 