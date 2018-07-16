class Err {
    String msg;
    int severity;

    Err (String msg, int severity){
        this.msg = msg;
        this.severity = severity;
    }
}

class ErrorInfo {
    String msg [] = {
            "Błąd wyjścia",
            "Błąd wejscia",
            "Dysk pełny",
            "Index spoza dozwolonego zakresu",
    };
    int howbad[] = { 3, 3 , 2 , 4 };

    Err getErrorInfo (int i){
        if ( i >=0 & i < msg.length)
            return new Err(msg[i], howbad[i]);
        else
            return new Err("niepoprawny kod błędu", 0);
    }
}

public class ErrInfo {
    public static void main(String args[]){
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo (2);
        System.out.println(e.msg + ". poziom bledu: " + e.severity);
    }
}
