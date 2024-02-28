package exceptions;

// Lave vores egen exception

public class DatabaseException extends Exception{

    public DatabaseException (String msg){
        super(msg);
    }

    public DatabaseException(){
        super();
    }



}
