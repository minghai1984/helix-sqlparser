/* Generated By:JJTree: Do not edit this line. ASTHaving.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package selectParser.parser;

public class ASTHaving extends SimpleNode {
  public ASTHaving(int id) {
    super(id);
  }

  public ASTHaving(SelectParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SelectParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=15abc3a3acfc952c10d6f2344738e5cb (do not edit this line) */
