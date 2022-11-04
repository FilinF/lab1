import java.util.Scanner;
 class DynamicArrayExample1 {
    //string name;
    private int array[];
    private int count;
    private int sizeofarray;
    public DynamicArrayExample1()
    {
        array = new int[1];
        count = 0;
        sizeofarray = 1;
    }
    public void addElement(int a)
    {
        if (count == sizeofarray)
        {
            growSize();
        }
        array[count] = a;
        count++;
    }
    public void growSize()
    {
        int temp[] = null;
        if (count == sizeofarray)
        {
            temp = new int[sizeofarray + 1];
            {
                for (int i = 0; i < sizeofarray; i++)
                {
                    temp[i] = array[i];
                }
            }
        }
        array = temp;
        sizeofarray= sizeofarray + 1;
    }
    public void addElementAt(int index, int a)
    {
        if (count == sizeofarray)
        {
            growSize();
        }
        for (int i = count - 1; i >= index; i--)
        {
            array[i + 1] = array[i];
        }
        array[index] = a;
        count++;
    }




    public static void main(String[] args) {
        int element;
        int counter;
        element=9;
        counter=0;
        Scanner scanner = new Scanner(System.in);


        DynamicArrayExample1 da = new DynamicArrayExample1();
        System.out.println("Продолжайте ввод новых элементов, для окончания ввода введите 0");
        while (true) {
            if (scanner.hasNextInt()) {
                element = scanner.nextInt();
                System.out.println(element);
            } else {
                System.out.println("Вы ввели не целое число");
            }
            if (element == 0) break;
            da.addElement(element);
        }
        int summ=0;
        for (int i = 0; i < da.array.length; i++) {
            summ+=da.array[i];
        }
        System.out.println("For Сумма = "+summ);
        summ=0;
        while (counter != da.array.length)
        {
            summ+=da.array[counter];
            counter++;
        }
        System.out.println("While Сумма = "+summ);
        summ=0;
        counter=0;
        do {
            summ+=da.array[counter];
            counter++;
        } while(counter != da.array.length);
        System.out.println("Until Сумма = "+summ);
    }
}