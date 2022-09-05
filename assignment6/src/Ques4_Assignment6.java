class Message{
    String text;
    int size;
    String sender;
    String receiver;

    public Message(String text, int size, String sender, String receiver) {
        this.text = text;
        this.size = size;
        this.sender = sender;
        this.receiver = receiver;
    }

    public Message() {
        this("NA",0,"NA","NA");
    }

    void sort(Message [] messages){

        int len= messages.length;
        for (int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){
                if (messages[i].size > messages[j].size){
                    Message temp=messages[i];
                    messages[i]=messages[j];
                    messages[j]=temp;
                }
            }
        }
        System.out.println("Normal sorted array is:");
        for (Message ele:messages) {
            System.out.println(" "+ele.text+" "+ele.size+" "+ele.sender+" "+ele.receiver);
        }

    }
    static void swap(Message[] messages, int i,int j){
        if (messages[i].size>messages[j].size){
            Message temp=messages[i];
            messages[i]=messages[j];
            messages[j]=temp;
        }

    }
    static int partition(Message [] messages,int low, int high){
        int pivot=messages[high].size;

        int i=(low-1);
        for (int j=low;j<=high-1;j++){

            if (messages[j].size < pivot){
                i++;
                swap(messages,i,j);
            }
        }
        swap(messages,i+1,high);
        return  (i+1);
    }
    Message [] quick_Sort(Message [] messages,int low,int high){
        //int pivot= (messages.length/2);

        if (low < high){
            int pi=partition(messages,low,high);
            quick_Sort(messages,low,pi-1);
            quick_Sort(messages,pi+1,high);
        }
        return messages;
    }
     void printArray(Message [] messages){
        System.out.println("Quick Sorted Array by size:");
        for (Message ele:messages) {

            System.out.println(" "+ele.text+" "+ele.size+" "+ele.sender+" "+ele.receiver);
        }
    }

}
public class Ques4_Assignment6 {

    public static void main(String [] args){

        Message message[]=new Message[5];
        Message message1=new Message("hello world",10,"abcd","bcde");
        Message message2=new Message("hello world2",40,"abcd","bcde");
        Message message3=new Message("hello world3",30,"abcd","bcde");
        Message message4=new Message("hello world4",60,"abcd","bcde");
        Message message5=new Message("hello world5",100,"abcd","bcde");

        message[0]=message1;
        message[1]=message2;
        message[2]=message3;
        message[3]=message4;
        message[4]=message5;
        Message obj=new Message();
       // obj.sort(message);
        int len= message.length;
        Message arr[]= obj.quick_Sort(message,0,len-1);
        obj.printArray(arr);
    }
}
