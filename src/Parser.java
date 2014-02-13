/**
 * Created by steinar on 2/13/14.
 */
public class Parser {



    Lexer lexer;

    Token token;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Lexer getLexer() {
        return lexer;
    }

    public void setLexer(Lexer lexer) {
        this.lexer = lexer;
    }

    public Parser(Lexer lexer) {
        this.lexer = lexer;
    }

    public void parse(){

    }

}
