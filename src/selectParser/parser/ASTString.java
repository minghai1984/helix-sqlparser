/* Generated By:JJTree: Do not edit this line. ASTString.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package selectParser.parser;

public class ASTString extends SimpleNode {
  public ASTString(int id) {
    super(id);
  }

  public ASTString(SelectParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SelectParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b4c50b3a4fc453a128e14c20995b7b8a (do not edit this line) */
