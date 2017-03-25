using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WCF_Admi.admin;

namespace buscaHoteles.adminitrador
{
    public partial class admin : System.Web.UI.Page
    {
        Metodos m = new Metodos();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        #region Inserts
        protected void insert_disco_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 1;
        }

        protected void insert_fuente_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 2;
        }

        protected void insert_pantalla_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 3;
        }

        protected void insert_procesador_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 4;
        }

        protected void insert_ram_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 5;
        }

        protected void insert_tarjeta_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 6;
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            if (txt_nombre.Text != "" & txt_descripcion.Text != "" & txt_cantidad.Text != "" & txt_precio.Text != "")
                lbl_result.Text = m.insert_disco(txt_nombre.Text, txt_descripcion.Text, Convert.ToInt32(txt_cantidad.Text), Convert.ToInt32(txt_precio.Text));
            else
                lbl_result.Text = "Ingrese todos los campos";

            txt_nombre.Text = null;
            txt_descripcion.Text = null;
            txt_cantidad.Text = null;
            txt_precio.Text = null;
        }

        protected void btn_fuente_Click(object sender, EventArgs e)
        {
            if (txt_nombre0.Text != "" & txt_descripcion0.Text != "" & txt_cantidad0.Text != "" & txt_precio0.Text != "")
                lbl_result0.Text = m.insert_fuente(txt_nombre0.Text, txt_descripcion0.Text, Convert.ToInt32(txt_cantidad0.Text), Convert.ToInt32(txt_precio0.Text));
            else
                lbl_result0.Text = "Ingrese todos los campos";

            txt_nombre0.Text = null;
            txt_descripcion0.Text = null;
            txt_cantidad0.Text = null;
            txt_precio0.Text = null;
        }

        protected void btn_pantalla_Click(object sender, EventArgs e)
        {
            if (txt_nombre1.Text != "" & txt_descripcion1.Text != "" & txt_cantidad1.Text != "" & txt_precio1.Text != "")
                lbl_result1.Text = m.insert_psntalla(txt_nombre1.Text, txt_descripcion1.Text, Convert.ToInt32(txt_cantidad1.Text), Convert.ToInt32(txt_precio1.Text));
            else
                lbl_result1.Text = "Ingrese todos los campos";

            txt_nombre1.Text = null;
            txt_descripcion1.Text = null;
            txt_cantidad1.Text = null;
            txt_precio1.Text = null;
        }

        protected void btn_procesador_Click(object sender, EventArgs e)
        {
            if (txt_nombre2.Text != "" & txt_descripcion2.Text != "" & txt_cantidad2.Text != "" & txt_precio2.Text != "")
                lbl_result2.Text = m.insert_procesador(txt_nombre2.Text, txt_descripcion2.Text, Convert.ToInt32(txt_cantidad2.Text), Convert.ToInt32(txt_precio2.Text));
            else
                lbl_result2.Text = "Ingrese todos los campos";

            txt_nombre2.Text = null;
            txt_descripcion2.Text = null;
            txt_cantidad2.Text = null;
            txt_precio2.Text = null;
        }

        protected void btn_ram_Click(object sender, EventArgs e)
        {
            if (txt_nombre3.Text != "" & txt_descripcion3.Text != "" & txt_cantidad3.Text != "" & txt_precio3.Text != "")
                lbl_result3.Text = m.insert_ram(txt_nombre3.Text, txt_descripcion3.Text, Convert.ToInt32(txt_cantidad3.Text), Convert.ToInt32(txt_precio3.Text));
            else
                lbl_result3.Text = "Ingrese todos los campos";

            txt_nombre3.Text = null;
            txt_descripcion3.Text = null;
            txt_cantidad3.Text = null;
            txt_precio3.Text = null;
        }

        protected void btn_tarjeta_Click(object sender, EventArgs e)
        {
            if (txt_nombre4.Text != "" & txt_descripcion4.Text != "" & txt_cantidad4.Text != "" & txt_precio4.Text != "")
                lbl_result4.Text = m.insert_tajeta(txt_nombre4.Text, txt_descripcion4.Text, Convert.ToInt32(txt_cantidad4.Text), Convert.ToInt32(txt_precio4.Text));
            else
                lbl_result4.Text = "Ingrese todos los campos";

            txt_nombre4.Text = null;
            txt_descripcion4.Text = null;
            txt_cantidad4.Text = null;
            txt_precio4.Text = null;
        }
        #endregion

        #region Updates
        protected void update_dusco_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 7;
        }

        protected void update_fuente_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 8;
        }

        protected void update_pantalla_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 9;
        }

        protected void update_procesador_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 10;
        }

        protected void update_ram_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 11;
        }

        protected void update_tarjeta_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 12;
        }

        protected void btn_u_disco_Click(object sender, EventArgs e)
        {
        
            if (txt_u_id.Text != "" & txt_u_nombre.Text != "" & txt_u_descripcion.Text != "" & txt_u_cantidad.Text != "" & txt_u_precio.Text != "")
                Label1.Text = m.update_disco(Convert.ToInt32(txt_u_id.Text), txt_u_nombre.Text, txt_u_descripcion.Text, Convert.ToInt32(txt_u_cantidad.Text), Convert.ToInt32(txt_u_precio.Text));
            else
                Label1.Text = "Ingrese todos los campos";

            txt_nombre.Text = null;
            txt_descripcion.Text = null;
            txt_cantidad.Text = null;
            txt_precio.Text = null;
        }

        protected void btn_u_fuente_Click(object sender, EventArgs e)
        {
            if (txt_u_id0.Text != "" & txt_u_nombre0.Text != "" & txt_u_descripcion0.Text != "" & txt_u_cantidad0.Text != "" & txt_u_precio0.Text != "")
                Label2.Text = m.update_fuente(Convert.ToInt32(txt_u_id0.Text), txt_u_nombre0.Text, txt_u_descripcion0.Text, Convert.ToInt32(txt_u_cantidad0.Text), Convert.ToInt32(txt_u_precio0.Text));
            else
                Label2.Text = "Ingrese todos los campos";

            txt_nombre0.Text = null;
            txt_descripcion0.Text = null;
            txt_cantidad0.Text = null;
            txt_precio0.Text = null;
        }

        protected void btn_u_pantalla_Click(object sender, EventArgs e)
        {
            if (txt_u_id1.Text != "" & txt_u_nombre1.Text != "" & txt_u_descripcion1.Text != "" & txt_u_cantidad1.Text != "" & txt_u_precio1.Text != "")
                Label3.Text = m.update_disco(Convert.ToInt32(txt_u_id1.Text), txt_u_nombre1.Text, txt_u_descripcion1.Text, Convert.ToInt32(txt_u_cantidad1.Text), Convert.ToInt32(txt_u_precio1.Text));
            else
                Label3.Text = "Ingrese todos los campos";

            txt_nombre1.Text = null;
            txt_descripcion1.Text = null;
            txt_cantidad1.Text = null;
            txt_precio1.Text = null;
        }

        protected void btn_u_procesador_Click(object sender, EventArgs e)
        {
            if (txt_u_id2.Text != "" & txt_u_nombre2.Text != "" & txt_u_descripcion2.Text != "" & txt_u_cantidad2.Text != "" & txt_u_precio2.Text != "")
                Label3.Text = m.update_disco(Convert.ToInt32(txt_u_id2.Text), txt_u_nombre2.Text, txt_u_descripcion2.Text, Convert.ToInt32(txt_u_cantidad2.Text), Convert.ToInt32(txt_u_precio2.Text));
            else
                Label3.Text = "Ingrese todos los campos";

            txt_nombre2.Text = null;
            txt_descripcion2.Text = null;
            txt_cantidad2.Text = null;
            txt_precio2.Text = null;
        }

        protected void btn_u_ram_Click(object sender, EventArgs e)
        {
            if (txt_u_id3.Text != "" & txt_u_nombre3.Text != "" & txt_u_descripcion3.Text != "" & txt_u_cantidad3.Text != "" & txt_u_precio3.Text != "")
                Label4.Text = m.update_disco(Convert.ToInt32(txt_u_id3.Text), txt_u_nombre3.Text, txt_u_descripcion3.Text, Convert.ToInt32(txt_u_cantidad3.Text), Convert.ToInt32(txt_u_precio3.Text));
            else
                Label4.Text = "Ingrese todos los campos";

            txt_nombre3.Text = null;
            txt_descripcion3.Text = null;
            txt_cantidad3.Text = null;
            txt_precio3.Text = null;
        }

        protected void btn_u_tarjeta_Click(object sender, EventArgs e)
        {
            if (txt_u_id4.Text != "" & txt_u_nombre4.Text != "" & txt_u_descripcion4.Text != "" & txt_u_cantidad4.Text != "" & txt_u_precio4.Text != "")
                Label5.Text = m.update_disco(Convert.ToInt32(txt_u_id4.Text), txt_u_nombre4.Text, txt_u_descripcion4.Text, Convert.ToInt32(txt_u_cantidad4.Text), Convert.ToInt32(txt_u_precio4.Text));
            else
                Label5.Text = "Ingrese todos los campos";

            txt_nombre4.Text = null;
            txt_descripcion4.Text = null;
            txt_cantidad4.Text = null;
            txt_precio4.Text = null;
        }

        #endregion

        #region Deletes

        protected void delete_disco_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 13;
        }

        protected void delete_fuente_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 14;
        }

        protected void delete_pantalla_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 15;
        }

        protected void delete_procesador_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 16;
        }

        protected void delete_ram_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 17;
        }

        protected void delete_tarjeta_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 18;
        }

        protected void btn_b_disco_Click(object sender, EventArgs e)
        {
            if (txt_d_disco.Text != "")
                Label7.Text = m.delete_disco(Convert.ToInt32(txt_d_disco.Text));
            else
                Label7.Text = "Ingrese todos los campos";

            txt_d_disco.Text = null;
        }

        protected void btn_b_fuente_Click(object sender, EventArgs e)
        {
            if (txt_d_fuente.Text != "")
                Label8.Text = m.delete_fuente(Convert.ToInt32(txt_d_fuente.Text));
            else
                Label8.Text = "Ingrese todos los campos";

            txt_d_disco.Text = null;
        }

        protected void btn_b_pantalla_Click(object sender, EventArgs e)
        {
            if (txt_d_pantalla.Text != "")
                Label9.Text = m.delete_pantalla(Convert.ToInt32(txt_d_pantalla.Text));
            else
                Label9.Text = "Ingrese todos los campos";

            txt_d_pantalla.Text = null;
        }

        protected void btn_b_prosesador_Click(object sender, EventArgs e)
        {
            if (txt_d_procesador.Text != "")
                Label10.Text = m.delete_procesador(Convert.ToInt32(txt_d_procesador.Text));
            else
                Label10.Text = "Ingrese todos los campos";

            txt_d_procesador.Text = null;
        }

        protected void btn_b_ram_Click(object sender, EventArgs e)
        {
            if (txt_d_ram.Text != "")
                Label11.Text = m.delete_ram(Convert.ToInt32(txt_d_ram.Text));
            else
                Label11.Text = "Ingrese todos los campos";

            txt_d_ram.Text = null;
        }

        protected void btn_b_tarjeta_Click(object sender, EventArgs e)
        {
            if (txt_d_tarjeta.Text != "")
                Label12.Text = m.delete_tarjeta(Convert.ToInt32(txt_d_tarjeta.Text));
            else
                Label12.Text = "Ingrese todos los campos";

            txt_d_tarjeta.Text = null;
        }

        #endregion

    }
}