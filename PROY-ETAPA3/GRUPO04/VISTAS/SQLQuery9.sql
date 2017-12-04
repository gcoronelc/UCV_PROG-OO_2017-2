USE [EduTec]
GO

/****** Object:  View [dbo].[V_Muestra]    Script Date: 12/4/2017 9:02:41 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[V_Muestra](codigoAlumno,alumno) as
select mat.IdAlumno,(alum.ApeAlumno +', '+ alum.NomAlumno) from Matricula mat inner join Alumno alum on mat.IdAlumno = alum.IdAlumno
GO


