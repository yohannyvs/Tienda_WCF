<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="admin.aspx.cs" Inherits="buscaHoteles.adminitrador.admin" %>

<!DOCTYPE html>
<html lang="es">
<head>
	
	<!-- start: Meta -->
	<meta charset="utf-8">
	<title>Bootstrap Metro Dashboard by Dennis Ji for ARM demo</title>
	<meta name="description" content="Bootstrap Metro Dashboard">
	<meta name="author" content="Dennis Ji">
	<meta name="keyword" content="Metro, Metro UI, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
	<!-- end: Meta -->
	
	<!-- start: Mobile Specific -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- end: Mobile Specific -->
	
	<!-- start: CSS -->
	<link id="bootstrap-style" href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/bootstrap-responsive.min.css" rel="stylesheet">
	<link id="base-style" href="css/style.css" rel="stylesheet">
	<link id="base-style-responsive" href="css/style-responsive.css" rel="stylesheet">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
	<!-- end: CSS -->
	

	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	  	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<link id="ie-style" href="css/ie.css" rel="stylesheet">
	<![endif]-->
	
	<!--[if IE 9]>
		<link id="ie9style" href="css/ie9.css" rel="stylesheet">
	<![endif]-->
		
	<!-- start: Favicon -->
	<link rel="shortcut icon" href="img/favicon.ico">
	<!-- end: Favicon -->
	
		
		
		
</head>

<body>
		<form id="form1" runat="server">
		<!-- start: Header -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>
				<a class="brand" href="admin.aspx"><span>Principal</span></a>
								
				<!-- start: Header Menu -->
				<div class="nav-no-collapse header-nav">
					<ul class="nav pull-right">
						
				
						</li>
						<!-- start: Notifications Dropdown -->
						<li class="dropdown hidden-phone">
							<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
								<i class="halflings-icon white tasks"></i>
							</a>
				           <!--menu de barras de progreso-->
							
							
							 <!--menu de barras de progreso-->
						</li>
						<!-- end: Notifications Dropdown -->
						<!-- start: Message Dropdown -->
						
						<!-- end: Message Dropdown -->
						<li>
							<a class="btn" href="#">
								<i class="halflings-icon white wrench"></i>
							</a>
						</li>
						
						
						<!-- Inicio de  menu de conexion de usuario modificar para acceder con variable de entorno-->
						<li class="dropdown">
							<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
								<i class="halflings-icon white user"></i> Administrador
								<span class="caret"></span>
							</a>
							<ul class="dropdown-menu">
								<li class="dropdown-menu-title">
 									<span>Account Settings</span>
								</li>
								<li><a href="login.html"><i class="halflings-icon off"></i> Logout</a></li>
							</ul>
						</li>
						<!-- Final de Menu de Conexion -->
					</ul>
				</div>
				<!-- end: Header Menu -->
				
			</div>
		</div>

	<!-- start: Header -->
	
		<div class="container-fluid-full">
		<div class="row-fluid">
				
				<!-- Inicio  del menu lateral  -->
		
				<!-- start: Main Menu -->
			<div id="sidebar-left" class="span2">
				<div class="nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
                           <ul>
                               <div class="container">
  <div class="panel-group" id="accordion">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Insert</a>
        </h4>
      </div>
      <div id="collapse1" class="panel-collapse collapse">
        <div class="panel-body">
            <ul>
                <asp:LinkButton ID="insert_disco" runat="server" OnClick="insert_disco_Click">Discos Duros</asp:LinkButton>
                <asp:LinkButton ID="insert_fuente" runat="server" OnClick="insert_fuente_Click">Fuentes de Poder</asp:LinkButton>
                <asp:LinkButton ID="insert_pantalla" runat="server" OnClick="insert_pantalla_Click">Pantallas</asp:LinkButton>
                <asp:LinkButton ID="insert_procesador" runat="server" OnClick="insert_procesador_Click">Procesadores</asp:LinkButton>
                <asp:LinkButton ID="insert_ram" runat="server" OnClick="insert_ram_Click">Memoria RAM</asp:LinkButton>
                <asp:LinkButton ID="insert_tarjeta" runat="server" OnClick="insert_tarjeta_Click">Tarjetas Madre</asp:LinkButton>
            </ul>
        </div>
      </div>
    </div>
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Update</a>
        </h4>
      </div>
      <div id="collapse2" class="panel-collapse collapse">
        <div class="panel-body">
            <ul>
                <asp:LinkButton ID="update_dusco" runat="server" OnClick="update_dusco_Click">Discos Duros</asp:LinkButton>
                <asp:LinkButton ID="update_fuente" runat="server" OnClick="update_fuente_Click">Fuentes de Poder</asp:LinkButton>
                <asp:LinkButton ID="update_pantalla" runat="server" OnClick="update_pantalla_Click">Pantallas</asp:LinkButton>
                <asp:LinkButton ID="update_procesador" runat="server" OnClick="update_procesador_Click">Procesadores</asp:LinkButton>
                <asp:LinkButton ID="update_ram" runat="server" OnClick="update_ram_Click">Memoria RAM</asp:LinkButton>
                <asp:LinkButton ID="update_tarjeta" runat="server" OnClick="update_tarjeta_Click">Tarjetas Madre</asp:LinkButton>
            </ul>
        </div>
      </div>
    </div>
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">Delete</a>
        </h4>
      </div>
      <div id="collapse3" class="panel-collapse collapse">
        <div class="panel-body">
            <ul>
                <asp:LinkButton ID="delete_disco" runat="server" OnClick="delete_disco_Click">Discos Duros</asp:LinkButton>
                <asp:LinkButton ID="delete_fuente" runat="server" OnClick="delete_fuente_Click">Fuentes de Poder</asp:LinkButton>
                <asp:LinkButton ID="delete_pantalla" runat="server" OnClick="delete_pantalla_Click">Pantallas</asp:LinkButton>
                <asp:LinkButton ID="delete_procesador" runat="server" OnClick="delete_procesador_Click">Procesadores</asp:LinkButton>
                <asp:LinkButton ID="delete_ram" runat="server" OnClick="delete_ram_Click">Memoria RAM</asp:LinkButton>
                <asp:LinkButton ID="delete_tarjeta" runat="server" OnClick="delete_tarjeta_Click">Tarjetas Madre</asp:LinkButton>
            </ul>
        </div>
      </div>
    </div>
  </div> 
  <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse4">-------</a>
        </h4>
      </div>
      <div id="collapse4" class="panel-collapse collapse">
        <div class="panel-body">------</div>
      </div>
    </div>
  </div> 
</div>
                           </ul>

					</ul>
				</div>
			</div>
			<!-- end: Main Menu -->
			<!-- Fin del menu -->
			
			
			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
				</div>
			</noscript>
			
			<!-- start: Content -->
			<div id="content" class="span10">
			
			
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
				</li>
			</ul>

		<!--Graficos para mostrar los datos del servidor  -->
	
                <asp:MultiView ID="MultiView1" runat="server" ActiveViewIndex="0">
                    <asp:View ID="Home" runat="server"></asp:View>
                    <asp:View ID="i_disco" runat="server">Nombre:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_nombre" runat="server"></asp:TextBox>
                        <br />
                        Descripción:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_descripcion" runat="server"></asp:TextBox>
                        <br />
                        Cantidad:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_cantidad" runat="server" TextMode="Number"></asp:TextBox>
                        <br />
                        Precio:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_precio" runat="server" TextMode="Number"></asp:TextBox>
                        <br />
                        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Ingresar" Width="111px" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="lbl_result" runat="server" Text="---------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="i_fuente" runat="server">Nombre:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_nombre0" runat="server"></asp:TextBox>
                        <br />
                        Descripción:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_descripcion0" runat="server"></asp:TextBox>
                        <br />
                        Cantidad:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_cantidad0" runat="server" TextMode="Number"></asp:TextBox>
                        <br />
                        Precio:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_precio0" runat="server" TextMode="Number"></asp:TextBox>
                        <br />
                        <asp:Button ID="btn_fuente" runat="server" Text="Ingresar" Width="111px" OnClick="btn_fuente_Click" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="lbl_result0" runat="server" Text="---------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="i_pantalla" runat="server">Nombre:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_nombre1" runat="server"></asp:TextBox>
                        <br />
                        Descripción:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_descripcion1" runat="server"></asp:TextBox>
                        <br />
                        Cantidad:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_cantidad1" runat="server" TextMode="Number"></asp:TextBox>
                        <br />
                        Precio:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_precio1" runat="server" TextMode="Number"></asp:TextBox>
                        <br />
                        <asp:Button ID="btn_pantalla" runat="server" Text="Ingresar" Width="111px" OnClick="btn_pantalla_Click" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="lbl_result1" runat="server" Text="---------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="i_procesador" runat="server">Nombre:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_nombre2" runat="server"></asp:TextBox>
                        <br />
                        Descripción:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_descripcion2" runat="server"></asp:TextBox>
                        <br />
                        Cantidad:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_cantidad2" runat="server" TextMode="Number"></asp:TextBox>
                        <br />
                        Precio:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_precio2" runat="server" TextMode="Number"></asp:TextBox>
                        <br />
                        <asp:Button ID="btn_procesador" runat="server" Text="Ingresar" Width="111px" OnClick="btn_procesador_Click" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="lbl_result2" runat="server" Text="---------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="i_ram" runat="server">Nombre:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_nombre3" runat="server"></asp:TextBox>
                        <br />
                        Descripción:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_descripcion3" runat="server"></asp:TextBox>
                        <br />
                        Cantidad:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_cantidad3" runat="server" TextMode="Number"></asp:TextBox>
                        <br />
                        Precio:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_precio3" runat="server" TextMode="Number"></asp:TextBox>
                        <br />
                        <asp:Button ID="btn_ram" runat="server" Text="Ingresar" Width="111px" OnClick="btn_ram_Click" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="lbl_result3" runat="server" Text="---------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="i_tarjeta" runat="server">Nombre:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_nombre4" runat="server"></asp:TextBox>
                        <br />
                        Descripción:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_descripcion4" runat="server"></asp:TextBox>
                        <br />
                        Cantidad:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_cantidad4" runat="server" TextMode="Number"></asp:TextBox>
                        <br />
                        Precio:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_precio4" runat="server" TextMode="Number"></asp:TextBox>
                        <br />
                        <asp:Button ID="btn_tarjeta" runat="server" Text="Ingresar" Width="111px" OnClick="btn_tarjeta_Click" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="lbl_result4" runat="server" Text="---------------"></asp:Label>
                    </asp:View>

                    <asp:View ID="u_disco" runat="server">ID:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_id" runat="server"></asp:TextBox>
                        <br />
                        Nombre:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_nombre" runat="server"></asp:TextBox>
                        <br />
                        Descripción:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_descripcion" runat="server"></asp:TextBox>
                        <br />
                        Cantidad:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_cantidad" runat="server"></asp:TextBox>
                        <br />
                        Precio:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_precio" runat="server"></asp:TextBox>
                        <br />
&nbsp;
                        <asp:Button ID="btn_u_disco" runat="server" OnClick="btn_u_disco_Click" Text="Actualizar" Width="118px" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="Label1" runat="server" Text="------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="u_fuente" runat="server">ID:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_id0" runat="server"></asp:TextBox>
                        <br />
                        Nombre:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_nombre0" runat="server"></asp:TextBox>
                        <br />
                        Descripción:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_descripcion0" runat="server"></asp:TextBox>
                        <br />
                        Cantidad:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_cantidad0" runat="server"></asp:TextBox>
                        <br />
                        Precio:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_precio0" runat="server"></asp:TextBox>
                        <br />
                        &nbsp;
                        <asp:Button ID="btn_u_fuente" runat="server" Text="Actualizar" Width="118px" OnClick="btn_u_fuente_Click" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="Label2" runat="server" Text="------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="u_pantalla" runat="server">ID:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_id1" runat="server"></asp:TextBox>
                        <br />
                        Nombre:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_nombre1" runat="server"></asp:TextBox>
                        <br />
                        Descripción:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_descripcion1" runat="server"></asp:TextBox>
                        <br />
                        Cantidad:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_cantidad1" runat="server"></asp:TextBox>
                        <br />
                        Precio:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_precio1" runat="server"></asp:TextBox>
                        <br />
                        &nbsp;
                        <asp:Button ID="btn_u_pantalla" runat="server" Text="Actualizar" Width="118px" OnClick="btn_u_pantalla_Click" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="Label3" runat="server" Text="------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="u_procesador" runat="server">ID:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_id2" runat="server"></asp:TextBox>
                        <br />
                        Nombre:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_nombre2" runat="server"></asp:TextBox>
                        <br />
                        Descripción:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_descripcion2" runat="server"></asp:TextBox>
                        <br />
                        Cantidad:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_cantidad2" runat="server"></asp:TextBox>
                        <br />
                        Precio:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_precio2" runat="server"></asp:TextBox>
                        <br />
                        &nbsp;
                        <asp:Button ID="btn_u_procesador" runat="server" Text="Actualizar" Width="118px" OnClick="btn_u_procesador_Click" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="Label4" runat="server" Text="------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="u_ram" runat="server">ID:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_id3" runat="server"></asp:TextBox>
                        <br />
                        Nombre:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_nombre3" runat="server"></asp:TextBox>
                        <br />
                        Descripción:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_descripcion3" runat="server"></asp:TextBox>
                        <br />
                        Cantidad:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_cantidad3" runat="server"></asp:TextBox>
                        <br />
                        Precio:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_precio3" runat="server"></asp:TextBox>
                        <br />
                        &nbsp;
                        <asp:Button ID="btn_u_ram" runat="server" Text="Actualizar" Width="118px" OnClick="btn_u_ram_Click" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="Label5" runat="server" Text="------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="u_tarjeta" runat="server">ID:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_id4" runat="server"></asp:TextBox>
                        <br />
                        Nombre:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_nombre4" runat="server"></asp:TextBox>
                        <br />
                        Descripción:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_descripcion4" runat="server"></asp:TextBox>
                        <br />
                        Cantidad:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_cantidad4" runat="server"></asp:TextBox>
                        <br />
                        Precio:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_u_precio4" runat="server"></asp:TextBox>
                        <br />
                        &nbsp;
                        <asp:Button ID="btn_u_tarjeta" runat="server" Text="Actualizar" Width="118px" OnClick="btn_u_tarjeta_Click" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="Label6" runat="server" Text="------------"></asp:Label>
                    </asp:View>

                    <asp:View ID="d_disco" runat="server">ID:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_d_disco" runat="server"></asp:TextBox>
                        <br />
                        <asp:Button ID="btn_b_disco" runat="server" OnClick="btn_b_disco_Click" Text="Eliminar" Width="102px" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="Label7" runat="server" Text="------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="d_fuente" runat="server">D:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_d_fuente" runat="server"></asp:TextBox>
                        <br />
                        <asp:Button ID="btn_b_fuente" runat="server" OnClick="btn_b_fuente_Click" Text="Eliminar" Width="102px" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="Label8" runat="server" Text="------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="d_pantalla" runat="server">D:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_d_pantalla" runat="server"></asp:TextBox>
                        <br />
                        <asp:Button ID="btn_b_pantalla" runat="server" OnClick="btn_b_pantalla_Click" Text="Eliminar" Width="102px" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="Label9" runat="server" Text="------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="d_procesador" runat="server">D:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_d_procesador" runat="server"></asp:TextBox>
                        <br />
                        <asp:Button ID="btn_b_prosesador" runat="server" OnClick="btn_b_prosesador_Click" Text="Eliminar" Width="102px" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="Label10" runat="server" Text="------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="d_ram" runat="server">D:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_d_ram" runat="server"></asp:TextBox>
                        <br />
                        <asp:Button ID="btn_b_ram" runat="server" OnClick="btn_b_ram_Click" Text="Elminar" Width="102px" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="Label11" runat="server" Text="------------"></asp:Label>
                    </asp:View>
                    <asp:View ID="d_tarjeta" runat="server">D:&nbsp;&nbsp;
                        <asp:TextBox ID="txt_d_tarjeta" runat="server"></asp:TextBox>
                        <br />
                        <asp:Button ID="btn_b_tarjeta" runat="server" OnClick="btn_b_tarjeta_Click" Text="Eliminar" Width="102px" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Label ID="Label12" runat="server" Text="------------"></asp:Label>
                    </asp:View>


                </asp:MultiView>	
                
    </form>
			<!--Graficos para mostrar los datos del servidor  -->
			
		   

	</div><!--/.fluid-container-->
	
			<!-- end: Content -->
		</div><!--/#content.span10-->
		</div><!--/fluid-row-->
		
	<div class="modal hide fade" id="myModal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">×</button>
			<h3>Settings</h3>
		</div>
		<div class="modal-body">
			<p>Here settings can be configured...</p>
		</div>
		<div class="modal-footer">
			<a href="#" class="btn" data-dismiss="modal">Close</a>
			<a href="#" class="btn btn-primary">Save changes</a>
		</div>
	</div>
	
	<div class="clearfix"></div>
	
	<footer>

		<p>
			<span style="text-align:left;float:left">&copy; 2016 <a href="#">Nombre del Equipo</a></span>
			
		</p>

	</footer>
	
	<!-- start: JavaScript-->

		<script src="js/jquery-1.9.1.min.js"></script>
	<script src="js/jquery-migrate-1.0.0.min.js"></script>
	
		<script src="js/jquery-ui-1.10.0.custom.min.js"></script>
	
		<script src="js/jquery.ui.touch-punch.js"></script>
	
		<script src="js/modernizr.js"></script>
	
		<script src="js/bootstrap.min.js"></script>
	
		<script src="js/jquery.cookie.js"></script>
	
		<script src='js/fullcalendar.min.js'></script>
	
		<script src='js/jquery.dataTables.min.js'></script>

		<script src="js/excanvas.js"></script>
	<script src="js/jquery.flot.js"></script>
	<script src="js/jquery.flot.pie.js"></script>
	<script src="js/jquery.flot.stack.js"></script>
	<script src="js/jquery.flot.resize.min.js"></script>
	
		<script src="js/jquery.chosen.min.js"></script>
	
		<script src="js/jquery.uniform.min.js"></script>
		
		<script src="js/jquery.cleditor.min.js"></script>
	
		<script src="js/jquery.noty.js"></script>
	
		<script src="js/jquery.elfinder.min.js"></script>
	
		<script src="js/jquery.raty.min.js"></script>
	
		<script src="js/jquery.iphone.toggle.js"></script>
	
		<script src="js/jquery.uploadify-3.1.min.js"></script>
	
		<script src="js/jquery.gritter.min.js"></script>
	
		<script src="js/jquery.imagesloaded.js"></script>
	
		<script src="js/jquery.masonry.min.js"></script>
	
		<script src="js/jquery.knob.modified.js"></script>
	
		<script src="js/jquery.sparkline.min.js"></script>
	
		<script src="js/counter.js"></script>
	
		<script src="js/retina.js"></script>

		<script src="js/custom.js"></script>
	<!-- end: JavaScript-->
	
        </form>
	
</body>
</html>
