public class VehicalParking {

    Node head;
    Node tail;
    int size;

    void parkingEnQueue(MovieTicket data)
    {
        size++;

        Node node=new Node();
        node.data=data;

        // For creating the 1st element of the Queue we will point both head and tail to same node
        if (head==null){
            head=node;
            tail=node;
        }
        else {
            // Adding element at the last position of the Queue
            Node temp=head;
            while (temp.nextNode !=null){
                // Iterate till the end
                temp=temp.nextNode;
            }
            temp.nextNode=node;
            tail=node;
        }

        System.out.println("[VehicleParking][parkingEnQueue] Node Created"+node+" Node Data"+node.data.carNumber+"Next Node:"+node.nextNode);

        System.out.println("Head:"+head.data.carNumber+" Tail:"+tail.data.carNumber);
    }

    void parkingDeQueue()
    {
        Node temp=head;
        if (head!=null){
            head=head.nextNode;
            size--;

            System.out.println("[VehicleParking][parkingDeQueue] Node Deleted"+temp+" Node Data"+temp.data.carNumber+"Next Node:"+temp.nextNode);
        }
        else {
            System.out.println("[VehicleParking][parkingDeQueue] No items to delete");
        }
    }

    void iterate(){
        System.out.println("[VehicleParking][iterate]Iterating the Queue");

        Node temp=head;
        while (temp.nextNode!=null)
        {
            System.out.println("[VehicleParking][iterate] Elements in the Queue are:"+temp.data.carNumber);
            temp=temp.nextNode;
        }
        //Printing the last element
        System.out.println("[VehicleParking][iterate] Elements in the Queue are:"+temp.data.carNumber);

    }

    String front(){
        if (size !=0)
        {
            return head.data.carNumber;
        }
        else {
            return null;
        }

    }


}
