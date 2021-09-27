package com.example.demo;
/**
 * MyCollection class responsible for the logic of main methods that used while working with collection
 */
public class MyCollection {

    private static int[] array;
    private static int size;

    /**
     * Method responsible for returning size of collection
     * @return amount of elements of collection
     */
    public static int getSize(){
        return size;
    }

    public  MyCollection(){
        array = new int[0];
    }


    /**
     * Method responsible for adding element to collection
     * @param x value of element
     * @return Adding Result
     */
    public boolean Add(int x) {
        if (array.length == 0)
            array = new int[1];
        else {
            int[] temp = new int[array.length + 1];
            System.arraycopy(array, 0, temp, 0, temp.length - 1);
            array = new int[array.length + 1];
            System.arraycopy(temp, 0, array, 0, array.length-1);
        }
        array[array.length - 1] = x;
        size++;
        return true;
    }
    /**
     * Method responsible for deleting element from collection
     * @param x value of element
     * @return Deleting Result
     */
    public boolean Remove(int x) {
        if (array.length == 0) return false;
        else {
            int[] temp = new int[array.length - 1];
            System.arraycopy(array, 0, temp, 0, x);
            System.arraycopy(array, x + 1, temp, x, temp.length - x);
            array = new int[array.length - 1];
            System.arraycopy(temp, 0, array, 0, array.length);
            size--;
            return true;
        }
    }
    /**
     * Method responsible for finding element in collection by value
     * @param x value of element
     * @return Finding Result
     */
    public boolean valueSearch(int x) {
        boolean flag=false;
        for (int i=0;i<array.length;++i) {
            if (array[i]==x)
                flag=true;
            break;
        }
        return flag;
    }

    /**
     * Method responsible for finding element in collection by index
     * @param x index of element
     * @return Finding Result
     */
    public String indexSearch(int x) {
        if (x<array.length) {
            System.out.println(array[x]);
            return "Элемент найден";
        }
        else {
            return "Элемент не найден";
        }
    }

    /**
     * Method responsible for finding max element in collection
     * @return Maximum Element
     */
    public int Maximum() {
        if (array.length == 0) return 0;
        else {
            int x = array[0];
            for (int i = 1; i < array.length; ++i) {
                if (array[i] > x)
                    x = array[i];
            }
            return x;
        }
    }

    /**
     * Method responsible for finding min element in collection
     * @return Minimum Element
     */
    public int Minimum() {
        if (array.length == 0) return 0;
        else {
            int x = array[0];
            for (int i = 1; i < array.length; ++i) {
                if (array[i] < x)
                    x = array[i];
            }
            return x;
        }
    }

    /**
     * Method responsible for calculating average value of elements in collection
     * @return Average Value
     */
    public double Average() {
        double s=0;
        if (array.length ==0)
            return 0;
        else {
            for (int i = 0; i < array.length; ++i)
                s += array[i];
            return s / (array.length);
        }
    }
}