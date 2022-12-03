// Her hata Exception sinifindan miras alir.
public class ZeroDivisionException extends Exception{
    public ZeroDivisionException(String errorMessage){
        // Exception sinifinin constructor'ina aldigi
        // string degiskeni hata mesajini olusturur.
        super(errorMessage);
    }
}
