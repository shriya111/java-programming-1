package pro;

class customException extends Exception{
    public String getMessage() {
        return "Strings not allowed in this function";
    }

}
class gen{


    public <T> void genericFunction(T... args){
       int items = (args.length * 2)/3;
       try{
           for(T i : args){
               if(i instanceof String){
                    throw new customException();
               }
           }

           for(int i = 0; i <= items ; i ++){
               System.out.println(args[i]);
           }
       }catch(customException e){
           System.out.println(e.getMessage());
       }
    }
}

public class assignment8 {

    assignment8(){
        gen generic = new gen();
         generic.genericFunction(1,2,3,"String");
        generic.genericFunction(1,2,3,4,5,6,7,8,9,10);

    }

    public static void main(String[] args) {
        assignment8 test = new assignment8();
    }



}

