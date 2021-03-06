USE [master]
GO
/****** Object:  Database [tienda]    Script Date: 03/20/2017 13:30:04 ******/
CREATE DATABASE [tienda] ON  PRIMARY 
( NAME = N'tienda', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\tienda.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'tienda_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\tienda_log.LDF' , SIZE = 576KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [tienda] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [tienda].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [tienda] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [tienda] SET ANSI_NULLS OFF
GO
ALTER DATABASE [tienda] SET ANSI_PADDING OFF
GO
ALTER DATABASE [tienda] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [tienda] SET ARITHABORT OFF
GO
ALTER DATABASE [tienda] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [tienda] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [tienda] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [tienda] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [tienda] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [tienda] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [tienda] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [tienda] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [tienda] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [tienda] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [tienda] SET  ENABLE_BROKER
GO
ALTER DATABASE [tienda] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [tienda] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [tienda] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [tienda] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [tienda] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [tienda] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [tienda] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [tienda] SET  READ_WRITE
GO
ALTER DATABASE [tienda] SET RECOVERY FULL
GO
ALTER DATABASE [tienda] SET  MULTI_USER
GO
ALTER DATABASE [tienda] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [tienda] SET DB_CHAINING OFF
GO
USE [tienda]
GO
/****** Object:  Table [dbo].[usuario]    Script Date: 03/20/2017 13:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[usuario](
	[id_usuario] [varchar](25) NOT NULL,
	[pass] [varchar](50) NULL,
	[nombre] [varchar](50) NULL,
	[correo] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_usuario] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tarjeta_madre]    Script Date: 03/20/2017 13:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tarjeta_madre](
	[id_tarjeta] [int] NOT NULL,
	[nombre] [varchar](50) NULL,
	[descripcion] [varchar](100) NULL,
	[cantidad] [int] NULL,
	[precio] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_tarjeta] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ram]    Script Date: 03/20/2017 13:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ram](
	[id_ram] [int] NOT NULL,
	[nombre] [varchar](50) NULL,
	[descripcion] [varchar](100) NULL,
	[cantidad] [int] NULL,
	[precio] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_ram] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[procesador]    Script Date: 03/20/2017 13:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[procesador](
	[id_procesador] [int] NOT NULL,
	[nombre] [varchar](50) NULL,
	[descripcion] [varchar](100) NULL,
	[cantidad] [int] NULL,
	[precio] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_procesador] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[pantalla]    Script Date: 03/20/2017 13:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[pantalla](
	[id_pantalla] [int] NULL,
	[nombre] [varchar](50) NULL,
	[descripcion] [varchar](100) NULL,
	[cantidad] [int] NULL,
	[precio] [int] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[fuente]    Script Date: 03/20/2017 13:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[fuente](
	[id_fuente] [int] NOT NULL,
	[nombre] [varchar](50) NULL,
	[descripcion] [varchar](100) NULL,
	[cantidad] [int] NULL,
	[precio] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_fuente] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[disco]    Script Date: 03/20/2017 13:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[disco](
	[id_disco] [int] NOT NULL,
	[nombre] [varchar](50) NULL,
	[descripcion] [varchar](100) NULL,
	[cantidad] [int] NULL,
	[precio] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_disco] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[admin]    Script Date: 03/20/2017 13:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[admin](
	[id_admin] [varchar](25) NOT NULL,
	[pass] [varchar](50) NULL,
	[nombre] [varchar](50) NULL,
	[correo] [varchar](50) NULL,
 CONSTRAINT [PK_admin] PRIMARY KEY CLUSTERED 
(
	[id_admin] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
