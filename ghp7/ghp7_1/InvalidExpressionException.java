/**
 * Created by hajizar on 11/2/2016.
 */
public class InvalidExpressionException extends Exception{
    InvalidExpressionException(String message, Exception e){
        super(message, e);
    }
}
