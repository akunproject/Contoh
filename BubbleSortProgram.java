public class BubbleSortProgram {
    public static void main(String[] args) {
        int[] angka = {3,4,1,5,2};
        int i,j,k,temp;
        
        System.out.println("Sebelum diurutkan:");
        for(i=0;i < angka.length;i++){
            System.out.print(angka[i] + " ");
        }
        
        System.out.print("\n");
        for(i=1; i < angka.length-1;i++){
            System.out.println("\nIterasi "+ i);
            for(j=angka.length-1;j >=i; j--){
                if(angka[j] < angka[j-1]){
                    temp = angka[j];
                    angka[j] = angka[j-1];
                    angka[j-1] = temp;
                }
                for(k=0;k < angka.length; k++){
                    System.out.print(angka[k]+"\t");
                }
                System.out.println();
            }
        }
        
        System.out.println("\nSetelah diurutkan:");
        for(i=0; i < angka.length;i++) {    
            System.out.print(angka[i]+" ");
        }
        System.out.println("\nTest1");
    } 
}
