﻿using System;
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
        int compra(string num_tarjeta, string fecha, string num_seguridad, string nom_disc, string nom_fuente, string nom_pantalla, string nom_procesador, string nom_ram, string nom_tarjeta, int precio);

        [OperationContract]
        int calcular_precio(string nom_disc, string nom_fuente, string nom_pantalla, string nom_procesador, string nom_ram, string nom_tarjeta);

        [OperationContract]
        int login(string id, string pass);

        [OperationContract]
        int delete_fuente(int id);

        [OperationContract]
        int delete_disco(int id);

        [OperationContract]
        int delete_pantalla(int id);

        [OperationContract]
        int delete_procesador(int id);

        [OperationContract]
        int delete_ram(int id);

        [OperationContract]
        int delete_tarjeta(int id);

        [OperationContract]
        int insert_disco(string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        int insert_fuente(string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        int insert_pantalla(string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        int insert_procesador(string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        int insert_ram(string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        int insert_tarjeta(string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        int update_disco(int id, string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        int update_fuente(int id, string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        int update_pantalla(int id, string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        int update_procesador(int id, string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        int update_ram(int id, string nombre, string descripcion, int cant, int precio);

        [OperationContract]
        int update_tarjeta(int id, string nombre, string descripcion, int cant, int precio);

        



        

    }
}
