package controllers;
import models.Tokens;
%%
%class Lexer
%type Tokens

letter = [a-z]
digit = [1-9]
number = [0-9]
equation = "EC"
e_number = [1-2]
P = "+"?{digit}
N = "-"{digit}
DP = "+"?{digit}"."{number}
DN = "-"{digit}"."{number}
E = {equation}{e_number}
space=[ ,\t,\r,\n ]+
%{
    public String lexem;
%}
%%
{space} {/*Ignore*/}
"//".* {/*Ignore*/}
"+" {lexem=yytext(); return Tokens.SUMA;}
"-" {lexem=yytext(); return Tokens.RESTA;}
"*" {lexem=yytext(); return Tokens.MULTIPLICACION;}
"=>" {lexem=yytext(); return Tokens.ASIGNACION;}
"=" {lexem=yytext(); return Tokens.IGUALDAD;}
";" {lexem=yytext(); return Tokens.SEPARADOR;}
{P}+ {lexem=yytext(); return Tokens.ENTERO_POSITIVO;}
{N}+ {lexem=yytext(); return Tokens.ENTERO_NEGATIVO;}
{DP}+ {lexem=yytext(); return Tokens.DECIMAL_POSITIVO;}
{DN}+ {lexem=yytext(); return Tokens.DECIMAL_NEGATIVO;}
"x" {lexem=yytext(); return Tokens.VARIABLEX;}
"y" {lexem=yytext(); return Tokens.VARIABLEY;}
{E} {lexem=yytext(); return Tokens.ECUACION;}
"solucionar" {lexem=yytext(); return Tokens.PALABRA_RESERVADA;}
. {lexem=yytext(); return Tokens.ERROR;}

