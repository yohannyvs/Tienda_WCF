using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using Data;

namespace WCF_Metodos
{
    // NOTA: puede usar el comando "Rename" del menú "Refactorizar" para cambiar el nombre de clase "Service1" en el código, en svc y en el archivo de configuración.
    // NOTE: para iniciar el Cliente de prueba WCF para probar este servicio, seleccione Service1.svc o Service1.svc.cs en el Explorador de soluciones e inicie la depuración.
    public class Service1 : IService1
    {
        tiendaDataContext Datos = new tiendaDataContext();

        #region Compra

        public int compra(string num_tarjeta, string fecha, string num_seguridad, string nom_disc, string nom_fuente, string nom_pantalla, string nom_procesador, string nom_ram, string nom_tarjeta, int precio)
        {
            int resultado;
            resultado =Datos.compra(num_tarjeta, fecha, num_seguridad, nom_disc, nom_fuente, nom_pantalla, nom_procesador, nom_ram, nom_tarjeta, precio);
            return resultado;
        }

        public int calcular_precio(string nom_disc, string nom_fuente, string nom_pantalla, string nom_procesador, string nom_ram, string nom_tarjeta)
        {
            int resultado;
            resultado = Datos.calcular_precio(nom_disc, nom_fuente, nom_pantalla, nom_procesador, nom_ram, nom_tarjeta);
            return resultado;
        }

        public int login(string id, string pass)
        {
            int resultado;
            resultado=Datos.login(id, pass);
            return resultado;
        }


        #endregion

        #region Delete

        public int delete_fuente(int id)
        {
            int resultado;
            resultado = Datos.delete_fuente(id);
            return resultado;
        }

        public int delete_disco(int id)
        {
            int resultado;
            resultado = Datos.delete_disco(id);
            return resultado;
        }

        public int delete_pantalla(int id)
        {
            int resultado;
            resultado = Datos.delete_pantalla(id);
            return resultado;
        }

        public int delete_procesador(int id)
        {
            int resultado;
            resultado = Datos.delete_procesador(id);
            return resultado;
        }

        public int delete_ram(int id)
        {
            int resultado;
            resultado = Datos.delete_ram(id);
            return resultado;

        }

        public int delete_tarjeta(int id)
        {
            int resultado;
            resultado = Datos.delete_tarjeta(id);
            return resultado;
        }

        #endregion

        #region Insert

        public int insert_disco(string nombre, string descripcion, int cant, int precio)
        {
            int resultado;
            resultado = Datos.insert_disco(nombre, descripcion, cant, precio);
            return resultado;
        }

        public int insert_fuente(string nombre, string descripcion, int cant, int precio)
        {
            int resultado;
            resultado = Datos.insert_fuente(nombre, descripcion, cant, precio);
            return resultado;
        }

        public int insert_pantalla(string nombre, string descripcion, int cant, int precio)
        {
            int resultado;
            resultado = Datos.insert_pantalla(nombre, descripcion, cant, precio);
            return resultado;
        }

        public int insert_procesador(string nombre, string descripcion, int cant, int precio)
        {
            int resultado;
            resultado = Datos.insert_procesador(nombre, descripcion, cant, precio);
            return resultado;
        }

        public int insert_ram(string nombre, string descripcion, int cant, int precio)
        {
            int resultado;
            resultado = Datos.insert_ram(nombre, descripcion, cant, precio);
            return resultado;
        }

        public int insert_tarjeta(string nombre, string descripcion, int cant, int precio)
        {
            int resultado;
            resultado = Datos.insert_tarjeta(nombre, descripcion, cant, precio);
            return resultado;
        }

        #endregion

        #region Update

        public int update_disco(int id, string nombre, string descripcion, int cant, int precio)
        {
            int resultado;
            resultado = Datos.update_disco(id, nombre, descripcion, cant, precio);
            return resultado;
        }

        public int update_fuente(int id, string nombre, string descripcion, int cant, int precio)
        {
            int resultado;
            resultado = Datos.update_fuente(id, nombre, descripcion, cant, precio);
            return resultado;
        }

        public int update_pantalla(int id, string nombre, string descripcion, int cant, int precio)
        {
            int resultado;
            resultado = Datos.update_pantalla(id, nombre, descripcion, cant, precio);
            return resultado;
        }

        public int update_procesador(int id, string nombre, string descripcion, int cant, int precio)
        {
            int resultado;
            resultado = Datos.update_procesador(id, nombre, descripcion, cant, precio);
            return resultado;
        }

        public int update_ram(int id, string nombre, string descripcion, int cant, int precio)
        {
            int resultado;
            resultado = Datos.update_ram(id, nombre, descripcion, cant, precio);
            return resultado;
        }

        public int update_tarjeta(int id, string nombre, string descripcion, int cant, int precio)
        {
            int resultado;
            resultado = Datos.update_tarjeta(id, nombre, descripcion, cant, precio);
            return resultado;
        }

        #endregion

        #region select Nombre

        public List<String> select_disco()
        {
            var res = Datos.select_disco();
            List<String> result = new List<string>();
            foreach (var nombre in res)
                result.Add(nombre.nombre);
            return result;
        }
        /*public string select_disco()
        {
            List<String> result = new List<string>();
            result = Datos.select_disco().ToList();
            string resultado="";
            foreach (var nombre in res)
                resultado = resultado + "/"+nombre;
            return resultado;
        }*/

        public List<string> select_fuente()
        {
            var res = Datos.select_fuente();
            List<String> result = new List<string>();
            foreach (var nombre in res)
                 result.Add(nombre.nombre);
            return result;
        }

        public List<string> select_pantalla()
        {
            var res = Datos.select_fuente();
            List<String> result = new List<string>();
            foreach (var nombre in res)
                result.Add(nombre.nombre);
            return result;
        }

        public List<string> select_procesador()
        {
            var res = Datos.select_fuente();
            List<String> result = new List<string>();
            foreach (var nombre in res)
                result.Add(nombre.nombre);
            return result;
        }

        public List<string> select_ram()
        {
            var res = Datos.select_fuente();
            List<String> result = new List<string>();
            foreach (var nombre in res)
                result.Add(nombre.nombre);
            return result;
        }

        public List<string> select_tarjeta()
        {
            var res = Datos.select_fuente();
            List<String> result = new List<string>();
            foreach (var nombre in res)
                result.Add(nombre.nombre);
            return result;
        }

        #endregion

        #region Select info

        public List<articulos> sf_disco()
        {
            List<articulos> lista = new List<articulos>();


            /*Tipo de dato que se crea en tiempo de ejecución*/
            var resultado = Datos.SF_disco();

            /*recorrer el resultado*/
            foreach (var Descripcion in resultado)
            {
                lista.Add(
                    new articulos(
                      Descripcion.nombre,
                      Descripcion.descripcion,
                      Convert.ToInt32(Descripcion.precio)
                    )
               );
            }
            return lista;
        }

        public List<articulos> sf_fuente()
        {
            List<articulos> lista = new List<articulos>();


            /*Tipo de dato que se crea en tiempo de ejecución*/
            var resultado = Datos.SF_fuente();

            /*recorrer el resultado*/
            foreach (var Descripcion in resultado)
            {
                lista.Add(
                    new articulos(
                      Descripcion.nombre,
                      Descripcion.descripcion,
                      Convert.ToInt32(Descripcion.precio)
                    )
               );
            }
            return lista;
        }

        public List<articulos> sf_pantalla()
        {
            List<articulos> lista = new List<articulos>();


            /*Tipo de dato que se crea en tiempo de ejecución*/
            var resultado = Datos.SF_pantalla();

            /*recorrer el resultado*/
            foreach (var Descripcion in resultado)
            {
                lista.Add(
                    new articulos(
                      Descripcion.nombre,
                      Descripcion.descripcion,
                      Convert.ToInt32(Descripcion.precio)
                    )
               );
            }
            return lista;
        }

        public List<articulos> sf_procesador()
        {
            List<articulos> lista = new List<articulos>();


            /*Tipo de dato que se crea en tiempo de ejecución*/
            var resultado = Datos.SF_procesador();

            /*recorrer el resultado*/
            foreach (var Descripcion in resultado)
            {
                lista.Add(
                    new articulos(
                      Descripcion.nombre,
                      Descripcion.descripcion,
                      Convert.ToInt32(Descripcion.precio)
                    )
               );
            }
            return lista;
        }

        public List<articulos> sf_ram()
        {
            List<articulos> lista = new List<articulos>();


            /*Tipo de dato que se crea en tiempo de ejecución*/
            var resultado = Datos.SF_ram();

            /*recorrer el resultado*/
            foreach (var Descripcion in resultado)
            {
                lista.Add(
                    new articulos(
                      Descripcion.nombre,
                      Descripcion.descripcion,
                      Convert.ToInt32(Descripcion.precio)
                    )
               );
            }
            return lista;
        }

        public List<articulos> sf_tarjeta()
        {
            List<articulos> lista = new List<articulos>();


            /*Tipo de dato que se crea en tiempo de ejecución*/
            var resultado = Datos.SF_tarjeta();

            /*recorrer el resultado*/
            foreach (var Descripcion in resultado)
            {
                lista.Add(
                    new articulos(
                      Descripcion.nombre,
                      Descripcion.descripcion,
                      Convert.ToInt32(Descripcion.precio)
                    )
               );
            }
            return lista;
        }

        #endregion
    }
}
