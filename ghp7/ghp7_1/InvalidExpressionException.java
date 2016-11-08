/*  ghp7 part 1 test InvalidExpressionException
 Inherits from Exception class
 Written by Rufat Hajizada for CS249
 Language: Java
*/
public class InvalidExpressionException extends Exception{
    InvalidExpressionException(String message, Exception e){
        super(message, e);
    }
}
