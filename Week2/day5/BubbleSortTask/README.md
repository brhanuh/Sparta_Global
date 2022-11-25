# Bubble Sort
Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the input list element by element, comparing the current element with the one after it, swapping their values if needed. These passes through the list are repeated until no swaps had to be performed during a pass, meaning that the list has become fully sorted. The algorithm, which is a comparison sort, is named for the way the larger elements "bubble" up to the top of the list.

## Solution
The solution involves a for loop inside a while loop.
The while loop will always run until the for loop makes a pass through the array without 
finding any swaps.

```java
    public static int[] sort(int[] arr){
        boolean pass = false;
        int current;
        while (pass==false){
            pass = true;
            for(int i = 0; i<arr.length-1; i++){
                current = arr[i];
                if(current > arr[i+1]){
                    arr[i] = arr[i+1];
                    arr[i+1] = current;
                    pass = false;
                }
            }
        }

        return arr;
    }
```