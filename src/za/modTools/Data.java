package za.modTools;

public class Data
{
    public String[] list1;
    public String[] list2;
    public String list1Name;
    public String list2Name;

    public void setList1(String list1)
    {
        this.list1 = list1.split("\n");
        for (int x = 0; x < this.list1.length; x++)
        {

            this.list1[x] = this.list1[x].substring(11);
        }
    }

    public void setList2(String list2)
    {
        this.list2 = list2.split("\n");

        for (int x = 0; x < this.list2.length; x++)
        {

            this.list2[x] = this.list2[x].substring(11);
        }
    }

    public void setList1Name(String list1Name)
    {
        this.list1Name = list1Name;
    }

    public void setList2Name(String list2Name)
    {
        this.list2Name = list2Name;
    }

    public void SortLists()
    {
        quickSort(list1,0,list1.length-1);
        quickSort(list2,0,list2.length-1);

    }
    private void quickSort(String[] list, int low, int high)
    {
           if(low<high)
           {
               int pi = partition(list,low,high);

               quickSort(list,low,pi-1);
               quickSort(list,pi+1,high);
           }
    }
    private int partition(String[] list, int low, int high)
    {
        String pivot = list[high];
        int i = low-1;
        for(int j = low;j<high;j++)
        {
            if(list[j].compareTo(pivot)<=0)
            {
                i++;
                swap(list,i,j);
            }
        }
        swap(list, i+1,high);
        return i+1;

    }
    private void swap(String[] list, int a, int b)
    {
        String temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    public String showDifference(String[] listA, String[] listB)
    {
        String output = "";
        int a=0, b=0;
        while(a<listA.length&&b<listA.length)
        {
            String modA = listA[a];
            String modB= listB[b];
            if(modA.equals(modB))
            {
                a++;
                b++;
            }
            else if(modA.compareTo(modB)<0)
            {
                output += modA+"\n";
                a++;
            }
            else
            {
                b++;
            }

        }
        while(a<listA.length)
        {
            output+=listA[a];
            a++;
        }

        return output;
    }

}
