/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raymundoquintanilla_24112025;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        GrafoRecursivo grafo = new GrafoRecursivo(4);
        
        grafo.insertarNodo('A');//INDICE 0
        grafo.insertarNodo('B');//INDICE 1
        grafo.insertarNodo('C');//INDICE 2
        grafo.insertarNodo('D');//INDICE 3
        //grafo.insertarNodo('A');
        
        grafo.conectar(0, 1);//(a,b)
        grafo.conectar(0, 2);//(a,c)
        grafo.conectar(1, 3);//(b,d)
        grafo.conectar(2, 3);//(c,d)
        
        System.out.println("recorrido  Depth First Search (DFS) desde el nodo A");
        
        grafo.dfs(0);
        //segun teoria el recorrido es:
        //visita nodo A, luego visita nodo B (este seria el primer adyacente de a)
        //luego visita D (que seria el adyacente de B)
        //luego retrocede (vuelve a la raiz) y visita C (que seria el adyacente no visitado de A)
    }    
}
