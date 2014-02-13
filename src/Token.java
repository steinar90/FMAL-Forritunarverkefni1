/**
 * Created by steinar on 2/13/14.
 */
public class Token {


    String lexeme;
    TokenCode tCode;

    enum TokenCode { ID, ASSIGN, SEMICOL, INT, PLUS, MINUS, MULT, LPAREN, RPAREN, PRINT, END, ERROR}


    public String getLexeme() {
        return lexeme;
    }

    public void setLexeme(String lexeme) {
        this.lexeme = lexeme;
    }

    public TokenCode gettCode() {
        return tCode;
    }

    public void settCode(TokenCode tCode) {
        this.tCode = tCode;
    }


}
