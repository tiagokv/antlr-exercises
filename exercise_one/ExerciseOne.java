public class ExerciseOne extends ExerciseOneBaseVisitor<Integer>{

//  public Integer count;

  public ExerciseOne(){
	  super();
//	  count = new Integer(0);
  }

  @Override
  public Integer visitDep(ExerciseOneParser.DepContext ctx) {
    //System.out.println("DepContext " + ctx);
    if( ctx.op.getType() == ExerciseOneParser.APOS ){
    	//System.out.println("Processando APOS");
    	Integer right = visit(ctx.comando(1));
    	Integer left  = visit(ctx.comando(0));
    	return right + left;
    }else{
//    	System.out.println("left");
    	Integer left  = visit(ctx.comando(0));
//    	System.out.println("right");
    	Integer right = new Integer(0);
//    	System.out.println("comando123");
//    	System.out.println("comando321");
    	if( ctx.comando(1) != null ){
    		right = visit(ctx.comando(1));
    	}
    	if (right != null)
    		return right + left;
    	else
    		return left;
    }
  }

  @Override
  public Integer visitBas(ExerciseOneParser.BasContext ctx) {
    //System.out.println("BasContext " + ctx.basico());
    return visitChildren(ctx);
  }

  @Override
  public Integer visitPars(ExerciseOneParser.ParsContext ctx){
    return visit(ctx.comando());
  }

  @Override
  public Integer visitBasico(ExerciseOneParser.BasicoContext ctx){
//	  System.out.println("BasicoContext " + ctx.INT());
//	  count += new Integer(ctx.INT().getText());
//	  return super.visitBasico(ctx);
	  return new Integer(ctx.INT().getText());
  }

//  public Integer getCount(){
//	  return count;
//  }

}
