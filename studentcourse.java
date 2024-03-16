

public class studentcourse{
    
    String[] Course = {"Machine_learning","Software_testing","C_Sharp","Devops"};
    float[] marks = {88,35,38,66};

  
    void get_course(){
    System.out.println("Courses Registered:");
        for(int i=0;i<Course.length;i++){
            
            System.out.println("\t"+Course[i]);
            
        }

    }
void get_marks(){

        for(int i=0;i<Course.length;i++){
            if(marks[i]<40){

            System.out.println(Course[i] +"="+marks[i]);
        }
    }
}
}