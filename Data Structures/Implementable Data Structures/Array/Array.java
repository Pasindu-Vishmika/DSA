public class Array {

    private static Object[] array = new Object[10];

    public static void DiplayElements(){
        if (array[0]==null){
            System.out.println("This Array was Empty");
        }else{
            for (int i = 0; i < array.length && array[i] != null; i++) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void addElementToEnd(Object ele){
        if (array[array.length-1]!= null){
            System.out.println("Overflow");
        }else{
            int i = 0;
            int temp =0;
            while (array[i]!=null) {
                ++i;
                temp =i;
            }
            array[temp]=ele;          
        }
    }
    public static void addElementToBegining(Object ele){
        if (array[array.length-1]!= null){
            System.out.println("Overflow");
        }else{
            int i = 0;
            int temp =0;
            while (array[i]!=null) {
                ++i;
                temp =i;
            }
            for (int x= temp; x>0; x-- ){
                array[x] = array[x-1];
            }
            array[0]=ele;
        }
    }
    public static int search(Object ele){
        for (int i= 0 ;array[i]!= null;i++){
            if (array[i]==ele) return i;
        }
        return -1;
    }
    public static void removeElement(Object ele){
        if (search(ele) !=-1){
            int i = 0;
            int temp =0;
            while (array[i]!=null) {
                ++i;
                temp =i;
            }
            for (int t  = search(ele);t<temp;t++){
                array[t]= array[t+1];
            }
            
        }else{
            System.out.println("Can't Delete this Element because '"+ele+"' not in Array");
        }
    }
    public static void main(String[] args) {
        addElementToEnd(20);
        addElementToBegining(30);
        DiplayElements();
        removeElement(10);
        addElementToEnd(20);
        addElementToBegining(300);
        addElementToEnd(200);
        DiplayElements();
        removeElement(30);
        DiplayElements();
    }
}
