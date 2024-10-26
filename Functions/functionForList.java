package Functions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class functionForList {
    

    private static class StuData{
        private String name;
        private int id;
        public StuData(int id,String name ) {
            this.name = name;
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        @Override
        public String toString() {
            return "StuData [name=" + name + ", id=" + id + "]";
        }
       

        
    }
    public static void main(String[] args) {

        // taking and returning string ..........................
        // Function<String ,String> function2= s-> s.substring(0,3);

        // System.out.println(function2.apply("rajkumar"));

        Function<String ,String> function2= s-> s.substring(0,3);
        Function<List<StuData>,List<StuData>> listofHavingJagPrefix=li->{

            List<StuData> result=new ArrayList<>();
            for( StuData s:li){
                if(function2.apply(s.getName()).equalsIgnoreCase("jac")){
                    result.add(s);

                }

            }
            return result;

        };
        StuData s1=new StuData(12, "jacky");
        StuData s2=new StuData(15, "jackson");
        StuData s3=new StuData(5, "johnjack");
        List<StuData> students=Arrays.asList(s1,s2,s3);
        List<StuData> modifiedResult=listofHavingJagPrefix.apply(students);
        System.out.println(modifiedResult);


    }
    
}
