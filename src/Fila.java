public class Fila {
    private int Fila;
    private static Fila instancia=null;
    public void ImprimeDocumento(){

    }
    public void RemoveDocumento(){

    }
    public void RemoveTodosDocumentos(){

    }

    public static Fila  getInstance(){
        if (instancia==null){
            instancia=Fila;
        }
        return instancia;
    }
}
