package controllers;
import java_cup.runtime.Symbol;
%%
%public
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
digit = [1-9]+
number = [0-9]+
N = "-"?{digit}"."?{number}?

space=[ ,\t,\r,\n ]+
%{
    private Symbol symbol (int type, Object value) {
        return new Symbol (type,yyline,yycolumn,value);
    }
    private Symbol symbol (int type) {
        return new Symbol (type,yyline,yycolumn);
    }
%}
%%
/* Espacios en blanco */
{space} {/*Ignore*/}

/* Comentarios */
("//"(.)*) {/*Ignore*/}

("+") {return new Symbol(sym.SUMA, yychar, yyline,yytext());}
("-") {return new Symbol(sym.RESTA, yychar, yyline,yytext());}
(":") {return new Symbol(sym.ASIGNACION, yychar, yyline,yytext());}
("=") {return new Symbol(sym.IGUALDAD, yychar, yyline,yytext());}
(";") {return new Symbol(sym.SEPARADOR, yychar, yyline,yytext());}
{N} {return new Symbol(sym.NUMERO, yychar, yyline,yytext());}
"x"   {return new Symbol(sym.VARIABLEX, yychar, yyline,yytext());}
"y"   {return new Symbol(sym.VARIABLEY, yychar, yyline,yytext());}
"EC1"   {return new Symbol(sym.ECUACION1, yychar, yyline,yytext());}
"EC2"   {return new Symbol(sym.ECUACION2, yychar, yyline,yytext());}
"solucionar" {return new Symbol(sym.PALABRA_RESERVADA, yychar, yyline,yytext());}
.     {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
