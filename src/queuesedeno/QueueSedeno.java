
package queuesedeno;
import java.util.Queue;
import java.util.LinkedList;
public class QueueSedeno {

  
    public static void main(String[] args) {
        Queue<String>Students=new LinkedList<>();
       
         Students.offer("Anna");
          Students.offer("Ben");
           Students.offer("Carla");
           
           System.out.println("Served: " + Students.poll());
           Students.offer("Jearl");
           System.out.println("Front: " + Students.peek());
           System.out.println("Updated list of students: " + Students);
          while (!Students.isEmpty()){
               System.out.println("Served: " + Students.poll());
           }
    }
    
    
}
