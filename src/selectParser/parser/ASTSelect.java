/* Generated By:JJTree: Do not edit this line. ASTSelect.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package selectParser.parser;

public class ASTSelect extends SimpleNode {
  public ASTSelect(int id) {
    super(id);
  }

  public ASTSelect(SelectParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SelectParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=83b10c3ef47046350acd814a177c8786 (do not edit this line) */
