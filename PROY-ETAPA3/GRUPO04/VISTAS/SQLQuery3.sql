USE [EduTec]
GO

/****** Object:  View [dbo].[V_AlumnoR]    Script Date: 12/4/2017 9:00:49 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[V_AlumnoR](codigo, apellidos, nombre, direccion,telefono,email,clave) as
select all * from Alumno
GO


