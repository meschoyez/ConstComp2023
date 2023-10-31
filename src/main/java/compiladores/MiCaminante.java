package compiladores;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.compiladoresParser.DeclaracionContext;
import compiladores.compiladoresParser.DefinicionContext;
import compiladores.compiladoresParser.Lista_varContext;
import compiladores.compiladoresParser.ProgramaContext;

public class MiCaminante extends compiladoresBaseVisitor<String> {

    @Override
    public String visitPrograma(ProgramaContext ctx) {
        System.out.println("Comienza el camino");
        return super.visitPrograma(ctx);
    }

    @Override
    public String visitDeclaracion(DeclaracionContext ctx) {
        String tmp;
        System.out.println(" ** Declaracion : " + ctx.getText());        
        System.out.println("   --> hijos = " + ctx.getChildCount());        
        if (ctx.getChild(2).getChildCount() > 0) {
            tmp = visitDefinicion((DefinicionContext)ctx.getChild(2));
        }
        if (ctx.getChild(3).getChildCount() > 0) {
            tmp = visitLista_var((Lista_varContext)ctx.getChild(3));
        }
        return null;
    }

    @Override
    public String visitDefinicion(DefinicionContext ctx) {
        System.out.println(" ** Definicion : " + ctx.getText());        
        System.out.println("   --> hijos = " + ctx.getChildCount());        
        return super.visitDefinicion(ctx);
    }
    

    // @Override
    // public String visitTerminal(TerminalNode node) {
    //     System.out.println("  --> token = " + node.getText());
    //     return super.visitTerminal(node);
    // }
    
}