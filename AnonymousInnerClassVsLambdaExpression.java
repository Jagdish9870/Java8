interface Students{
    public String id();
    public String name();
}

interface School{
    public String name();
}

public class AnonymousInnerClassVsLambdaExpression {
    public static void main(String[] args) {
        // lambda expression works on single abstract method while anonymous inner class is used for for than one abstract method exists..
        // lambda expression is more concise and readable than anonymous inner class.


        Students s= new Students(){   //anonymous inner class............

            @Override
            public String id() {
                return "12";
                  }

            @Override
            public String name() {
                return "shivam";
                    }
            
        };
        System.out.println(s.id());
        System.out.println(s.name());

        // functional interface (lambda expression).................................................
        School school=()-> {
            

            
                return "Mahi international school";
            
        };
        System.out.println(school.name());
    }
    


    
}
