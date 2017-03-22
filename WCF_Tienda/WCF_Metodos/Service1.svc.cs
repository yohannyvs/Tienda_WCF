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

        public void compra(string num_tarjeta, string fecha, string num_seguridad, string nom_disc, string nom_fuente, string nom_pantalla, string nom_procesador, string nom_ram, string nom_tarjeta, int precio)
        {
            Datos.compra(num_tarjeta, fecha, num_seguridad, nom_disc, nom_fuente, nom_pantalla, nom_procesador, nom_ram, nom_tarjeta, precio);
        }

        public void calcular_precio(string nom_disc, string nom_fuente, string nom_pantalla, string nom_procesador, string nom_ram, string nom_tarjeta)
        {
            Datos.calcular_precio(nom_disc, nom_fuente, nom_pantalla, nom_procesador, nom_ram, nom_tarjeta);
        }

        public void login(string id, string pass)
        {
            Datos.login(id, pass);
        }

        #endregion

        #region Delete

        public void delete_fuente(int id)
        {
            Datos.delete_fuente(id);
        }

        public void delete_disco(int id)
        {
            Datos.delete_disco(id);
        }

        public void delete_pantalla(int id)
        {
            Datos.delete_pantalla(id);
        }

        public void delete_procesador(int id)
        {
            Datos.delete_procesador(id);
        }

        public void delete_ram(int id)
        {
            Datos.delete_ram(id);
        }

        public void delete_tarjeta(int id)
        {
            Datos.delete_tarjeta(id);
        }

        #endregion

        #region Insert

        public void insert_disco(string nombre, string descripcion, int cant, int precio)
        {
            Datos.insert_disco(nombre, descripcion, cant, precio);
        }

        public void insert_fuente(string nombre, string descripcion, int cant, int precio)
        {
            Datos.insert_fuente(nombre, descripcion, cant, precio);
        }

        public void insert_pantalla(string nombre, string descripcion, int cant, int precio)
        {
            Datos.insert_pantalla(nombre, descripcion, cant, precio);
        }

        public void insert_procesador(string nombre, string descripcion, int cant, int precio)
        {
            Datos.insert_procesador(nombre, descripcion, cant, precio);
        }

        public void insert_ram(string nombre, string descripcion, int cant, int precio)
        {
            Datos.insert_ram(nombre, descripcion, cant, precio);
        }

        public void insert_tarjeta(string nombre, string descripcion, int cant, int precio)
        {
            Datos.insert_tarjeta(nombre, descripcion, cant, precio);
        }

        #endregion

        #region Update

        public void update_disco(int id, string nombre, string descripcion, int cant, int precio)
        {
            Datos.update_disco(id, nombre, descripcion, cant, precio);
        }

        public void update_fuente(int id, string nombre, string descripcion, int cant, int precio)
        {
            Datos.update_fuente(id, nombre, descripcion, cant, precio);
        }

        public void update_pantalla(int id, string nombre, string descripcion, int cant, int precio)
        {
            Datos.update_pantalla(id, nombre, descripcion, cant, precio);
        }

        public void update_procesador(int id, string nombre, string descripcion, int cant, int precio)
        {
            Datos.update_procesador(id, nombre, descripcion, cant, precio);
        }

        public void update_ram(int id, string nombre, string descripcion, int cant, int precio)
        {
            Datos.update_ram(id, nombre, descripcion, cant, precio);
        }

        public void update_tarjeta(int id, string nombre, string descripcion, int cant, int precio)
        {
            Datos.update_tarjeta(id, nombre, descripcion, cant, precio);
        }

        #endregion
    }
}
