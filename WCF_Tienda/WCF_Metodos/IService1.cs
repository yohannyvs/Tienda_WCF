using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace WCF_Metodos
{
    [ServiceContract]
    public interface IService1
    {
        [OperationContract]
        void compra(string num_tarjeta, string fecha, string num_seguridad, string nom_disc, string nom_fuente, string nom_pantalla, string nom_procesador, string nom_ram, string nom_tarjeta, int precio);

        [OperationContract]
        void calcular_precio(string nom_disc, string nom_fuente, string nom_pantalla, string nom_procesador, string nom_ram, string nom_tarjeta);

        [OperationContract]
        void login(string id, string pass);

        [OperationContract]
        void delete_fuente(int id);

        [OperationContract]
        void delete_disco(int id);

        [OperationContract]
        void delete_pantalla(int id);

        [OperationContract]
        void delete_procesador(int id);

        [OperationContract]
        void delete_ram(int id);

        [OperationContract]
        void delete_tarjeta(int id);

        [OperationContract]
        void insert_disco(string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        void insert_fuente(string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        void insert_pantalla(string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        void insert_procesador(string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        void insert_ram(string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        void insert_tarjeta(string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        void update_disco(int id, string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        void update_fuente(int id, string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        void update_pantalla(int id, string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        void update_procesador(int id, string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        void update_ram(int id, string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        void update_tarjeta(int id, string nombre, string descripcion, int cant, int precio);

    }
}
