package Antrian;
public class queue {
    private int ukuran;
    private long[] antrean;
    private int belakang;
    private int jumlah;
    private int depan;
    
    public queue(int data){
        ukuran = data;
        antrean = new long[ukuran];
        depan = 0;
        belakang = -1;
        jumlah = 0;
    }
    
    public void enqueue(long data){
        if (!isFull()){
            antrean[++belakang] = data;
            jumlah++;
        }
    }
    
    public long dequeue(){
        long temp = antrean[0];
        if (!isEmpty()){
            for (int i=0; i<jumlah; i++)
                antrean[i] = antrean[i+1];
                jumlah--;
                belakang--;
            
        }
        return temp;
    }
    
    public boolean isEmpty(){
        return (jumlah == 0);
    }
    
    public boolean isFull(){
        return (belakang == ukuran-1);
    }
    
    public long peek(){
        return antrean[depan];
    }
    
    public int ukuran(){
        return ukuran;
    }
    
    public void show(){
        for (int i=0; i<jumlah; i++)
            System.out.print(antrean[i]+" ");
        System.out.println("");
    }
}

