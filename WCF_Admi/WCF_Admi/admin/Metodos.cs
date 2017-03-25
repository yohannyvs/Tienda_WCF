using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WCF_Admi.admin
{
    public class Metodos
    {
        #region Inserts
        public string insert_disco(string nombre, string descripcion, int cant, int precio)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj=null;
            int result;

            result = p.insert_disco(nombre, descripcion, cant, precio);

            if (result == 2)
                msj = "Articulo ya existe";

            if (result == 1)
                msj = "Articulo ingresado con exito";

            return msj;
        }

        public string insert_fuente(string nombre, string descripcion, int cant, int precio)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.insert_fuente(nombre, descripcion, cant, precio);

            if (result == 2)
                msj = "Articulo ya existe";

            if (result == 1)
                msj = "Articulo ingresado con exito";

            return msj;
        }

        public string insert_psntalla(string nombre, string descripcion, int cant, int precio)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.insert_pantalla(nombre, descripcion, cant, precio);

            if (result == 2)
                msj = "Articulo ya existe";

            if (result == 1)
                msj = "Articulo ingresado con exito";

            return msj;
        }

        public string insert_procesador(string nombre, string descripcion, int cant, int precio)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.insert_procesador(nombre, descripcion, cant, precio);

            if (result == 2)
                msj = "Articulo ya existe";

            if (result == 1)
                msj = "Articulo ingresado con exito";

            return msj;
        }

        public string insert_ram(string nombre, string descripcion, int cant, int precio)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.insert_ram(nombre, descripcion, cant, precio);

            if (result == 2)
                msj = "Articulo ya existe";

            if (result == 1)
                msj = "Articulo ingresado con exito";

            return msj;
        }

        public string insert_tajeta(string nombre, string descripcion, int cant, int precio)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.insert_tarjeta(nombre, descripcion, cant, precio);

            if (result == 2)
                msj = "Articulo ya existe";

            if (result == 1)
                msj = "Articulo ingresado con exito";

            return msj;
        }
        #endregion

        #region Updates

        public string update_disco(int id, string nombre, string descripcion, int cant, int precio)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.update_disco(id, nombre, descripcion, cant, precio);

            if (result == 2)
                msj = "Error al actualizar";

            if (result == 1)
                msj = "Articulo actualizado con exito";

            return msj;
        }

        public string update_fuente(int id, string nombre, string descripcion, int cant, int precio)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.update_fuente(id, nombre, descripcion, cant, precio);

            if (result == 2)
                msj = "Error al actualizar";

            if (result == 1)
                msj = "Articulo actualizado con exito";

            return msj;
        }

        public string update_pantalla(int id, string nombre, string descripcion, int cant, int precio)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.update_pantalla(id, nombre, descripcion, cant, precio);

            if (result == 2)
                msj = "Error al actualizar";

            if (result == 1)
                msj = "Articulo actualizado con exito";

            return msj;
        }

        public string update_procesador(int id, string nombre, string descripcion, int cant, int precio)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.update_procesador(id, nombre, descripcion, cant, precio);

            if (result == 2)
                msj = "Error al actualizar";

            if (result == 1)
                msj = "Articulo actualizado con exito";

            return msj;
        }

        public string update_ram(int id, string nombre, string descripcion, int cant, int precio)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.update_ram(id, nombre, descripcion, cant, precio);

            if (result == 2)
                msj = "Error al actualizar";

            if (result == 1)
                msj = "Articulo actualizado con exito";

            return msj;
        }

        public string update_tarjeta(int id, string nombre, string descripcion, int cant, int precio)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.update_tarjeta(id, nombre, descripcion, cant, precio);

            if (result == 2)
                msj = "Error al actualizar";

            if (result == 1)
                msj = "Articulo actualizado con exito";

            return msj;
        }

        #endregion

        #region Deletes

        public string delete_disco(int id)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.delete_disco(id);

            if (result == 2)
                msj = "Error al borrar";

            if (result == 1)
                msj = "Articulo borrado con exito";

            return msj;
        }

        public string delete_fuente(int id)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.delete_fuente(id);

            if (result == 2)
                msj = "Error al borrar";

            if (result == 1)
                msj = "Articulo borrado con exito";

            return msj;
        }

        public string delete_pantalla(int id)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.delete_pantalla(id);

            if (result == 2)
                msj = "Error al borrar";

            if (result == 1)
                msj = "Articulo borrado con exito";

            return msj;
        }

        public string delete_procesador(int id)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.delete_procesador(id);

            if (result == 2)
                msj = "Error al borrar";

            if (result == 1)
                msj = "Articulo borrado con exito";

            return msj;
        }

        public string delete_ram(int id)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.delete_ram(id);

            if (result == 2)
                msj = "Error al borrar";

            if (result == 1)
                msj = "Articulo borrado con exito";

            return msj;
        }

        public string delete_tarjeta(int id)
        {
            Proxy.Service1Client p = new Proxy.Service1Client();
            string msj = null;
            int result;

            result = p.delete_tarjeta(id);

            if (result == 2)
                msj = "Error al borrar";

            if (result == 1)
                msj = "Articulo borrado con exito";

            return msj;
        }

        #endregion
    }
}