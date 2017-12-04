USE [EduTec]
GO

/****** Object:  View [dbo].[V_Alumno]    Script Date: 12/4/2017 9:00:32 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[V_Alumno](codigo, Alumno, direccion,telefono,email) as
select idAlumno, (NomAlumno + ApeAlumno), DirAlumno, TelAlumno, EmailAlumno from Alumno
GO


