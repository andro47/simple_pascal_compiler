package compiler.abstree.tree;

import compiler.abstree.AbsVisitor;

/**
 * Prireditveni stavek.
 */
public class AbsAssignStmt extends AbsStmt {

	/** Izraz na levi strani prirejanja. */
	public AbsValExpr dstExpr;
	
	/** Izraz na desni strani prirejanja. */
	public AbsValExpr srcExpr;
	
	public boolean SpecialAuto = false;
	public String SpecialAutoName = "";
	public AbsVarDecl SpecialVarDecl;
	
	public AbsAssignStmt(AbsValExpr dstExpr, AbsValExpr srcExpr) {
		this.dstExpr = dstExpr;
		this.srcExpr = srcExpr;
	}
	
	public AbsAssignStmt(AbsVarDecl dstExpr, AbsValExpr srcExpr, boolean SpecialAuto) {
		this.srcExpr = srcExpr;
		this.SpecialVarDecl = dstExpr;
		this.SpecialAuto = true;
	}
	
	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
