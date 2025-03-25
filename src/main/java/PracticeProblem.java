public class PracticeProblem {

//1. Create a function called _createIntArray()_.  It has no parameters. Store the integers 1-5 into an array using a loop.  Return the array.
	public static int[] createIntArray() {
		int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = i + 1;
        }
        return array;
	}

//2. Create a function called _createArray()_.  It has 4 Strings as parameters.  Store the four string in the array in the order of their parameters.   Return the arrays.
	public static String[] createArray(String word1, String word2, String word3, String word4) {
		String[] array = {word1, word2, word3, word4}; 
		return array;
	}
//3. Create a function called _findValue()_ which takes in an integer and an integer array as parameters.  Return the index of the first occurance of the integer in the array.  return -1 if the integer is not in the array.
	public static int findValue(int num, int[] array) {
		for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }
	
//4. Create a function called _findThirdValue()_ which take in an String and an String array as parameters.  Return the index of the third occurance of the String in the array.  return -1 if the String is not in the array.
	public static int findThirdValue(String word, String[] array) {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
            if (array[i] == word) {
				counter++;
            }
			if (counter == 3) {
				return i;
			}
        }
        return -1;
    }
	}

