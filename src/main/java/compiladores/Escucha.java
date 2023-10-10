package compiladores;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.compiladoresParser.AsignacionContext;
import compiladores.compiladoresParser.ProgramaContext;

public class Escucha extends compiladoresBaseListener {

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        System.out.println("Comienza compilacion");
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        System.out.println("FIN compilacion");
    }

    @Override
    public void enterAsignacion(AsignacionContext ctx) {
    }

    @Override
    public void exitAsignacion(AsignacionContext ctx) {
        System.out.println(" ++ Asignacion (in) Hijos = " + ctx.getChildCount()
                          + ": "+ ctx.getText() );
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // System.out.println("\tToken --> " + node.getText());
    }
    
}
