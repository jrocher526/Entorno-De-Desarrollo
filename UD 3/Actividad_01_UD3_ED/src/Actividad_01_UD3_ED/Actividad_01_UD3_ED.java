/*
 * Para cambiar este encabezado de licencia, elige Encabezados de Licencia en las Propiedades del Proyecto.
 * Para cambiar este archivo de plantilla, elige Herramientas | Plantillas
 * y abre la plantilla en el editor.
 */
package Actividad_01_UD3_ED;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ana
 */
public class Actividad_01_UD3_ED 
{
    private static byte[] buffer = new byte[1000];
    private static String nombreArchivo = "fichero.dat";
    private static FileInputStream flujoEntrada = null;
    private static BufferedInputStream bufferEntrada = null;

    public static void inicializarArchivos() throws FileNotFoundException
    {
        flujoEntrada = new FileInputStream(nombreArchivo);
        bufferEntrada = new BufferedInputStream(flujoEntrada);
    }
    
    public static int mostrarTextoArchivo() throws IOException
    {
        int total = 0;
        int nLeidos = 0;
        while((nLeidos = flujoEntrada.read(buffer)) != -1) 
        {
            System.out.println(new String(buffer));
            total += nLeidos;
        }
        
        return total;
    }
    
    /**
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) 
    {        
        try 
        {
            inicializarArchivos();
            
            int total = mostrarTextoArchivo();           

            System.out.println("\nLeídos " + total + " bytes");
        }
        catch(IOException ex) 
        {
            System.out.println("Error -> " + ex.toString());                
        }
        finally 
        {
            try 
            {
                if( bufferEntrada != null && flujoEntrada != null )
                {
                    flujoEntrada.close();
                    bufferEntrada.close();
                }                
            } 
            catch (IOException ex) 
            {
                System.out.println("Error al cerrar el archivo -> " + ex.toString());
            }
        }
    }
    
}
