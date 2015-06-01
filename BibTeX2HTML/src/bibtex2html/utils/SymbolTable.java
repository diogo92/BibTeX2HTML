package bibtex2html.utils;

public class SymbolTable extends Object {


  public int type;  
  public String value; 

  public SymbolTable(int itype, String ivalue) {
    type=itype;
    value=ivalue;
  }
}