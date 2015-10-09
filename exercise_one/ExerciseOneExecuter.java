import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class ExerciseOneExecuter {

    public static void main(String[] args) throws Exception {

        String inputFile = null;

        if ( args.length > 0 )
          inputFile = args[0];

        InputStream is = System.in;

        if ( inputFile != null )
          is = new FileInputStream(inputFile);

        ExerciseOneLexer lexer   = new ExerciseOneLexer( new ANTLRInputStream(is) );
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExerciseOneParser parser = new ExerciseOneParser(tokens);

        ParseTree tree = parser.init(); // parse

        ExerciseOne eval = new ExerciseOne();
        Integer count = eval.visit(tree);

    	System.out.println("O total de " + count + " passos foram feitos");
        
    }

}
