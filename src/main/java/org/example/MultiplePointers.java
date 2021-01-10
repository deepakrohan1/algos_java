package org.example;

public class MultiplePointers {

    public String findSumZero (Integer[] arr) {
        int left = 0;
        int right = arr.length -1 ;
		
		while (left < right) {
			int sum = arr[left] + arr[right];
			
			if (sum < 0 ) {
				left ++;
			} else if ( sum > 0) {
				right --;
			} else {
				return "" + arr[left] + "," + arr[right];
			}
		}

                return null;
    }


    public String getUniqElementsInArr(Integer[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i ++;
                arr[i] = arr[j];
                System.out.println(arr[i]);
            }
        }
        return (i+1) + "";
    }
	
	public static void main(String[] args) {
		MultiplePointers m = new MultiplePointers();
		Integer[] arr = {-1, 0, 1,2,2,2,3};
        System.out.println(m.findSumZero(arr));

        System.out.println(m.getUniqElementsInArr(arr));
	}
}
