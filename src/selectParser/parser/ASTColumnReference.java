/* Generated By:JJTree: Do not edit this line. ASTColumnReference.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package selectParser.parser;

public class ASTColumnReference extends SimpleNode {
  public ASTColumnReference(int id) {
    super(id);
  }

  public ASTColumnReference(SelectParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SelectParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3b116565d4dad84321a60c7d6c3f2fd7 (do not edit this line) */
