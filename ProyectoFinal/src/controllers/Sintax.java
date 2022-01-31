
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Jan 31 10:20:17 ECT 2022
//----------------------------------------------------

package controllers;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Jan 31 10:20:17 ECT 2022
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\002\004\000\002\003\014\000\002\003" +
    "\014\000\002\003\014\000\002\003\014\000\002\003\014" +
    "\000\002\003\014\000\002\003\014\000\002\003\014\000" +
    "\002\004\014\000\002\004\014\000\002\004\014\000\002" +
    "\004\014\000\002\004\014\000\002\004\014\000\002\004" +
    "\014\000\002\004\014\000\002\005\003\000\002\002\005" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\123\000\004\015\004\001\002\000\004\006\061\001" +
    "\002\000\004\016\011\001\002\000\004\002\007\001\002" +
    "\000\004\002\001\001\002\000\004\017\060\001\002\000" +
    "\004\006\012\001\002\000\006\011\013\012\014\001\002" +
    "\000\004\013\036\001\002\000\004\013\015\001\002\000" +
    "\006\004\017\005\016\001\002\000\004\011\027\001\002" +
    "\000\004\011\020\001\002\000\004\014\021\001\002\000" +
    "\004\007\022\001\002\000\006\011\023\012\024\001\002" +
    "\000\004\010\026\001\002\000\004\010\025\001\002\000" +
    "\004\017\ufff5\001\002\000\004\017\ufff7\001\002\000\004" +
    "\014\030\001\002\000\004\007\031\001\002\000\006\011" +
    "\032\012\033\001\002\000\004\010\035\001\002\000\004" +
    "\010\034\001\002\000\004\017\ufff1\001\002\000\004\017" +
    "\ufff3\001\002\000\006\004\040\005\037\001\002\000\004" +
    "\011\050\001\002\000\004\011\041\001\002\000\004\014" +
    "\042\001\002\000\004\007\043\001\002\000\006\011\044" +
    "\012\045\001\002\000\004\010\047\001\002\000\004\010" +
    "\046\001\002\000\004\017\ufff6\001\002\000\004\017\ufff8" +
    "\001\002\000\004\014\051\001\002\000\004\007\052\001" +
    "\002\000\006\011\053\012\054\001\002\000\004\010\056" +
    "\001\002\000\004\010\055\001\002\000\004\017\ufff2\001" +
    "\002\000\004\017\ufff4\001\002\000\004\002\uffef\001\002" +
    "\000\004\002\ufff0\001\002\000\006\011\062\012\063\001" +
    "\002\000\004\013\105\001\002\000\004\013\064\001\002" +
    "\000\006\004\066\005\065\001\002\000\004\011\076\001" +
    "\002\000\004\011\067\001\002\000\004\014\070\001\002" +
    "\000\004\007\071\001\002\000\006\011\072\012\073\001" +
    "\002\000\004\010\075\001\002\000\004\010\074\001\002" +
    "\000\004\016\ufffd\001\002\000\004\016\uffff\001\002\000" +
    "\004\014\077\001\002\000\004\007\100\001\002\000\006" +
    "\011\101\012\102\001\002\000\004\010\104\001\002\000" +
    "\004\010\103\001\002\000\004\016\ufff9\001\002\000\004" +
    "\016\ufffb\001\002\000\006\004\107\005\106\001\002\000" +
    "\004\011\117\001\002\000\004\011\110\001\002\000\004" +
    "\014\111\001\002\000\004\007\112\001\002\000\006\011" +
    "\113\012\114\001\002\000\004\010\116\001\002\000\004" +
    "\010\115\001\002\000\004\016\ufffe\001\002\000\004\016" +
    "\000\001\002\000\004\014\120\001\002\000\004\007\121" +
    "\001\002\000\006\011\122\012\123\001\002\000\004\010" +
    "\125\001\002\000\004\010\124\001\002\000\004\016\ufffa" +
    "\001\002\000\004\016\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\123\000\006\002\005\003\004\001\001\000\002\001" +
    "\001\000\004\004\007\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\005\056\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public Symbol s;
    
    public void syntax_error (Symbol s) {
        this.s = s;
    }

    public Symbol getS() {
        return this.s;
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // SENTENCIA ::= SENTENCIA_EC1 SENTENCIA_EC2 SOLUCION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SOLUCION ::= PALABRA_RESERVADA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SOLUCION",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // SENTENCIA_EC2 ::= ECUACION2 ASIGNACION NUMERO_NEGATIVO VARIABLEX RESTA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_NEGATIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC2",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SENTENCIA_EC2 ::= ECUACION2 ASIGNACION NUMERO_POSITIVO VARIABLEX RESTA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_NEGATIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC2",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SENTENCIA_EC2 ::= ECUACION2 ASIGNACION NUMERO_NEGATIVO VARIABLEX RESTA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_POSITIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC2",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA_EC2 ::= ECUACION2 ASIGNACION NUMERO_POSITIVO VARIABLEX RESTA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_POSITIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC2",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA_EC2 ::= ECUACION2 ASIGNACION NUMERO_NEGATIVO VARIABLEX SUMA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_NEGATIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC2",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA_EC2 ::= ECUACION2 ASIGNACION NUMERO_POSITIVO VARIABLEX SUMA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_NEGATIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC2",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA_EC2 ::= ECUACION2 ASIGNACION NUMERO_NEGATIVO VARIABLEX SUMA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_POSITIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC2",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA_EC2 ::= ECUACION2 ASIGNACION NUMERO_POSITIVO VARIABLEX SUMA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_POSITIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC2",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA_EC1 ::= ECUACION1 ASIGNACION NUMERO_NEGATIVO VARIABLEX RESTA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_NEGATIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC1",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA_EC1 ::= ECUACION1 ASIGNACION NUMERO_POSITIVO VARIABLEX RESTA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_NEGATIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC1",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA_EC1 ::= ECUACION1 ASIGNACION NUMERO_NEGATIVO VARIABLEX RESTA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_POSITIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC1",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA_EC1 ::= ECUACION1 ASIGNACION NUMERO_POSITIVO VARIABLEX RESTA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_POSITIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC1",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA_EC1 ::= ECUACION1 ASIGNACION NUMERO_NEGATIVO VARIABLEX SUMA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_NEGATIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC1",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIA_EC1 ::= ECUACION1 ASIGNACION NUMERO_POSITIVO VARIABLEX SUMA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_NEGATIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC1",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // SENTENCIA_EC1 ::= ECUACION1 ASIGNACION NUMERO_NEGATIVO VARIABLEX SUMA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_POSITIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC1",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // SENTENCIA_EC1 ::= ECUACION1 ASIGNACION NUMERO_POSITIVO VARIABLEX SUMA NUMERO_POSITIVO VARIABLEY IGUALDAD NUMERO_POSITIVO SEPARADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_EC1",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= SENTENCIA EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

