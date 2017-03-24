SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE SF_disco
AS
BEGIN
	SET NOCOUNT ON;

    SELECT nombre, descripcion, precio from disco
END
GO
---------------------------------------------------
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE SF_fuente
AS
BEGIN
	SET NOCOUNT ON;

    SELECT nombre, descripcion, precio from fuente
END
GO
---------------------------------------------------
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE SF_pantalla
AS
BEGIN
	SET NOCOUNT ON;

    SELECT nombre, descripcion, precio from pantalla
END
GO
---------------------------------------------------
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE SF_procesador
AS
BEGIN
	SET NOCOUNT ON;

    SELECT nombre, descripcion, precio from procesador
END
GO
---------------------------------------------------
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE SF_ram
AS
BEGIN
	SET NOCOUNT ON;

    SELECT nombre, descripcion, precio from ram
END
GO
---------------------------------------------------
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE SF_tarjeta
AS
BEGIN
	SET NOCOUNT ON;

    SELECT nombre, descripcion, precio from tarjeta_madre
END
GO
---------------------------------------------------