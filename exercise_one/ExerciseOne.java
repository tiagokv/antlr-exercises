

public class ExerciseOne<Integer> extends ExerciseOneBaseVisitor<T>{

  @Override
  public Integer visitDep(ExerciseOneParser.DepContext ctx) {

    return visitChildren(ctx);

  }

  @Override
  public Integer visitBas(ExerciseOneParser.BasContext ctx) {
    
    return visitChildren(ctx);
  }
}
